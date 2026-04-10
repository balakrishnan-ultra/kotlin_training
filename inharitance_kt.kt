open class masterclass
{
    val x = 10;
}
class child: masterclass()
{
    fun test()
    {
        println(x)
        print("$x \n")
    }
}
fun main()
{
    val c = child()
    c.test()
}
