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
 * @param id
 * @param subaccountId
 * @param clientId
 * @param clobPairId
 * @param side
 * @param size
 * @param totalFilled
 * @param price
 * @param type
 * @param reduceOnly
 * @param orderFlags
 * @param goodTilBlock
 * @param goodTilBlockTime
 * @param createdAtHeight
 * @param clientMetadata
 * @param triggerPrice
 * @param timeInForce
 * @param status
 * @param postOnly
 * @param ticker
 * @param updatedAt
 * @param updatedAtHeight
 * @param subaccountNumber
 */
@Serializable
data class IndexerOrderResponseObject(

    val id: kotlin.String? = null,
    val subaccountId: kotlin.String? = null,
    val clientId: kotlin.String? = null,
    val clobPairId: kotlin.String? = null,
    val side: IndexerOrderSide? = null,
    val size: kotlin.String? = null,
    val totalFilled: kotlin.String? = null,
    val price: kotlin.String? = null,
    val type: IndexerOrderType? = null,
    val reduceOnly: kotlin.Boolean? = null,
    val orderFlags: kotlin.String? = null,
    val goodTilBlock: kotlin.String? = null,
    val goodTilBlockTime: kotlin.String? = null,
    val createdAtHeight: kotlin.String? = null,
    val clientMetadata: kotlin.String? = null,
    val triggerPrice: kotlin.String? = null,
    val timeInForce: IndexerAPITimeInForce? = null,
    val status: IndexerAPIOrderStatus? = null,
    val postOnly: kotlin.Boolean? = null,
    val ticker: kotlin.String? = null,
    val updatedAt: IndexerIsoString? = null,
    val updatedAtHeight: kotlin.String? = null,
    val subaccountNumber: kotlin.Int? = null
)
