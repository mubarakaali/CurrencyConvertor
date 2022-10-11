package com.northsoltech.domain.models.signup

/**
 * usertype rider = 1
 * usertype customer = 2
 */

data class SignupRequest(
    var name: String,
    var phoneNo: String,
    var cnic: String,
    var password: String,
    var userType: String
){

    fun validateData():Boolean{
        return !(name.isEmpty()||phoneNo.isEmpty()||cnic.isEmpty()||password.isEmpty()||userType.isEmpty())
    }
}