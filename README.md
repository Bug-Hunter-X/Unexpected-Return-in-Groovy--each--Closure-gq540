# Unexpected Return in Groovy 'each' Closure

This example demonstrates a common pitfall in Groovy when using closures with the `each` method.  Improper use of `return` inside the closure can lead to unexpected behavior and early termination of the method. 

The `bug.groovy` file contains the problematic code. The solution is shown in `bugSolution.groovy`.