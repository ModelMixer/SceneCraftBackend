package com.model.mixer.model.dto

import io.swagger.annotations.ApiModelProperty


class UserResult {
    @ApiModelProperty("用户Id")
    var id: Int? = null

    @ApiModelProperty("用户名称")
    var username: String = String()


    @ApiModelProperty("昵称")
    var nickname: String? = null
}