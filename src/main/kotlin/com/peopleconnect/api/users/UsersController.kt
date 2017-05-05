package com.peopleconnect.api.users

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable


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

    // / path gets all users in the users database
    @RequestMapping("", method = arrayOf(RequestMethod.GET))
    fun users() = database.getUsers()

    // /{username} path gets details of a user with {username}
    @RequestMapping(value = "/{username}", method = arrayOf(RequestMethod.GET))
    fun getUser(@PathVariable username: String?): User? {
        if (username != null) {
            return database.getUser(username)
        } else {
            return null
        }
    }

//    @RequestMapping(value = "/{user}/customers", method = arrayOf(RequestMethod.GET))
//    fun getUserCustomers(@PathVariable user: Long?): List<User> {
//        // ...
//    }
//
//    @RequestMapping(value = "/{user}", method = arrayOf(RequestMethod.DELETE))
//    fun deleteUser(@PathVariable user: Long?): User {
//        // ...
//    }

}