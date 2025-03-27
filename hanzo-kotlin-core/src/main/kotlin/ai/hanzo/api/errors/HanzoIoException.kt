package ai.hanzo.api.errors

class HanzoIoException(message: String? = null, cause: Throwable? = null) :
    HanzoException(message, cause)
