package com.model.mixer.controller

import com.model.mixer.constraint.ServiceText
import com.model.mixer.model.dto.UserResult
import com.model.mixer.service.UserManageService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(ServiceText.User.CLIENT_PATH)
@Api(tags = ["用户管理"])
class UserManageController {
    @Autowired
    private lateinit var userManageService: UserManageService

    @ApiOperation("获取全部用户列表")
    @GetMapping(ServiceText.User.FIND_ALL, consumes = [MediaType.ALL_VALUE])
    fun getUserList(): MutableList<UserResult> {
        return userManageService.getUserList()
    }
}