package exchange.dydx.abacus.state.manager.notification

import exchange.dydx.abacus.output.Notification
import exchange.dydx.abacus.protocols.ParserProtocol
import exchange.dydx.abacus.state.manager.V4Environment
import exchange.dydx.abacus.state.manager.notification.providers.BlockRewardNotificationProvider
import exchange.dydx.abacus.state.manager.notification.providers.OrderStatusChangesNotificationProvider
import exchange.dydx.abacus.state.model.TradingStateMachine
import exchange.dydx.abacus.utils.IMap
import exchange.dydx.abacus.utils.JsonEncoder
import exchange.dydx.abacus.utils.ParsingHelper
import exchange.dydx.abacus.utils.UIImplementations
import kollections.toIMap

interface NotificationsProviderProtocol {
    fun buildNotifications(
        subaccountNumber: Int
    ): IMap<String, Notification>
}

class NotificationsProvider(
    private val stateMachine: TradingStateMachine,
    private val uiImplementations: UIImplementations,
    private val environment: V4Environment,
    private val parser: ParserProtocol,
    private val jsonEncoder: JsonEncoder,
    private val useParentSubaccount: Boolean = false,
    private val providers: List<NotificationsProviderProtocol> = listOf(
        BlockRewardNotificationProvider(
            stateMachine,
            uiImplementations,
            environment,
            jsonEncoder,
        ),
        FillsNotificationProvider(
            stateMachine,
            uiImplementations,
            parser,
            jsonEncoder,
        ),
        PositionsNotificationProvider(
            stateMachine,
            uiImplementations,
            parser,
            jsonEncoder,
            useParentSubaccount,
        ),
        OrderStatusChangesNotificationProvider(
            stateMachine,
            uiImplementations,
            parser,
            jsonEncoder,
        ),
    ),
) : NotificationsProviderProtocol {

    override fun buildNotifications(
        subaccountNumber: Int
    ): IMap<String, Notification> {
        var merged: Map<String, Notification>? = null

        providers.forEach { provider ->
            val notifications = provider.buildNotifications(subaccountNumber)
            merged = ParsingHelper.merge(merged, notifications) as? Map<String, Notification>
        }

        return merged?.toIMap() ?: kollections.iMapOf()
    }
}
