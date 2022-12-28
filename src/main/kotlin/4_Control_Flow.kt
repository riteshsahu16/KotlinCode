fun main(args:Array<String>){

    // if-else
    var day = "Saturday"
    var duty = ""
    if(day == "Sunday") duty = "It's OFF day"
    else if(day == "Saturday") duty="Half Day"
    else duty="Work Day"

    var num = 0
    var flag = false
    if (num in 1..10) flag = true

    // when statement
    var res = ""
    when(num){
        -1, 0 -> res = "empty"
        in 1..100 -> res = "in range 1 to 100"
        else -> res = "out of range"
    }

    // Looping
    // while
    var counter = 0
    while (counter < 10){
        counter += 1
    }

    // do-while
    do {
        counter += 1
    }while (counter<1000)

    // for loop
    for (i in 10 downTo  1 step 2)

    for (i in 1..100) counter = i


    // Range in Kotlin
    var closedRange = 0..5

    var halfOpenRange = 0 until 5

    var decreasingRange = 5 downTo 1

    var c = 0
    repeat(5){
        c++;
    }





























}