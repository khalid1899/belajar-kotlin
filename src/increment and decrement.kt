/**
* Created by SAINTEK 101 on 10/1/2017.
*/
fun main(args: Array<String>) {
    var x=10
    var y=11
    var z= --x+y   // (++x)=(x=x+1) ,(--x)
    println("z:$z")

    println("before x:$x")
    //x=9, y=11
    var m=x+++y
    println("m:$m ")
    println("after x:$x")
}

