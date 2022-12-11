package com.komt.app.hello.service

import com.komt.app.hello.model.Hello
import jakarta.persistence.EntityManager
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class HelloService(val em: EntityManager) {
    @Transactional
    fun getHi(id: Long):Hello {
        val toFind = Hello()
        toFind.id = id
        return em.find(Hello::class.java, id)
    }

    @Transactional
    fun addHi(message: String):Hello {
        val hello = Hello()
        hello.message = message
        em.persist(hello)
        return hello
    }
}