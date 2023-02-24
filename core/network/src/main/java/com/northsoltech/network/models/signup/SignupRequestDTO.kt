package com.northsoltech.network.models.signup


import com.northsoltech.domain.models.signup.SignupRequest
import com.northsoltech.network.transform.TransformableToDTO
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

//1 for rider
//2 for user
@Serializable
data class SignupRequestDTO(
    @SerialName("cnic")
    var cnic: String?,
    @SerialName("name")
    var name: String?,
    @SerialName("password")
    var password: String?,
    @SerialName("phone_no")
    var phoneNo: String?,
    @SerialName("user_type")
    var userType: String?
) {
    companion object : TransformableToDTO<SignupRequestDTO, SignupRequest> {
        override fun fromDomain(req: SignupRequest) = SignupRequestDTO(
            cnic = req.cnic,
            name = req.name,
            password = req.password,
            phoneNo = req.phoneNo,
            userType = req.userType
        )

    }
}