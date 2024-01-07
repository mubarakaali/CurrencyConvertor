package com.rates.domain.models.signup

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class SignupRequestTest{

      @Test
      fun `empty username return false`(){
            val result = SignupRequest(
                  name = "",
                  phoneNo = "03137812781",
                  cnic = "2309230293",
                  password = "1234444",
                  userType = "1"

            ).validateData()
            assertThat(result).isFalse()
      }

      @Test
      fun `empty phone no returns false`(){
            val result = SignupRequest(
                  name = "ali",
                  phoneNo = "",
                  cnic = "2309230293",
                  password = "1234444",
                  userType = "1"

            ).validateData()

            assertThat(result).isFalse()
      }
      @Test
      fun `empty cnic returns false`(){
            val result = SignupRequest(
                  name = "ali",
                  phoneNo = "23123",
                  cnic = "",
                  password = "1234444",
                  userType = "1"

            ).validateData()

            assertThat(result).isFalse()
      }
      @Test
      fun `empty password returns false`(){
            val result = SignupRequest(
                  name = "ali",
                  phoneNo = "02323232323",
                  cnic = "2309230293",
                  password = "",
                  userType = "1"

            ).validateData()

            assertThat(result).isFalse()
      }

      @Test
      fun `empty userType returns false`(){
            val result = SignupRequest(
                  name = "ali",
                  phoneNo = "02323232323",
                  cnic = "2309230293",
                  password = "1234",
                  userType = ""

            ).validateData()

            assertThat(result).isFalse()
      }
}