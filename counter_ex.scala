//create a class wihch accepts an argument and a method to incr/decr and overload method to accepting an increment and decrement val


package lectures.part1Basics

class counter(var c:Int) {
  def increment(incrtimes: Int): Int = {
    for (i <- 1 to incrtimes) {
      c = c + 1
    }
    c
  }

  def decrement(devcal:Int):Int = {
    c=c-devcal
    c
  }

  def increment(incrtimes: Int, incrval: Int) = {
    for (i <- 1 to incrtimes) {
      c = c + incrval
    }
    c
  }
}

object newobj extends  App {

  val ex = new counter(9)
  println(ex.increment(3))
  println(ex.decrement(2))
  println(ex.increment(2, 3))
  println(ex.c)
}
/*
//12
10
16
16
