package com.northsoltech.sign.ui.signup

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.northsoltech.framework.states.UiState
import com.northsoltech.framework.utils.enums.UserType
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SignupViewModel  @Inject constructor(
) : ViewModel() {

    var userType = mutableStateOf(UserType.USER)

    var uiState = mutableStateOf<UiState>(UiState.Idle)

    fun onSignUp(
        name: String,
        phoneNo: String,
        cnicNumber: String,
        password: String,
        onUserAuthenticated:()->Unit,
        onUserAuthenticateFailed:(error:String)->Unit,
    ) {
//        val signupRequest = SignupRequest(
//            name = name,
//            phoneNo = phoneNo,
//            cnic = cnicNumber,
//            password = password,
//            userType = userType.value.id
//        )
//        Log.d(JE_TAG, "SignupViewModel onSignUp: signupRequest... $signupRequest")
//        if (signupRequest.validateData()) {
//            viewModelScope.launch {
//                signupRepository.signup(
//                    signupRequest = signupRequest
//                ).collect {
//                    when (it) {
//                        is ApiResource.Loading -> {
//                            uiState.value = UiState.Loading
//                        }
//                        is ApiResource.Valid -> {
//                            uiState.value = UiState.Success
//                            onUserAuthenticated()
//                        }
//                        is ApiResource.Invalid->{
//                            uiState.value = UiState.Error(it.message)
//                            onUserAuthenticateFailed(it.message)
//                        }
//                    }
//                }
//            }
//        }

    }

}