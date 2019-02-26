def fibPrint( n : Int) : Unit ={
  def fibanocci( n : Int) : BigInt = {
    n match {
      case 0 | 1 => n
      case _ => fibanocci(n-1) + fibanocci(n - 2)
    }
  }
    for( i <- 0 to n) println(fibanocci(i))
  }

fibPrint(10)

