//Using pattern matching, write a function swap that swaps the first two elements
// of an array provided its length is at least two.


def swaparray(x:Array[Any]) = {
  x match {
    case x:Array[Any] if x.isEmpty => x
    case x:Array[Any] if(x.length >= 2) => x(1)+:x(0)+: x.drop(2)
    case x:Array[Any] if(x.length < 2) => "Invalid num of elements"

  }
}

swaparray(Array(1,2,3,4))
swaparray(Array(1,2))
swaparray(Array(2))
swaparray(Array())

/*
res8: java.io.Serializable = Array(2, 1, 3, 4)
res9: java.io.Serializable = Array(2, 1)
res10: java.io.Serializable = Invalid num of elements
res11: java.io.Serializable = Array()


*/
