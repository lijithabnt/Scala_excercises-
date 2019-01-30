def gcd(a: Int, b: Int): Int =
  if (b == 0) a else gcd(b, a % b)

gcd(25,180)
gcd(14,21)
