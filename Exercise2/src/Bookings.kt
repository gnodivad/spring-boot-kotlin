import java.math.BigDecimal

interface BookingManager {
    val version: String

    fun isSeatFree(seat: Seat): Boolean
    fun reserveSeat(seat: Seat, customerId: Long): Boolean

    fun systemStatus() = "All Operations are Functional"
}

open class BasicBookingManager(authorisationKey: String) : BookingManager {
    override val version = "1.0"

    override fun isSeatFree(seat: Seat) = true

    override fun reserveSeat(seat: Seat, customerId: Long) = false
}

class AdvancedBookingManager : BasicBookingManager("1234"), java.io.Closeable {
    override val version = "2.0"

    fun howManyBookings() = 10
    override fun close() {}
}

fun main() {
    println(AdvancedBookingManager().isSeatFree(Seat(1, 1, BigDecimal.ZERO, "")))
}