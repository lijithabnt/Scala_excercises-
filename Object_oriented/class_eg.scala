//given the author and novel detaisl calculate the age of the author during the time of release

package lectures.part1Basics.excercises_train



class writer_(fname:String,lname:String,birthdate:Int) {
  val fname1 = fname
  val lname1 = lname
  val bdate = birthdate


  def fullname() = {
    val fullname = fname1 + lname1
    fullname
  }
}

  class novel_(novelname: String, yor: Int, author: writer) {
    def calage() = {
      var age = yor - author.birthdate
      age
    }

  }



object novel_ extends App {

  val writer1 = new writer("roy", "chetan", 1990)
  val novel4 = new novel_("2 states",2019,writer1)
  println(novel4.calage())
  println(writer1.fullname())
  println(writer1.birthdate)


}
