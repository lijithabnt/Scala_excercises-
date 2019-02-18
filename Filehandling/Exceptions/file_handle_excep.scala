//Write a function to read lines from the given file. In case file does not exists read from a default file location to get lines. Use exception handling.


package lectures.part1Basics.excercises_train
import java.io.{FileNotFoundException, IOException}

import scala.io.Source

class baby_names {

  def popularBabyNames(filename:String): Unit = {
    try {
      Source.fromFile(filename).getLines()
      //println(readfile)
    }
    catch{
      case e: FileNotFoundException => Source.fromFile("/Users/c_labbavaram/Documents/workspace/software_home/excep_hand.txt").getLines().foreach(x => println(x))
      //case e: IOException => println("Had an IOException trying to read that file")

    }
  }


}

object babies extends App{
  val newfilread = new baby_names
  newfilread.popularBabyNames("/Users/c_labbavaram/Documents/workspace/software_home/namesbystate/AKi.TXT")
}
