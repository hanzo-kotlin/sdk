// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.openai.deployments

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeploymentCompleteResponseTest {

    @Test
    fun create() {
        val deploymentCompleteResponse = DeploymentCompleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val deploymentCompleteResponse = DeploymentCompleteResponse.builder().build()

        val roundtrippedDeploymentCompleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(deploymentCompleteResponse),
                jacksonTypeRef<DeploymentCompleteResponse>(),
            )

        assertThat(roundtrippedDeploymentCompleteResponse).isEqualTo(deploymentCompleteResponse)
    }
}
