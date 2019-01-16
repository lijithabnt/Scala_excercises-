//Write a function which take an Array[Int] and return the number of even values in the Array.
//Write a function which take an Array[Int] and return the number of odd values in the Array.
val x = Array(1,2,3,4,5)
val evens = (y:Int) => y%2 == 0
val odds = (y:Int) => (y%2 != 0)
x.filter(evens)
x.filter(odds)
