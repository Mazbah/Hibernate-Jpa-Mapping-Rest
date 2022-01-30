package com.mazbah.hibernatemapping.onetomany.controller

import com.mazbah.hibernatemapping.onetomany.entity.User
import com.mazbah.hibernatemapping.onetomany.repository.UserRepository
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/users")
class UserController (private val usersRepository: UserRepository)
{
    @GetMapping("/all")
    fun getAll(): List<User> {
        return usersRepository.findAll()
    }

    @GetMapping("/clear")
    fun clear(): String {
        usersRepository.deleteAll()
        return "OK"
    }

    @GetMapping("/name")
    fun getUser(@RequestParam("name") name: String): User {
        return usersRepository.findByName(name)
    }

    @GetMapping("/id")
    fun getId(@RequestParam("id") id: Long): Optional<User> {
        return usersRepository.findById(id)
    }

    @PostMapping("/update")
    fun update(@RequestBody user: User): User {
        return usersRepository.save(user)
    }
}