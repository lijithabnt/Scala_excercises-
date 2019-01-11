//Function to take three values and return the median

val medinaOfNum = (array2: Array[Int]) => {
  if(array2.length % 2 == 0) {
    val new_sort_array = array2.sorted
    println(new_sort_array.mkString)
    (new_sort_array(new_sort_array.length/2-1)+ new_sort_array(new_sort_array.length/2))/2
  }
  else {
    val new_sort_array = array2.sorted
    println(new_sort_array.mkString)
    new_sort_array(array2.length/2)
  }
}
medinaOfNum(Array(1,7,4,6,8,9,10,11,12))
