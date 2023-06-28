package com.rickclephas.myapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform