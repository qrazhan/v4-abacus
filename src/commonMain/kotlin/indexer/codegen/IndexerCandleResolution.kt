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
 * Values: _1MIN,_5MINS,_15MINS,_30MINS,_1HOUR,_4HOURS,_1DAY
 */
@Serializable
enum class IndexerCandleResolution(val value: kotlin.String) {
    _1MIN("1MIN"), // :/
    _5MINS("5MINS"), // :/
    _15MINS("15MINS"), // :/
    _30MINS("30MINS"), // :/
    _1HOUR("1HOUR"), // :/
    _4HOURS("4HOURS"), // :/
    _1DAY("1DAY"); // :/
}
