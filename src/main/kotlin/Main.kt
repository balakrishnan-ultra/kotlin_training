class Rectangle(val height: Double, val length: Double) {
    val perimeter = (height + length) * 2
}
fun main() {
    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")
}







/*fun main()
{
    var heightAlice = 160
    val heightBob = 175

    val taller = if (heightAlice < heightBob)
    {
        print("Choose Alice\n")
        heightAlice=10
    } else {
        print("Choose Bob\n")
        heightBob
    }

    println("Taller height is $taller")
    println("value changed heightAlice : $heightAlice")

}
*/

/*
How to work :

Choose Alice
Taller height is kotlin.Unit
value changed heightAlice : 10

 */
