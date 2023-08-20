fun main(args: Array<String>) {
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println("First item on the list is: ${readOnlyShapes.first()} ")
    println("Last item on the list is: ${readOnlyShapes.last()} ")
    println("This list has: ${readOnlyShapes.count()} items")
    println("rectangle" in readOnlyShapes)

    val shapes : MutableList<String> = mutableListOf("triangle", "square", "circle")
    val shapesLocked : List<String>  = shapes
    shapes.add("pentagon")
    println(shapes.last())
    shapes.remove(shapes.first())
    println(shapes)
    shapes.remove("circle")
    println(shapes)


}