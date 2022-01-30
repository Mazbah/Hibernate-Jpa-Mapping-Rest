package com.mazbah.hibernatemapping.onetomany.entity

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "user_logs")
data class UserLog(
    @Id @Column(name = "id") @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null,
    @Column(name = "log") var log: String? = null,
    @Column(name = "user_no") var userNo: Long? = null,

    @ManyToOne(cascade = [(CascadeType.ALL)],fetch = FetchType.LAZY)
    @JoinColumn(name = "user_no", referencedColumnName = "one_id", updatable = false, insertable = false)
    var userOne: UserOne? = null
) : Serializable