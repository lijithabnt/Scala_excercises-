
 /*
 Lets play with some Data using scala.
 * The whole reason for learning about collections was so that we can use them to do something that we find interesting
 * Collections give us the ability to store and manipulate significant amounts of data. This section  is dedicated to playing with some data
 * working with a dataset.
 *Data we are going to work with is actually baby names in the United States from the Social Security Administration.
 * You can download this zip from below URL:
 *https://www.ssa.gov/OACT/babynames/limits.html
 * Direct Link : https://www.ssa.gov/OACT/babynames/state/namesbystate.zip
 * Let me give you a brief analysis of data.
 * Each record in a file has the format: 2-digit state code, sex (M = male or F = female),
 * 4-digit year of birth (starting with 1910), the 2-15 character name, and the number of occurrences of the name. Fields are delimited with a comma.
 * sample record :
 * MS,F,1910,Mary,762
 *So now The problem statement:
 * ===> 1. Find out top 10 most popular baby names in US in male and female category.
 * ===> 2. Find most popular name both male and female state wize in the year 2012.
 *
 * Now its Time to work ! :)
 *
 * Result are from
 * https://www.ssa.gov/oact/babynames/
 *
 */



oobject namesofbabies extends App {

  import scala.io.Source
  import java.io.File
  import java.io.File
  import java.io.PrintWriter

  //val topn = scala.io.StdIn.readInt()
 val gender = scala.io.StdIn.readLine()
 val year = scala.io.StdIn.readLine()

  val readfile = new java.io.File("/Users/c_labbavaram/Documents/workspace/software_home/namesbystate").listFiles()
  readfile.foreach(println)
  val readfilestxt = readfile.toList.filter(x => x.getName.endsWith(".TXT"))

  //TO RETRIEVE TOP 10 M/F BABYNAMES
 val readeachfile = readfilestxt.flatMap(x => Source.fromFile(s"$x").getLines.toList)
    .map(x => (x.split(",")(1), x.split(",")(3), x.split(",")(4)))
    .filter(x => x._1 == gender)
    .groupBy(x => x._2).mapValues(x => x.map(x => x._3.toInt).sum).toList.sortBy(x => -x._2).take(10)

  readeachfile.foreach(print)

  //TO RETRIEVE YEAR WISE TOP 10 M/F BABYNAMES
  val readeachfile2 = readfilestxt.flatMap(x => Source.fromFile(s"$x").getLines.toList)
    .map(x => (x.split(",")(1),x.split(",")(2), x.split(",")(3), x.split(",")(4)))
    .filter(x => x._1 == gender)
    .filter(x => x._2 == year)
    .groupBy(x => x._3)
    .mapValues(x => x.map(x => x._4.toInt).sum).toList
    .sortBy(x => -x._2).take(10)

  readeachfile2.foreach(println)

  //TO RETRIEVE most popular name both male and female state wize for a given year provided as input
  val readeachfile3 = readfilestxt.flatMap(x => Source.fromFile(s"$x").getLines.toList)
    .map(x => (x.split(",")(0),x.split(",")(1),x.split(",")(2), x.split(",")(3), x.split(",")(4)))
    .filter(x => x._3 == year)
    .filter(x => x._2 == gender)
    .groupBy(x => x._1)
    .mapValues(x => (x(0)._4,x(0)._5)).toList
    .map(x => List(x._1,x._2._1,x._2._2))
  //.take(10)

  readeachfile3.foreach(println)

}



