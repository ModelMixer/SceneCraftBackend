package com.model.mixer.service.impl

import com.model.mixer.model.dto.UserResult
import com.model.mixer.service.UserManageService
import org.jooq.DSLContext;
import org.jooq.generated.tables.User
import org.springframework.stereotype.Service

@Service
class UserManageServiceImpl(private val dslContext: DSLContext) : UserManageService {
    override fun getUserList(): MutableList<UserResult> {
        return dslContext.selectFrom(User.USER).fetchInto(UserResult::class.java)
    }
}