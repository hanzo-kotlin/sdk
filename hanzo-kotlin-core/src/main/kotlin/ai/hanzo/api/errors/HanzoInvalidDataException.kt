package ai.hanzo.api.errors

class HanzoInvalidDataException(message: String? = null, cause: Throwable? = null) :
    HanzoException(message, cause)
