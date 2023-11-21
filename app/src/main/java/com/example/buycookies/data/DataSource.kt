package com.example.buycookies.data

import com.example.buycookies.R

object DataSource {
    val flavors = listOf(
        R.string.pumpkin_pie,
        R.string.caramel_strawberry,
        R.string.chocolate_chip_peanut,
        R.string.marshmellow_swirl,
        R.string.rasberry_dreamy,
        R.string.nutty_nuts,
        R.string.vanilla_caramel,
        R.string.white_chocolate_daydream,
        R.string.datenight_perfection,
    )

    val quantityOptions = listOf(
        Pair(R.string.one_cookie, 1),
        Pair(R.string.five_cookies, 5),
        Pair(R.string.ten_cookies, 10),
        Pair(R.string.fifteen_cookies, 15),
        Pair(R.string.twenty_cookies, 20)
    )
}