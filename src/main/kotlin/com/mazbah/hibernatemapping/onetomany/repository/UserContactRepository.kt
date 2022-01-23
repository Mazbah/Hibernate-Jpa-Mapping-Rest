package com.mazbah.hibernatemapping.onetomany.repository

import com.mazbah.hibernatemapping.onetomany.entity.UserContact
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserContactRepository: JpaRepository<UserContact, Long> {
}