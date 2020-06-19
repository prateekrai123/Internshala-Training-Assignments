import java.time.*
import java.util.Scanner

class Andy{
    val greet = "Hello sir, Andy here"
    var currentTime = LocalTime.now()
    var time : LocalTime = LocalTime.parse("6")
    
    fun ringAlarm(){
        println("$greet Wake up Wake up! Its day.")
    }
    
    fun makeCoffee(Ingredients : String){
        println("Enter the ingredients")
        println("Your coffee is preparing with $Ingredients")
    }
    
    fun heatTheWater(temprature : String){
        println("Enter the temprature")
        println("Heating the water at $temprature")
    }
    
    fun packingBags(books : String){
        println("Packing your bags with $books")
    }
    
}

fun main() {
    val andy  = Andy()
    if(andy.currentTime==andy.time){
        andy.ringAlarm()
    }
    if(andy.currentTime==LocalTime.parse("06:15:00")){
        var Ingredients = ""
    	Ingredients = readLine().toString()
        andy.makeCoffee(Ingredients)
    }
    if(andy.currentTime==LocalTime.parse("06:20:00")){
        var temprature = ""
        temprature = readLine().toString()
        andy.heatTheWater(temprature)
    }
    if(andy.currentTime==LocalTime.parse("06:25:00")){
        var books = readLine().toString()
        andy.packingBags(books)
    }
    if(andy.currentTime==LocalTime.parse("06:30:00"))
}