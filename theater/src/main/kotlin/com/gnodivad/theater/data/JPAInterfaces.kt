package com.gnodivad.theater.data

import com.gnodivad.theater.domain.Booking
import com.gnodivad.theater.domain.Performance
import com.gnodivad.theater.domain.Seat
import org.springframework.data.jpa.repository.JpaRepository

interface SeatRepository : JpaRepository<Seat, Long>

interface PerformanceRepository : JpaRepository<Performance, Long>

interface BookingRepository : JpaRepository<Booking, Long>