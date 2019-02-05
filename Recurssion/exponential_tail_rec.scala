//recurssion
def exponum(x:Int,n:Int):Int = {
  if(n == 0)
    1
  else
    x * exponum(x,n-1)
}

//tail recurssion
def expTail(x: Int, n: Int, res: Int = 1): Int = {
  if (n == 0) res
  else expTail(x, n-1, x * res)
}


exponum(6,3)
expTail(4,5)
