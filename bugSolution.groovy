def myMethod() {
  def list = [1, 2, 3, 4, 5]
  list.each { element ->
    if (element == 3) {
      // Instead of returning, use a conditional to skip
      return // Or use continue
    }
    println element
  }
}

myMethod()