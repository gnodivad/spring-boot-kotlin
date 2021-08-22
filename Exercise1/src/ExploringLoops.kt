fun main() {
    // while Loops
    var x: Int = 0

    while (x < 10) {
        println(x)
        x++
    }

    val people = ArrayList<KotlinPerson>()
    people.add(KotlinPerson(1, "Mr", "James", "Apple", null))
    people.add(KotlinPerson(1, "Miss", "Sophie", "Orange", null))
    people.add(KotlinPerson(1, "Mrs", "Anita", "Kumkwat", null))
    people.add(KotlinPerson(1, "Mr", "Darren", "Banana", null))

    for (person in people) {
        println(person)
    }
}