
  def isodd(givenum: Int): Boolean = if (givenum % 2 != 0) return true else false



  def isprime(inputnumer: Int): Boolean = {
    if (isodd(inputnumer)) {
      for (num <- 2 until inputnumer) {
       if (isfactor(inputnumer, num)){ return false }

      //  println(!isfactor(inputnumer, num))
      }
      return true
    }
    false
  }


  def listofprimes(numbertillprime: Int) = {
    for (num <- 2 until numbertillprime; if isprime(num)) {
      println(num)
    }
  }

  def isfactor(number: Int, factor: Int): Boolean = {
    number % factor == 0
  }



  listofprimes(100)
isprime(5)
