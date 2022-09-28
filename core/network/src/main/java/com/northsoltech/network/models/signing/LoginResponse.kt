package com.northsoltech.network.models.signing


import com.northsoltech.domain.models.loging.LoginData
import com.northsoltech.domain.models.loging.Token
import com.northsoltech.domain.models.loging.User
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LoginResponse(
    @SerialName("data")
    var `data`: Data?,
    @SerialName("message")
    var message: String?,
    @SerialName("statusCode")
    var statusCode: Int?
){
    fun toDomain() = LoginData(
        token = data?.tokenDTO?.toTokenDomain(),
        user = data?.user?.toUserDomain()
    )

    private fun TokenDTO.toTokenDomain() = Token(
        accessToken = accessToken
    )

    private fun UserDTO.toUserDomain() = User(
        id = id,
        name = name,
        phoneNo = phoneNo,
        userType = userType
    )
}