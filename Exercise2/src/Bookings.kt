interface BookingManager {
    val version: String

    fun isSeatFree(seat: Seat): Boolean
    fun reserveSeat(seat: Seat, customerId: Long): Boolean

    fun systemStatus() = "All Operations are Functional"
}

open class BasicBookingManager : BookingManager {
    override val version = "1.0"

    override fun isSeatFree(seat: Seat) = true

    override fun reserveSeat(seat: Seat, customerId: Long) = false
}

class AdvancedBookingManager: BasicBookingManager() {
    override val version = "2.0"

    fun howManyBookings() = 10
}