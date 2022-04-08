package com.hello

class User {

    int id
    String firstName
    String secondName
    String middleName
    String password
    static constraints = {
        middleName nullable: true
    }
}
