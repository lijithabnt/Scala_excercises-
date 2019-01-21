//Create an array of size 20 with fill method of an array.
val new_arr = Array.fill(20)("hi")

//tabulate method on list
val new_ls = List.tabulate(5)(xs => xs*xs)
val new_ls1 = Array.tabulate(5)(xs => xs*xs)

val l1=List(1,2,3,4)
val l2 =List("a","ab","abc","abcd")
l1.corresponds(l2)(_ ==_.length)

//Make a List[Char] that contains ’a’-’z’
// without typing in all the characters. (Use toChar to make this work.)
val listofchars = List.range(97,123).map(x => x.toChar)

//Given two Array[Double] values of the same length, write a function that returns the element-wise sum. This is a new Array where each element is the sum of the values from the two input arrays at that location. So if you have Array(1,2,3) and Array(4,5,6) you will get back Array(5,7,9).
val new_a0 = Array(1,2,3,4,5,6)
val new_a2 = Array(2,3,4,1,2,3)
val new_sum = new_a0.zip(new_a2).map{ case(x,y) => x+y }
//new_sum.flatMap(x._1+x._2)
