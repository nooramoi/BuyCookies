package com.example.buycookies.data

data class OrderUiState(
    /** Selected cookies quantity ( 5, 10, 15, 20) */
    val quantity: Int = 0,
    /** Flavor of the cookies in the order (such as caramel, etc..) */
    val flavor: String = "",
    /** Selected date for pickup (such as "Jan 1") */
    val date: String = "",
    /** Total price for the order */
    val price: String = "",
    /** Available pickup dates for the order*/
    val pickupOptions: List<String> = listOf()
)
