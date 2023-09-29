package exchange.dydx.abacus.tests.payloads

class EnvironmentsMock {
    internal val environments = """
        {
           "deployments":{
              "MAINNET":null,
              "TESTNET":{
                 "environments":[
                    "dydxprotocol-testnet"
                 ],
                 "default":"dydxprotocol-testnet"
              },
              "DEV":{
                 "environments":[
                    "dydxprotocol-staging",
                    "dydxprotocol-testnet"
                 ],
                 "default":"dydxprotocol-staging"
              }
           },
           "environments":{
              "dydxprotocol-staging":{
                 "name":"v4 Staging",
                 "ethereumChainId":"5",
                 "dydxChainId":"dydxprotocol-testnet",
                 "isMainNet":false,
                 "tokens":{
                    "chain": {
                       "name": "DYDX",
                       "denom": "dv4tnt",
                       "image": "/currencies/dydx.png"
                    },
                    "usdc": {
                       "name": "USDC",
                       "denom": "ibc/8E27BA2D5493AF5636760E354E46004562C46AB7EC0CC4C1CA14E9E20E2545B5",
                       "image": "/currencies/usdc.png"
                    }
                 },
                 "endpoints":{
                    "indexers":[
                       {
                          "api":"https://indexer.v4staging.dydx.exchange",
                          "socket":"wss://indexer.v4staging.dydx.exchange"
                       }
                    ],
                    "faucet":"https://faucet.v4staging.dydx.exchange",
                    "validators":[
                       "https://validator.v4staging.dydx.exchange"
                    ],
                    "0xsquid":"https://squid-api-git-main-cosmos-testnet-0xsquid.vercel.app"
                 },
                 "links":{
                    "tos":"https://dydx.exchange/v4-terms",
                    "privacy":"https://dydx.exchange/privacy",
                    "mintscan":"https://testnet.mintscan.io/dydx-testnet/txs/{tx_hash}",
                    "documentation":"https://v4-teacher.vercel.app/",
                    "community":"https://discord.com/invite/dydx",
                    "feedback":"https://docs.google.com/forms/d/e/1FAIpQLSezLsWCKvAYDEb7L-2O4wOON1T56xxro9A2Azvl6IxXHP_15Q/viewform"
                 }
              },
              "dydxprotocol-testnet":{
                 "name":"v4 Public Testnet",
                 "ethereumChainId":"5",
                 "dydxChainId":"dydx-testnet-3",
                 "isMainNet":false,
                 "tokens":{
                    "chain": {
                       "name": "DYDX",
                       "denom": "dv4tnt",
                       "image": "/currencies/dydx.png"
                    },
                    "usdc": {
                       "name": "USDC",
                       "denom": "ibc/8E27BA2D5493AF5636760E354E46004562C46AB7EC0CC4C1CA14E9E20E2545B5",
                       "image": "/currencies/usdc.png"
                    }
                 },
                 "endpoints":{
                    "indexers":[
                       {
                          "api":"https://dydx-testnet.imperator.co",
                          "socket":"wss://dydx-testnet.imperator.co"
                       }
                    ],
                    "validators":[
                       "https://dydx-testnet.nodefleet.org",
                       "https://dydx-testnet-archive.allthatnode.com:26657/XZvMM41hESf8PJrEQiTzbCOMVyFca79R",
                       "https://test-dydx.kingnodes.com/"
                    ],
                    "0xsquid":"https://squid-api-git-main-cosmos-testnet-0xsquid.vercel.app",
                    "faucet":"https://faucet.v4testnet.dydx.exchange"
                 },
                 "links":{
                    "tos":"https://dydx.exchange/v4-terms",
                    "privacy":"https://dydx.exchange/privacy",
                    "mintscan":"https://testnet.mintscan.io/dydx-testnet/txs/{tx_hash}",
                    "documentation":"https://v4-teacher.vercel.app/",
                    "community":"https://discord.com/invite/dydx",
                    "feedback":"https://docs.google.com/forms/d/e/1FAIpQLSezLsWCKvAYDEb7L-2O4wOON1T56xxro9A2Azvl6IxXHP_15Q/viewform"
                 }
              }
           }
        }
    """.trimIndent()
}