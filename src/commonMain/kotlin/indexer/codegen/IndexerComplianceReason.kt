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
 * Values: MANUAL,USGEO,CAGEO,GBGEO,SANCTIONEDGEO,COMPLIANCEPROVIDER
 */
@Serializable
enum class IndexerComplianceReason(val value: kotlin.String) {
    MANUAL("MANUAL"), // :/
    USGEO("US_GEO"), // :/
    CAGEO("CA_GEO"), // :/
    GBGEO("GB_GEO"), // :/
    SANCTIONEDGEO("SANCTIONED_GEO"), // :/
    COMPLIANCEPROVIDER("COMPLIANCE_PROVIDER"); // :/
}
