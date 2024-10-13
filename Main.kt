fun main()
{
//    Boolean Variable
    val yes = true
    val no = false

//    Boolean Operator
    val doesOneEqualTwo = (1 == 2)
    println(doesOneEqualTwo) // Output: false
    val doesOneNotEqualTwo = (1 != 2)
    println(doesOneNotEqualTwo) // Output: true
    val alsoTrue = !(1 == 2)
    println(alsoTrue) // Output: true
    val isOneGreaterThanTwo = (1 > 2)
    println(isOneGreaterThanTwo) // Output: false
    val isOneLessThanTwo = (1 < 2)
    println(isOneLessThanTwo) // Output: true

//    Boolean Logic
    val andOperation = true && true
    val orOperation = true || false
    println(andOperation) // Output: true
    println(orOperation) // Output: true
    val andTrue = 1 < 2 && 4 > 3
    println(andTrue) // Output: true
    val andFalse = 1 < 2 && 3 < 3
    println(andFalse) // Output: false
    val orTrue = 1 < 2 || 3 > 3
    println(orTrue) // Output: true
    val orFalse = 1 < 1 || 2 > 2
    println(orFalse) // Output: false
    println((1 < 2 && 3 > 4) || 1 < 4) // Output: true
    println((true && false) || true) // Output: true

//    String equality
    val dog = "dog"
    val dogEqualsCat = dog == "cat"
    println(dogEqualsCat) // Output: false
    val order = "cat" < dog
    println(order) // Output: true

//    If expression
    if (2 > 1)
    {
        println("Yes, 2 is greater than 1") // Output
    }
    else
    {
        println("No, 2 is less than 1")
    }
    val animal = "Fox"
    if (animal == "Cat" || animal == "Dog")
    {
        println("Animal is a house pet")
    }
    else
    {
        println("Animal isn't a house pet") // Output
    }

//    Searching max & min value
    val a = 5
    val b = 10
    val min = if (a < b) a else b
    println(min) // Output: 5
    val max = if (a > b) a else b
    println(max) // Output: 10
    val hourOfDay = 12
    val timeOfDay = if (hourOfDay < 6)
    {
        "Early Morning"
    }
    else if (hourOfDay < 12)
    {
        "Morning"
    }
    else if (hourOfDay < 17)
    {
        "Afternoon"
    }
    else if (hourOfDay < 20)
    {
        "Evening"
    }
    else if (hourOfDay < 24)
    {
        "Late evening"
    }
    else
    {
        "Invalid hour"
    }
    println(timeOfDay) // Output: Afternoon

//    While Loop
    var sum = 1
    while (sum < 1000)
    {
        sum = sum + (sum + 1)
    }
    println(sum) // Output: 1023

//    do-while loop
    sum = 1
    do {
        sum = sum + (sum + 1)
    } while (sum < 1000)
    println(sum) // Output: 1023

    sum = 1
    while (sum < 1)
    {
        sum = sum + (sum + 1)
    }
    println(sum) // Output: 1

    sum = 1
    do {
        sum = sum + (sum + 1)
    } while (sum < 1)
    println(sum) // Output: 3

//    Break
    sum = 1
    while (true)
    {
        sum = sum + (sum + 1)
        if (sum >= 1000)
        {
            break
        }
    }
    println(sum) // Output: 1023
}