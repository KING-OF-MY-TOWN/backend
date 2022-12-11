package com.komt.app.hello.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Hello {
    @Id
    @GeneratedValue()
    private val id:Long? = null

    private lateinit var message:String


}