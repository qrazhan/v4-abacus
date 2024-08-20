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
import kotlin.js.JsExport

/**
 *
 * @param tradingReward
 * @param startedAt
 * @param startedAtHeight
 * @param endedAt
 * @param endedAtHeight
 * @param period
 */
@JsExport
@Serializable
data class IndexerHistoricalTradingRewardAggregation(

    val tradingReward: kotlin.String? = null,
    val startedAt: IndexerIsoString? = null,
    val startedAtHeight: kotlin.String? = null,
    val endedAt: IndexerIsoString? = null,
    val endedAtHeight: kotlin.String? = null,
    val period: IndexerTradingRewardAggregationPeriod? = null
)
