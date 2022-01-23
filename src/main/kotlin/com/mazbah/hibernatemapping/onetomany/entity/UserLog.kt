package com.mazbah.hibernatemapping.onetomany.entity

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "user_logs")
data class UserLog(
    @Id @Column(name = "id") @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null,
    @Column(name = "log") var log: String? = null,
    @Column(name = "log_user_no") var logUserNo: Long? = null,

    @ManyToOne(cascade = [(CascadeType.ALL)])
    @JoinColumn(name = "log_user_no", referencedColumnName = "id", updatable = false, insertable = false)
    var user: User? = null
) : Serializable