//Write a script that has the user input a location as x and y coordinate values
// which tells whether the point specified is in the unit circle.

val locationinput = (x:Double,y:Double) => if((x*x+y*y) < 1) "Inside unit cirlce" else "Not in unit circle"
locationinput(-0.2,-0.1)

