package com.csabhi.testios

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform