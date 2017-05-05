package com.peopleconnect.api.users

import org.springframework.stereotype.Component
import java.awt.print.Book
import javax.annotation.PostConstruct

/**
 * Created by jovianodias on 05/05/2017.
 */
@Component
class UsersDatabase {

    // All of our users will live here
    private val users = mutableListOf<User>()

    @PostConstruct
    private fun init() {

        // Fill our "database"
        users.add(User(
                "1",
                "jovistruck",
                "44 Valley House"))

        users.add(User(
                "2",
                "joel",
                "44 Valley House"))

        users.add(User(
                "3",
                "ken",
                "10 Greenways Drive, Hounslow"))
    }

    /**
    **
    * Returns a list of all users
    */
    fun getUsers() = users

    /**
     * Gets the given user
     *
     * @return  true - if the user was successfully added
     *          false - otherwise
     */
    fun getUser(user: String): User? {
        return users.find { it.username == user }
    }

    /**
     * Adds the given user only if a user with
     * the same ID doesn't already exist.
     *
     * @return  true - if the user was successfully added
     *          false - otherwise
     */
    fun addUser(user: User): Boolean {
        users.firstOrNull { it.ID == user.ID }?.let {
            // A book with the same ISBN exist
            return false
        }

        // If we get to this line -
        // that means a book with the same ISBN
        // doesn't exist.
        users.add(user)
        return true
    }
}
