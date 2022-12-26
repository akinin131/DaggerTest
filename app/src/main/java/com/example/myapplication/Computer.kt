package com.example.myapplication


import javax.inject.Inject



class Processor  {

    override fun toString() = "A2021"
}

class Motherboard {

    override fun toString() = "X7 3000"
}

class RAM {

    override fun toString() = "16 GB"
}

data class Computer (
    val processor: Processor,
    val motherboard: Motherboard,
    val ram: RAM,
)