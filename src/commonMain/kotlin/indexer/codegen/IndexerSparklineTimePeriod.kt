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
 * Values: ONEDAY,SEVENDAYS
 */
@JsExport
@Serializable
enum class IndexerSparklineTimePeriod(val value: kotlin.String) {
    ONEDAY("ONE_DAY"), // :/
    SEVENDAYS("SEVEN_DAYS"); // :/
}
