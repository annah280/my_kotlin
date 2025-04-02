// "content" : strings to store text
// string contain a collection of characters surrounded by
// double quotes
var txt = "Hello World"
// string concatenation
var fistname = "Daniel"
var lastname = "Maxwell"
fun main(){
    // accessing a character in a string
    println( txt[4])
    // getting the length of a string
    println(txt.length)
    println(txt.uppercase())
    println(txt.lowercase())
    var fullname = "My Name is" + fistname +  ""  + lastname
    println(fullname)
    println("My name is &firstname &lastname")
}