/**
 * Indexer API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package indexer.codegen

import kotlinx.serialization.Serializable

/**
 *
 * @param iso
 * @param epoch
 */
@Serializable
data class IndexerTimeResponse(

    val iso: IndexerIsoString? = null,
    val epoch: kotlin.Double? = null
)
