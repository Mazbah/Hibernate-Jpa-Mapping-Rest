package com.mazbah.hibernatemapping.onetomany.controller

import com.mazbah.hibernatemapping.onetomany.entity.UserContact
import com.mazbah.hibernatemapping.onetomany.repository.UserContactRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/usersContact")
class UserContactController(private val userContactRepository: UserContactRepository)
{
    @GetMapping("/all")
    fun getUsersContact(): List<UserContact> {
        return userContactRepository.findAll()
    }

    @GetMapping("/clear")
    fun clear(): String {
        userContactRepository.deleteAll()
        return "OK"
    }

    @PostMapping("/update")
    fun update(@RequestBody userContact: UserContact): UserContact {
        return userContactRepository.save(userContact)
    }
}