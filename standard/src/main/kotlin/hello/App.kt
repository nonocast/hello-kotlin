package hello

fun main() {
  var shape = Square()
  shape.hello()
}

open class Shape {
  var name:String?

  constructor() {
    this.name = "shape"
  }

  fun hello() {
    println(this.name)
  }
}

class Square : Shape {
  constructor() {
    super.name = "square"
  }
}