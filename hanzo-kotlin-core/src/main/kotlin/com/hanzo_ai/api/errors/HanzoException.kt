package com.hanzo_ai.api.errors

open class HanzoException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
