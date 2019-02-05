//Using pattern matching, write a function swap that receives a pair of
//integers and returns the pair with the components swapped.

def swaping(x:(Int,Int)) = x match {
  case x => (x._2,x._1)
}
swaping((2,3))

