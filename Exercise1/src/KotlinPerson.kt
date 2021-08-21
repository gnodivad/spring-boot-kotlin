import java.util.*

data class KotlinPerson(val id: Long, val title: String, val firstName: String, val surname: String, val dateOfBirth: Calendar?) {
    override fun toString(): String {
        return "$title $firstName $surname"
    }

    val age: Int?
        get() = getAge(dateOfBirth)
    val safeAge: Int
        get() {
            return if (age != null) age else -1
        }

    companion object {
        fun getAge(dateOfBirth: Calendar?): Int? {
            if (dateOfBirth == null) return null

            val today = GregorianCalendar()
            val years = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR)

            return if (dateOfBirth.get(Calendar.DAY_OF_YEAR) >= today.get(Calendar.YEAR)) years -1 else years
        }
    }
}

fun main() {
    val john = KotlinPerson(1L, "Mr", "John", "Blue", GregorianCalendar(1977,9,3))
    val jane = KotlinPerson(2L, "Mrs", "Jane", "Green", null);
    println("$john's age is ${john.age}");
    println("$jane's age is ${jane.age}");
    println("The age of someone born on 3rd May 1988 is ${KotlinPerson.getAge(GregorianCalendar(1988,5,3))}");

    val olderPerson = if (john.age > jane.age) john else jane
    println("The older person was $olderPerson")
}