import java.util.*

/**
 * Created by SAINTEK 101 on 10/1/2017.
 */
fun main(args:Array<String>){
    //input
    print(:"enter your DOB:")
    var DOB:Int= readLine()!!.toInt()

    //process
    var Year=Calendar.getInstance().get(Calendar.YEAR)
    var Age:Int?
    Age=Year-DOB


    //output
    println("your Age us $Age years")

}