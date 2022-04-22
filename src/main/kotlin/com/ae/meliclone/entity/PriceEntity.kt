package com.ae.meliclone.entity

import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "price")
data class PriceEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0,
    var coin: String = "$",
    var amount: BigDecimal = BigDecimal(0)
)
