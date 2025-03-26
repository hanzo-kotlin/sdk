package com.hanzo_ai.api.errors

class HanzoInvalidDataException(message: String? = null, cause: Throwable? = null) :
    HanzoException(message, cause)
