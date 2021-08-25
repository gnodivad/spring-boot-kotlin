package com.gnodivad.theater.domain

import javax.persistence.*

@Entity
data class Performance(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) val id: Long,
    val title: String
) {
    @OneToMany(mappedBy = "performance")
    lateinit var booking: List<Booking>

    override fun toString(): String = "Performance $id - $title"
}