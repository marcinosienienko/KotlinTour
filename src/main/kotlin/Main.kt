fun main(args: Array<String>) {

    //Read only map
    val readOnlyJuiceMenu = mapOf("apple" to 180,"kiwi" to 250, "banana" to 300)
    println(readOnlyJuiceMenu)

    //Mutable map with explicit type declaration
    val juiceMenu : MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 250, "banana" to 300)
    val juiceMenuLocked: Map<String, Int> = juiceMenu
    println(juiceMenu)
    println(readOnlyJuiceMenu.containsKey("kiwi"))
    println(readOnlyJuiceMenu.keys)
    println(readOnlyJuiceMenu.values)
    println("banana" in readOnlyJuiceMenu.keys)
    println(200 in readOnlyJuiceMenu.values)

    //Exercise 1

    val greenNumbers = listOf(1,4,23)
    val redNumbers = listOf(17,2)

    val totalCount = greenNumbers.count() + redNumbers.count()

    println(totalCount)

    //Exercise 2

    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED

    println("Support for $requested: $isSupported")

    //Exercise 3

    val number2Word = mapOf(1 to "one", 2 to "two", 3 to "three")
        val n = 2
    println("$n in spelt as '${number2Word[n]}'")


}

