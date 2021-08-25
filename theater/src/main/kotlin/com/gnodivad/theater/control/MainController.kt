package com.gnodivad.theater.control

import com.gnodivad.theater.data.PerformanceRepository
import com.gnodivad.theater.data.SeatRepository
import com.gnodivad.theater.domain.Booking
import com.gnodivad.theater.domain.Performance
import com.gnodivad.theater.domain.Seat
import com.gnodivad.theater.services.BookingService
import com.gnodivad.theater.services.TheaterService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.servlet.ModelAndView

@Controller
class MainController {

    @Autowired
    lateinit var theaterService: TheaterService

    @Autowired
    lateinit var bookingService: BookingService

    @Autowired
    lateinit var seatRepository: SeatRepository

    @Autowired
    lateinit var performanceRepository: PerformanceRepository

    @RequestMapping("")
    fun homePage(): ModelAndView {
        val model = mapOf(
            "bean" to CheckAvailabilityBackingBean(),
            "performances" to performanceRepository.findAll(),
            "seatNums" to 1..36,
            "seatRows" to 'A'..'O'
        )
        return ModelAndView("seatBooking", model)
    }

    @RequestMapping(value = ["checkAvailability"], method = [RequestMethod.POST])
    fun checkAvailability(bean: CheckAvailabilityBackingBean): ModelAndView {
        val selectedSeat = theaterService.find(bean.selectedSeatNum, bean.selectedSeatRow)
        val result = bookingService.isSeatFree(selectedSeat)
//        bean.result = "Seat $selectedSeat is " + if (result) "available" else "booked"
        return ModelAndView("seatBooking", "bean", bean)
    }

//    @RequestMapping("bootstrap")
//    fun createInitialData(): ModelAndView {
//        val seats = theaterService.seats
//        seatRepository.saveAll(seats)
//
//        return homePage()
//    }
}

class CheckAvailabilityBackingBean() {
    var selectedSeatNum: Int = 1
    var selectedSeatRow: Char = 'A'
    var selectedPerformance: Long? = null
    var customerName: String = ""
    var available: Boolean? = null
    var seat: Seat? = null
    var performance: Performance? = null
    var booking: Booking? = null
}