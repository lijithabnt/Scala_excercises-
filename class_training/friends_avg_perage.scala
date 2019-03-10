//given a file find the average number of friends per each age group

import scala.io.Source
object friends_Avg_33 extends App{
val readf = Source.fromFile("/Users/c_labbavaram/Documents/workspace/software_home/fakefriends.csv")
val newf = readf.getLines().toList
  //.filter(x => x(2) == 33)
  .map(x => (x.split(",")(2),x.split(",")(3))).groupBy(x => x._1)
  .mapValues(x => x.map(x => x._2))
  //val newf2 = newf.mapValues(x => x.length)
  val newf1 = newf.mapValues(x => x.map(x => x.toInt).sum/x.length)
//val res  =(newf(1), newf1._2/newf2._1)
  //val newf1 = newf.mapValues(x => x.size)
  //val newf2 = newf.mapValues(x => x.sum)
  //.filter(x => x._1 == "33")
  //.toList.filter(x => x(2) == 33)
 //.filter(x => x._1 == 31)
  //.toList
  //newf2.foreach(println)
  newf1.foreach(println)


}




/* sample output 

(45,309)
(34,245)
(67,214)
(66,276)
(51,302)
(19,213)
(23,246)
(62,220)
(40,250)
(44,282)
(33,325)
(22,206)
*/
