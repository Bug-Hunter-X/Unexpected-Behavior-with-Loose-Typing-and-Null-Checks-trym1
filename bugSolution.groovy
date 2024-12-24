```groovy
def myMethod(value) {
  if (value == null) {
    return 0
  } else if (value instanceof Integer) {
    return value * 2
  } else if (value instanceof List) {
    return value.size()
  } else {
    throw new IllegalArgumentException("Unsupported type: "+ value.class)
  }
}

println myMethod(null) // Output: 0
println myMethod(5)   // Output: 10
println myMethod([1, 2, 3]) // Output: 3
println myMethod("hello") // Throws exception
```