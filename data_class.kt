data class Foo(val x:Int)

fun main()
{
    val foo = Foo(1)
    var loop_controller: Int = 0
    
    while (true)
    {
        //Working code
        println(foo)
        Thread.sleep(5000)
        
        //break the loop
        if(loop_controller == 5)
        {
            break
        }
        loop_controller++
    }
}
