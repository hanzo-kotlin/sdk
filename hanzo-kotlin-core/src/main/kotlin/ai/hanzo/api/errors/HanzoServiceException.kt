// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.errors

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.http.Headers

abstract class HanzoServiceException
protected constructor(message: String, cause: Throwable? = null) : HanzoException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
