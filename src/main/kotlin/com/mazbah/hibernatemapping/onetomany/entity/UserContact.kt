package com.mazbah.hibernatemapping.onetomany.entity

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "user_contacts")
data class UserContact(
    @Column(name = "id") @GeneratedValue(strategy = GenerationType.AUTO) var id: Long? = null,
    @Column(name = "phone_no") var phoneNo: Long? = null,
    @Id @Column(name = "contact_user_no") var contactUserNo: Long? = null,

    @OneToOne(cascade = [(CascadeType.ALL)])
    @JoinColumn(name = "contact_user_no", referencedColumnName = "id", updatable = false, insertable = false)
    var user: User? = null
) : Serializable