package com.test.dto

import com.hello.User

class UserDTO {

    String firstName
    String middleName
    String secondName

    UserDTO() {

    }

    UserDTO(User user) {
        this.firstName = user.firstName
        this.middleName = user.middleName
        this.secondName = user.secondName
    }

}
