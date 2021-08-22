fun main() {
    // while loop
    var x: Int = 0

    while (x < 10) {
        println(x)
        x++
    }

    //  for loop
    val people = HashMap<Int, KotlinPerson>()
    people.put(1, KotlinPerson(1, "Mr", "James", "Apple", null))
    people.put(2, KotlinPerson(2, "Miss", "Sophie", "Orange", null))
    people.put(3, KotlinPerson(3, "Mrs", "Anita", "Kumkwat", null))
    people.put(4, KotlinPerson(4, "Mr", "Darren", "Banana", null))

    for ((key, value) in people) {
        println("$value has key $key")
    }

    // range
    for (i in 0..9) {
        print("$i ")
    }
    println()
    (0..9).forEach{ print("$it ") }
    println()
    (9 downTo 0).forEach{ print("$it ") }
    println()
    (0 until 9).forEach{ print("$it ") }
    println()
    (0..9 step 2).forEach{ print("$it ") }
    println()
    ('A'..'F').forEach{ print("$it ") }
}