data class Customer(val id: Long, val name: String)

class CustomerDatabase() {
    val customers = listOf(
        Customer(1, "Matt"),
        Customer(2, "James"),
        Customer(3, "Dianne"),
        Customer(4, "Sally")
    )
}