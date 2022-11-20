fun main(args:Array<String>){
    var inum:Int = 5
    var dnum:Double = 5.64

    // error => inum = dnum
    inum = dnum.toInt() // convert to Int

    // error => val x:Double = 4

    // Char
    val flag:Char = 'F'

    // Strings
    val animal:String = "Animal"

    // Concatenation
    var mainmsg = "this is "
    val msg = "my message"
    mainmsg += msg

    // String Template
    var sentence = "Here is $msg"

    // MultiLine Strings
    var multistr = """
        This is 
        a 
        multiline xtring
    """.trimIndent()


    // Pairs & Triples
    var coordinateInferred = Pair(2,5)
    var coordinatedWithTo = 3 to 5
    // nested
    var coordinateNested = Pair(coordinateInferred, coordinatedWithTo)

    // coordinateInferred.first
    // coordinateInferred.second

    // Number Types
    // Byte - 1 byte
    // Short - 2 byte
    // Int - 4 byte
    // Long - 8 byte

    // Any type - similar to object type in java/c#
    var anyx:Any = "53"
    anyx = 3.14

    // Nothing
    fun doNothing() {}

    // Unit
    fun incNum():Unit{
        // increament logic
    }

    // Pairs & Triples
    var InferredCoordinates = Pair(1.5, 4)
    var Coordinate = Triple(1, 2 ,3)
    // Access -> Coordinate.first



}