def isPrime(n:Int,init:Int = 2):Boolean= {
  if (init < n) {
    if (n % init == 0)
      false
    else
      isPrime(n, init + 1)
  }
  else true
}
isPrime(4)
isPrime(9)
isPrime(5)
isPrime(13)

/*
res42: Boolean = false
res43: Boolean = false
res44: Boolean = true
res45: Boolean = true*/
