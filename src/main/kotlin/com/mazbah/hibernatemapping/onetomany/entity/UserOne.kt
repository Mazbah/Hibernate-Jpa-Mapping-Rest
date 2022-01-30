package com.mazbah.hibernatemapping.onetomany.entity

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "user_ones")
data class UserOne(
    @Id @Column(name = "id") @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null,
    @Column(name = "name") var name: String? = null,
    @Column(name = "salary") var salary: Long? = null,
    @Column(name = "one_id") var oneId: Long? = null,

    @OneToMany(cascade = [(CascadeType.ALL)],fetch = FetchType.LAZY, mappedBy = "userOne")
    var userLog: List<UserLog>? = null
): Serializable