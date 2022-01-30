package com.mazbah.hibernatemapping.onetomany.repository

import com.mazbah.hibernatemapping.onetomany.entity.UserOne
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserOneRepository: JpaRepository<UserOne, Long>