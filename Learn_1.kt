fun sayhello(greeting:String, vararg itemsToGreet:String)
{
    itemsToGreet.forEach{itemToGreet ->
        println("$greeting $itemToGreet")
    }
    //This code is working, But it's throw the WARNING message
    /*
        Learn_1.kt:10:46: warning: redundant spread (*) operator.
    sayhello(greeting = "Hi", itemsToGreet = *interestingThings)

    */
}
fun main()
{
    //val interestingThings = arrayOf("Kotlin","cpp","C")
    //sayhello(greeting = "Hi", itemsToGreet = interestingThings)
    
    
    
    
    //compile time pass,But run time fail.
    //val sum = "0.1 + 0.2".toBigDecimal()
    //println(sum)
    /*
    Exception in thread "main" java.lang.NumberFormatException: Character   is neither a decimal digit number, decimal point, nor "e" notation exponential mark.
	at java.base/java.math.BigDecimal.<init>(BigDecimal.java:608)
	at java.base/java.math.BigDecimal.<init>(BigDecimal.java:497)
	at java.base/java.math.BigDecimal.<init>(BigDecimal.java:903)
    */
    
    
    //BigDecimal
    val a = "+0.1".toBigDecimal()
    val b = "-0.3".toBigDecimal()
    println(a+b) //-0.2

}
