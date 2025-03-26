@file:JvmName("JsonHandler")

package com.hanzo_ai.api.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hanzo_ai.api.core.http.HttpResponse
import com.hanzo_ai.api.core.http.HttpResponse.Handler
import com.hanzo_ai.api.errors.HanzoInvalidDataException

internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            try {
                return jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw HanzoInvalidDataException("Error reading response", e)
            }
        }
    }
