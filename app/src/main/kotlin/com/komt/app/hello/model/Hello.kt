package com.komt.app.hello.model

import jakarta.persistence.*

@Entity
class Hello {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null

    @Column(nullable = false, length = 30)
    lateinit var message:String


}