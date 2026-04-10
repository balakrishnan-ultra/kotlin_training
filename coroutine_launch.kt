//not working

import kotlinx.coroutines.*
fun main() = runBlocking{
    launch{
        delay(1000L)
        println("Coroutine running..")
    }
    println("main running outside of launch running")
}
