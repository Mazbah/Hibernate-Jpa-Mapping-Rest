package com.mazbah.hibernatemapping.onetomany.controller

import com.mazbah.hibernatemapping.onetomany.entity.UserOne
import com.mazbah.hibernatemapping.onetomany.repository.UserOneRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/userOne")
class UserOneController (private val userOneRepository: UserOneRepository)
{
    @GetMapping("/all")
    fun getAll(): List<UserOne> {
        return userOneRepository.findAll()
    }

    @PostMapping("/update")
    fun update(@RequestBody userOne: UserOne): UserOne {
        return userOneRepository.save(userOne)
    }
}