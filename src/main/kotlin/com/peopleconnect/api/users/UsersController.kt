package com.peopleconnect.api.users

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by jovianodias on 05/05/2017.
 */
@RestController
class UsersController {
//    @RequestMapping(value = "/")
//    fun helloSpringBoot() = "Hello SpringBoot"

    // Our users database
    @Autowired
    private lateinit var database: UsersDatabase

    @RequestMapping("", method = arrayOf(RequestMethod.GET))
    fun books() = database.getUsers()
}