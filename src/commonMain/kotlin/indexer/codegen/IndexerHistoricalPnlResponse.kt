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
 * @param pageSize
 * @param totalResults
 * @param offset
 * @param historicalPnl
 */
@Serializable
data class IndexerHistoricalPnlResponse(

    val pageSize: kotlin.Int? = null,
    val totalResults: kotlin.Int? = null,
    val offset: kotlin.Int? = null,
    val historicalPnl: kotlin.Array<IndexerPnlTicksResponseObject>? = null
)
