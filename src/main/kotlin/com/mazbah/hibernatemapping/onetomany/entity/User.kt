package com.mazbah.hibernatemapping.onetomany.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "users")
data class User(
    @Id @Column(name = "id") @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null,
    @Column(name = "user_no") var userNo: Long? = null,
    @Column(name = "name") var name: String? = null,
    @Column(name = "salary") var salary: Long? = null,
    @Column(name = "team_name") var teamName: String? = null,

    @OneToOne(cascade = [(CascadeType.ALL)], fetch = FetchType.LAZY)
//    @JoinColumn(name = "id", referencedColumnName = "contact_user_no", updatable = false, insertable = false)
    var userContact: UserContact? = null,

//    @OneToMany(cascade = [(CascadeType.ALL)], fetch = FetchType.LAZY)
//    var userLog: UserLog? = null
) : Serializable
