package com.komt.app.hello.service

import jakarta.transaction.Transactional
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class HelloServiceTest() {

    @Autowired
    lateinit var helloService: HelloService

    @Test
    @Transactional
    fun addAndGetHi() {
        val addedHello = helloService.addHi("test greetings")
        helloService.em.flush()
        helloService.em.detach(addedHello)

        val gotHello = helloService.getHi(addedHello.id!!)

        Assertions.assertThat(addedHello.id).isEqualTo(gotHello.id)
        Assertions.assertThat(addedHello.message).isEqualTo(gotHello.message)
    }

}