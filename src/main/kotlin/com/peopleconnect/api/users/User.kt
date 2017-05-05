package com.peopleconnect.api.users

/**
 * Created by jovianodias on 05/05/2017.
 */
class User() {
    lateinit var ID: String
    lateinit var username: String
    var address: String? = null

    constructor(
            ID: String,
            username: String,
            address: String? = null) : this() {
        this.ID = ID
        this.username = username
        this.address = address
    }
}