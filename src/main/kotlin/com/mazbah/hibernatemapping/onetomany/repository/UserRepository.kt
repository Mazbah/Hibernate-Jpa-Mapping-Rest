package com.mazbah.hibernatemapping.onetomany.repository

import com.mazbah.hibernatemapping.onetomany.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<User, Long>{
    fun findByName(name: String): User
//    fun findByID(id: Long): User
}