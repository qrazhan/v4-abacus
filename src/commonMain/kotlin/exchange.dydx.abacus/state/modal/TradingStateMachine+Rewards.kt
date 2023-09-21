package exchange.dydx.abacus.state.modal

import exchange.dydx.abacus.state.changes.Changes
import exchange.dydx.abacus.state.changes.StateChanges
import kollections.iListOf
import kollections.toIMap
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonObject

internal fun TradingStateMachine.onChainRewardsParams(payload: String): StateChanges {
    val json = Json.parseToJsonElement(payload).jsonObject.toIMap()
    val map = parser.asMap(json)
    val params = parser.asMap(map?.get("params"))
    rewardsParams =
        if (params != null)
            rewardsProcessor.received(parser.asMap(rewardsParams), params)
        else
            null
    return StateChanges(iListOf())
}

internal fun TradingStateMachine.onChainRewardTokenPrice(payload: String): StateChanges {
    val json = Json.parseToJsonElement(payload).jsonObject.toIMap()
    val map = parser.asMap(json)
    val price = parser.asMap(map?.get("marketPrice"))
    rewardsParams =
        if (price != null)
            rewardsProcessor.receivedTokenPrice(parser.asMap(rewardsParams), price)
        else
            null
    return StateChanges(iListOf())
}

