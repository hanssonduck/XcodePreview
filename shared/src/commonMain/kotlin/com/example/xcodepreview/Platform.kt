package com.example.xcodepreview

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform