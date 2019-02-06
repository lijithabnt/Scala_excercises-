//Tail recurrssion
def sum2(ints: List[Int]): Int = {
  def sumAccumulator(ints: List[Int], accum: Int): Int = {
    ints match {
      case Nil => accum
      case head :: tail => sumAccumulator(tail, accum + head)
    }
  }
  sumAccumulator(ints, 0)
}
sum2(List(1,2,2,3434,432,43,2)) //res2: Int = 3916
sum2(List()) //res3: Int = 0

//Normal recurrssion

def sum3(xs: List[Int]): Int = {
  if (xs.isEmpty) 0
  else xs.head + sum3(xs.tail)
}
sum2(List(1,2,2,3434,432,43,2)) //res4: Int = 3916
sum2(List()) //res5: Int = 0
