package com.komt.app.hello.controller

import com.komt.app.hello.dto.HelloDTO
import com.komt.app.hello.model.Hello
import com.komt.app.hello.service.HelloService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/hello")
class HelloController(val helloService: HelloService){

    @GetMapping("/all")
    fun getAllMessages():String {
        return "hi"
    }

    @PostMapping("")
    fun addHi(@RequestBody dto: HelloDTO): Hello {
        return helloService.addHi(dto.message)
    }

    @GetMapping("")
    fun getHi(@RequestParam id:Long): Hello {
        return helloService.getHi(id)
    }
}