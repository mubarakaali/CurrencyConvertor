package com.northsoltech.sign.ui.signin

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.northsoltech.framework.states.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
) : ViewModel() {

    val uiState = mutableStateOf<UiState>(UiState.Idle)

    fun userLogin(
        phoneNo: String,
        password: String,
        onUserAuthentcated: () -> Unit,
        onUserAuthentcateFailed: (error: String) -> Unit,
    ) {
//        viewModelScope.launch {
//            Log.d(JE_TAG, "userLogin: phoneNo $phoneNo,  password $password")
//            if (phoneNo.isEmpty() || password.isEmpty()) {
//                onUserAuthentcateFailed("Please fill the data correctly")
//                return@launch
//            }
//            signingRepository.signing(
//                phoneNo = phoneNo,
//                password = password
//            ).collect {
//                when (it) {
//                    is ApiResource.Loading -> {
//                        uiState.value = UiState.Loading
//                    }
//                    is ApiResource.Valid -> {
//                        uiState.value = UiState.Success
//                        Log.d(JE_TAG, "viewModel userLogin Sucess ${it.data}")
//                        if (it.data.token == null) {
//                            onUserAuthentcateFailed("Something went wrong")
//                        } else {
//                            userDataPreferenceManager.updateData { userPreference ->
//                                userPreference.copy(
//                                    token = it.data.token!!.toPreferenceToken(),
//                                    user = it.data.user!!.toPreferenceUser()
//                                )
//                            }
//                            onUserAuthentcated()
//                        }
//                    }
//                    is ApiResource.Invalid -> {
//                        uiState.value = UiState.Error(it.message)
//                        onUserAuthentcateFailed(it.message)
//                    }
//                }
//            }
//        }

    }

//    private fun Token.toPreferenceToken(): TokenPreference =
//        TokenPreference(accessToken = accessToken!!)
//
//    private fun User.toPreferenceUser(): UserPreference = UserPreference(
//        id = id!!,
//        name = name!!,
//        phoneNo = phoneNo!!,
//        userType = userType!!
//    )

}