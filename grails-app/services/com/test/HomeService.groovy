package com.test

import com.hello.User
import com.test.co.UserCO
import com.test.dto.UserDTO
import grails.gorm.transactions.Transactional

@Transactional
class HomeService {

    def serviceMethod() {
        return "Shivam and Umesh"
    }

    def saveUserData() {
        User user = new User(firstName: "Arshad", secondName: 'khan', middleName: 'khan')
        user.save(flush: true, failOnError: true)
    }

    def saveUserData(UserCO userCO) {
        User user = new User(firstName: userCO.firstName, secondName: userCO.secondName, middleName: userCO.middleName)
        user.save(flush: true, failOnError: true)
    }

    def getUserById(int id) {
        User user = User.get(id)
        UserDTO userDTO = new UserDTO(user)
        return userDTO
    }

    def getUserByName(String name) {
        User user = User.findBySecondName(name)
        UserDTO userDTO = user ? new UserDTO(user) : new UserDTO()
        return userDTO
    }
}
