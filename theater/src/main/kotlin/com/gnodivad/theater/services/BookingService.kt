package com.gnodivad.theater.services

import com.gnodivad.theater.data.BookingRepository
import com.gnodivad.theater.data.SeatRepository
import com.gnodivad.theater.domain.Booking
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
        val matchBookings = findBooking(seat, performance)
        return matchBookings == null
    }

    fun findSeat(seatNum: Int, seatRow: Char): Seat? {
        val allSeats = seatRepository.findAll()
        return allSeats.firstOrNull { it.num == seatNum && it.row == seatRow }
    }

    fun findBooking(selectedSeat: Seat, selectedPerformance: Performance): Booking? {
        val bookings = bookingRepository.findAll()
        return bookings.firstOrNull { it.seat == selectedSeat && it.performance == selectedPerformance }
    }

    fun reserveSeat(seat: Seat, performance: Performance, customerName: String): Booking {
        val booking = Booking(0, customerName)
        booking.seat = seat
        booking.performance = performance

        return bookingRepository.save(booking)
    }
}