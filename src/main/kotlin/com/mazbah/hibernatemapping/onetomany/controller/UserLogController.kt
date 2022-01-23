package com.mazbah.hibernatemapping.onetomany.controller

import com.mazbah.hibernatemapping.onetomany.entity.UserLog
import com.mazbah.hibernatemapping.onetomany.repository.UserLogRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/usersLog")
class UserLogController(private val userLogRepository: UserLogRepository)
{
    @GetMapping(value = ["/all"])
    fun getAll(): List<UserLog> {
        return userLogRepository.findAll()
    }

    @PostMapping(value = ["/update"])
    fun update(@RequestBody userLog: UserLog): UserLog {
        return userLogRepository.save(userLog)
    }
}