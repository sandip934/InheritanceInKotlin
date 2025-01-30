open class Rectangle(x : Int,y : Int,var l : Int,var b : Int) : Shape(x,y) {

  constructor(l : Int,b : Int): this(0,0,l,b){
      println("Secondary constructor of Rectangle class")
  }

    override fun draw() {
        super.draw()
        println("Drawing a rectangle")
    }

    override fun calculateArea() {
        super.calculateArea()
        println("Calculating Area of rectangle ${l * b}")
    }

    override fun calculatePerimeter() {
        super.calculatePerimeter()
        println("calculating perimeter of rectangle ${2 * (l + b)}")
    }

}