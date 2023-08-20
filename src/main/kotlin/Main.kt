fun main(args: Array<String>) {

    val readOnlyFruit = setOf("apple", "cherry", "banana", "banana")
    val fruit: MutableSet<String> = mutableSetOf("apple", "cherry", "banana", "banana")
    val fruitLocked: Set<String> = fruit

    println(fruitLocked)

    println("This set has ${fruit.count()} items")

    fruit.add("dragonfruit")
    println(fruit)

    fruit.remove("banana")
    println(fruit)
}