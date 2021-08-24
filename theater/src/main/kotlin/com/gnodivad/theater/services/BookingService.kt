package com.gnodivad.theater.services

import com.gnodivad.theater.domain.Seat
import org.springframework.stereotype.Service

@Service
class BookingService() {
    fun isSeatFree(seat: Seat): Boolean {
        return true
    }
}