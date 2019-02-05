///Write a function to convert a given string to Integer only
// if it starts with 0 , else return -1.use Option and pattern matching.


def strint(x:String) = x match {
  case x:String if(x.startsWith("0")) => x.toInt
  case _ => -1 
}
strint("045") // res2: Int = 45

strint("98") //res3: Int = -1
strint("035")//res4: Int = 35
strint("0a")//error


