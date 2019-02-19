package lectures.part1Basics

object top10babiynames extends App{

  import scala.io.Source

  val topn = scala.io.StdIn.readInt()
  /*
  case class babydetails(stateCode:String,gender:String,year: Int,name:String,occurence: Int)
  */


  val readfile = Source.fromFile("/Users/c_labbavaram/Documents/workspace/software_home/namesbystate/AK.txt")
  val top10babies = readfile.getLines()
    /*readfile.getLines().foreach(println)*/
    //AK,F,1910,Mary,14
    //AK,F,1910,Annie,12
    .toList
    //List(AK,F,1910,Mary,14, AK,F,1910,Annie,12, AK,F,1910,Anna,10)
    .map(x=> (x.split(",")(3),x.split(",")(4)))
    //(List((Mary,14), (Annie,12))
    .groupBy(x => x._1)
    /*Map(Elliott -> List((Elliott,5), (Elliott,6), (Elliott,5), (Elliott,8), (Elliott,10), (Elliott,9))
    , Jaxson -> List((Jaxson,6), (Jaxson,9), (Jaxson,9), (Jaxson,9), (Jaxson,10), (Jaxson,19),
     (Jaxson,16), (Jaxson,13), (Jaxson,9)),................*/
    .mapValues(x => x.map(x => x._2.toInt).sum)
    //List((Elliott,5), (Elliott,6), (Elliott,5), (Elliott,8), (Elliott,10), (Elliott,9) => List(Elliott,List(5,6,5,8,10,9))
    //Map(Elliott -> 43, Jaxson -> 100, Daphne -> 5
    .toList
    //List((Elliott,43), (Jaxson , 100), (Daphne,5))
    .sortBy(x => -x._2)
    //List((Jaxson , 100),(Elliott,43),(Daphne,5))
    .take(topn)
  //top 10
 println(top10babies)



}


Output :
======
5
List((Michael,8171), (John,7168), (James,6826), (David,6597), (Robert,6368))
