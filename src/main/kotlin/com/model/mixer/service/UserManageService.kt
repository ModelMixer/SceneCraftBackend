package com.model.mixer.service

import com.model.mixer.model.dto.UserResult

interface UserManageService {
    fun getUserList(): MutableList<UserResult>
}