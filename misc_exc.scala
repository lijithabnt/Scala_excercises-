object Solution extends App {
 def f(n: Int) = {
    for (i <- 1 to n )
    println("Hello World");
    
}

  var n = scala.io.StdIn.readInt
  f(n)
}


val s = "lijitha"
val a = s.length()
//var e:Char = ' '
//var r:Char = ' '

//Range(0, a, 2).foreach(println)

val xx = for (i <- Range(0, a, 2)) yield s.charAt(i)

val yy = for (i <- Range(1, a, 2)) yield s.charAt(i)

xx.mkString("").concat(" " + yy.mkString(""))

s"${xx.mkString("")} ${yy.mkString("")}"
