//With out recurrssion

def fibonacci_Series(num : Int)={
  var a = 1
  var b = 0
  for (i <- 0 to num) {
    var c = a + b
    a = b
    b = c
    println(a)
  }
}

fibonacci_Series(10)
