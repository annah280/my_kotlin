//operators are used to perform operations on variables
// and values
// arithmetic, = , -, *, %
// assignments =, +=, -=, *=
// comparison > < ==
//logical operators ! not , && and , // or
var x =10
var y = 20
val modulus = y % x
fun main(){
    y += 2 // y = y +2 // 22 + 2
    x %=3 // x = x % 3 x = 10 % 3

    println(modulus)
    println(x)
    println(y >= x)
    println(x > 3 && y < 10)// =both comparison true
    println(x > 3 ||  y <10) // =both comparison false
    println(x > 3)
    var myBool = true
    println(!myBool)// ! not reverses the boolean value

}