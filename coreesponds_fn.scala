//Make a call to corresponds method of list, that checks whether the elements in an array of strings have the lengths given in an array of integers.
//Signature of corresponds
//def corresponds[B](that: Seq[B])(p: (A, B) => Boolean): Boolean
//Example : val list1 = List(“AA”,”B”,”CC”,”E”)
//val list2 = List(2,1,2,1)
//list1 corresponds list2 should return true

val list = 1::2::3::4::Nil
val list1 = "a"::"ab" ::"abc"::"iuhw" ::Nil

list.corresponds(list1)(_ == _.length)
//or
list.corresponds(list1)((x,y) => x == y.length)
//or

val fun1 = (x:Int,y:String) => (x == y.length)
list.corresponds(list1)(fun1)


/*
list: List[Int] = List(1, 2, 3, 4)
list1: List[String] = List(a, ab, abc, iuhw)

res15: Boolean = true

res16: Boolean = true


fun1: (Int, String) => Boolean = $Lambda$1539/959538881@52c943fe
res17: Boolean = true
