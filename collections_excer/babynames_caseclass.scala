package lectures.part1Basics


import java.io.PrintWriter

import scala.io.Source
import java.io.File

object new_baby extends App{

  val gender = scala.io.StdIn.readLine()
  val year = scala.io.StdIn.readInt()


    case class babydetails(stateCode: String, gender: String, year: Int, name: String, occurence: Int)



  val readfile = new java.io.File("/Users/c_labbavaram/Documents/workspace/software_home/namesbystate").listFiles.toList.filter(x => x.getName.endsWith(".TXT"))

  val readeachfile = readfile.toList.flatMap(x => Source.fromFile(s"$x").getLines.toList)
    //.take(10)


   // val readeachfile1 = Source.fromFile("/Users/c_labbavaram/Documents/workspace/software_home/namesbystate/AK.TXT").getLines().toList

    val baby = readeachfile.map {
      x =>val s = x.split(",")
        babydetails(s(0), s(1), s(2).toInt, s(3), s(4).toInt)
    }

    //top 10 babynames in M/F category
    val res = baby.filter(x => x.gender == gender).groupBy(x => x.name)
      .mapValues(x => x.map(x => x.occurence).sum)
      .toList
      .sortBy(x => -x._2).take(10)
  res.foreach(println)

  //top 10 babynames in M/F category state wise

  val res2 = baby.filter(x => x.year == year).filter(x => x.gender == gender).groupBy(x => x.stateCode).mapValues(x => (x(0).name,x(0).occurence)).toList
    .map(x => List(x._1,x._2._1,x._2._2))
  res2.foreach(println)




}
