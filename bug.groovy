def myMethod() {
  def list = [1, 2, 3, 4, 5]
  list.each { element ->
    if (element == 3) {
      return // This will exit the method prematurely
    }
    println element
  }
}

myMethod()