class Car(var brand: String, var year: Int, var price: Double)
{
    //First function
    fun drive()
    {
        
        println("Car class" + "\n" + brand)
    }
    
    //function value pass
    fun speed(needforspeed:Int)
    {
        println("Car Speed : " + needforspeed +"Km/h \n")
    }
    /*error: 'val' 'var' on function parameter is prohibited.
    fun speed(val needforspeed:Int)
    */
}



fun main()
{
 val c = Car("TOYOTA", 2025, 3823000.100)
 c.drive() //function call
 c.speed(350)
 
 
 
 

 //println(c.company +"\t"+ c.year+ "\n" + "Onroad Price :" + c.amount+"\n")
}
