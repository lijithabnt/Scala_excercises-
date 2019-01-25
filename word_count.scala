//wordcount program in scala
import scala.io.Source

val filesample1 = Source.fromFile("/Users/c_labbavaram/Documents/learning/scala/sample.txt").getLines.toList
filesample1.flatMap(x => x.split(" ")).length


//number of occurences of a word in Scala

import scala.io.Source
val filesample = Source.fromFile("/Users/c_labbavaram/Documents/learning/scala/sample.txt").getLines.toList
filesample.flatMap(x => x.split(" "))
          .groupBy(y =>y).toList
          .map(a => (a._1,a._2.length))
          .foreach(println)
          
          
 /*
 (are,1)
(lijijitha,1)
(u,1)
(how,1)
(hi,3)
(hello,2)
(sis,1)
(thi,1)
res0: Unit = ()

*/
