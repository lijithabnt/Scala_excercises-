//Rewrite factorial using pattern matching and recursion.


def factorial(n:Int):Int = n match {
  case 0 => 1
  case _ => n*factorial(n-1)
}

factorial(5)

//120
