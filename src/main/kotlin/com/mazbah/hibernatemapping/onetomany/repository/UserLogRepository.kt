package com.mazbah.hibernatemapping.onetomany.repository

import com.mazbah.hibernatemapping.onetomany.entity.UserLog
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserLogRepository: JpaRepository<UserLog, Long>