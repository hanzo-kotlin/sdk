// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.services.blocking.audio.SpeechService
import ai.hanzo.api.services.blocking.audio.TranscriptionService

interface AudioService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun speech(): SpeechService

    fun transcriptions(): TranscriptionService

    /** A view of [AudioService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun speech(): SpeechService.WithRawResponse

        fun transcriptions(): TranscriptionService.WithRawResponse
    }
}
