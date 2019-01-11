//Write a function to solve the quadratic equation for real values.
// Your solution should return a (Double, Double)of the two roots.

val quadraticRoots = (a:Int,b:Int,c:Int) => {
  (((-b+math.sqrt((b*b)-(4*a*c)))/(2*a)),((-b-math.sqrt((b*b)-(4*a*c)))/(2*a)))
}

quadraticRoots(5,6,1)


