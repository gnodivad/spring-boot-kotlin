package com.gnodivad.theater.services

import com.gnodivad.theater.data.BookingRepository
import com.gnodivad.theater.data.SeatRepository
import com.gnodivad.theater.domain.Performance
import com.gnodivad.theater.domain.Seat
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BookingService() {
    @Autowired
    lateinit var bookingRepository: BookingRepository

    @Autowired
    lateinit var seatRepository: SeatRepository

    fun isSeatFree(seat: Seat, performance: Performance): Boolean {
        val bookings = bookingRepository.findAll()
        val matchBookings = bookings.filter { it.seat == seat && it.performance == performance }
        return matchBookings.isEmpty()
    }

    fun findSeat(seatNum: Int, seatRow: Char) : Seat? {
        val allSeats = seatRepository.findAll()
        return allSeats.firstOrNull { it.num == seatNum && it.row == seatRow }
    }
}