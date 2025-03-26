// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.errors

import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.http.Headers

abstract class HanzoServiceException
protected constructor(message: String, cause: Throwable? = null) : HanzoException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
