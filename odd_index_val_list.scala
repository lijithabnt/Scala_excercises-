def f(arr:List[Int]):L
def f(arr:List[Int]):List[Int] = (arr.indices.collect { case i if i % 2 == 1 => arr(i) }).toList
f(List(1,2,3,4))

/*
f: f[](val arr: List[Int]) => List[Int]
res5: List[Int] = List(2, 4)ist[Int] = (arr.indices.collect { case i if i % 2 == 1 => arr(i) }).toList

*/
