package com.msr.satish_git_sdk.utils

data class CustomException(var statusCode: Int? = 0, var errorMessage: String = "") :
    Exception(errorMessage)