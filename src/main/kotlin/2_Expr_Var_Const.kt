// This is single line comment
/* this is
multiline comment
 */

fun main(args:Array<String>){

    // variable
    var num:Int = 5_00_000

    // constant
    val pi:Double = 3.14

    // Nullability
    var nullableInt:Int? = null
    var res = nullableInt ?: 1; //assign value, if value is null then assign value 1

    var s = "Ritesh"
    val len = s!!.length // throws null-pointer-exception if the value is null





}