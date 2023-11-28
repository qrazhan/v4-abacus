package exchange.dydx.abacus.processor.markets

import exchange.dydx.abacus.processor.base.BaseProcessor
import exchange.dydx.abacus.protocols.ParserProtocol

internal class TradeProcessor(parser: ParserProtocol) : BaseProcessor(parser) {
    private val tradeKeyMap = mapOf(
        "string" to mapOf(
            "id" to "id",
            "side" to "side",
            "type" to "type",
        ),
        "double" to mapOf(
            "size" to "size",
            "price" to "price"
        ),
        "datetime" to mapOf(
            "createdAt" to "createdAt"
        ),
    )

    private val sideStringKeys = mapOf(
        "BUY" to "APP.GENERAL.BUY",
        "SELL" to "APP.GENERAL.SELL"
    )

    override fun received(existing: Map<String, Any>?, payload: Map<String, Any>): Map<String, Any> {
        val trade = transform(existing, payload, tradeKeyMap)

        val type = parser.asString(payload["type"])
        if (type == null) {
            val liquidation = parser.asBool(payload["liquidation"])
            if (liquidation == true) {
                trade["type"] = "LIQUIDATED"
            }
        }

        val resources = mutableMapOf<String, Any>()

        (parser.asString(payload["side"])).let {
            sideStringKeys[it]?.let {
                resources["sideStringKey"] = it
            }
        }
        trade["resources"] = resources
        return trade
    }
}
