package com.model.mixer.constraint

object ServiceText {

    object Example {
        private const val SERVICE_PATH = "/example"
        const val CLIENT_PATH = ServiceMetaText.CLIENT_PATH_PREFIX + SERVICE_PATH

        const val CREATE = ""
    }
    object User{
        private const val SERVICE_PATH = "/user"
        const val CLIENT_PATH = ServiceMetaText.CLIENT_PATH_PREFIX + SERVICE_PATH

        const val CREATE = ""
        const val UPDATE = ""
        const val DELETE = ""
        const val PAGE ="/page"
        const val FIND_ALL = "/all"
    }
}
