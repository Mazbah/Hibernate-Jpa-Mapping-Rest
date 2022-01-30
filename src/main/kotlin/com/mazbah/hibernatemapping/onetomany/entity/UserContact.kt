package com.mazbah.hibernatemapping.onetomany.entity

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "user_contacts")
data class UserContact(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null,
    @Column(name = "phone_no") val phoneNo: Long? = null,

    @OneToOne(cascade = [(CascadeType.ALL)])
    @JoinColumn(name = "user_no", referencedColumnName = "id")
    val user: User? = null
) : Serializable
