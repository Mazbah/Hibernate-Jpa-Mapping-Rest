package com.mazbah.hibernatemapping.onetomany.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "users")
data class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null,
    @Column(name = "name") val name: String? = null,

    @OneToOne(mappedBy = "user")
    @JsonIgnore val userContact: UserContact? = null
) : Serializable
