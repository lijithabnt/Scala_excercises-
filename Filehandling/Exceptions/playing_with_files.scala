//Read a file and provide the count of columns in each line based on delimiter(provided csv as sample file)
import scala.io.Source

val samplefile = Source.fromFile("/Users/c_labbavaram/Documents/learning/scala/FL_insurance_sample.csv")
  .getLines.drop(1).map(x => x.count(x => x == ',')+1).foreach(println)

//or

val samplefile1 = Source.fromFile("/Users/c_labbavaram/Documents/learning/scala/FL_insurance_sample.csv")
  .getLines.drop(1).map(x => x.split(",")).map(y => y.length).toList


//Read a file and provide the count of columns in each line based on delimiter(provided csv as sample file)
import scala.io.Source

val samplefile2: Seq[List[String]] = Source.fromFile("/Users/c_labbavaram/Documents/learning/scala/FL_insurance_sample.csv")
  .getLines.drop(1).map(x => x.split(",")).map(y => (y.toList,y.length)).toList
  .filter(i => i._2 != 18).map(s => s._1)
samplefile2.foreach(println)
val sam3 = samplefile2.map(x=>x.mkString(","))

val fw = new java.io.PrintWriter("/Users/c_labbavaram/Documents/learning/scala/write.txt")
fw.write(sam3 + "\n")
fw.close
