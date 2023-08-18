package com.model.mixer.service.impl

import com.model.mixer.model.dto.UserResult
import com.model.mixer.service.UserManageService
import org.jooq.DSLContext;
import org.jooq.generated.tables.SysUser
import org.springframework.stereotype.Service

@Service
class UserManageServiceImpl :UserManageService {
   private lateinit var  dslContext:DSLContext
    override fun getUserList(): MutableList<UserResult> {
       return dslContext.selectFrom(User.User).fetchInto(UserResult::class.java)
    }
}