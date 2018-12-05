# TEST

## 接口

 - 原生： https://developers.eos.io/eosio-nodeos/reference#get_info
 - O链：https://github.com/OracleChain/EosProxyServer/blob/master/README-cn.md

所以我们的就是  
**URL_DOMAIN_CHAIN：https://xxx.xxx.com/apis**

###  get_info

- 原生：Returns an object containing various details about the blockchain.  

- O链：获取区块链状态  

#### 通信
 - REQ: [GET] URL_DOMAIN_CHAIN/get_info  
 - RSP:  
```json
{
    "code": 0,
    "message": "ok",
    "data": {
        "head_block_num": 23982069,
        "chain_id": "5fff1dae8dc8e2fc4d5b23b2c7665c97f9e9d8edf2b6485a86ba311c25639191",
        "head_block_time": "2018-12-05T07:50:59.000",
        "virtual_block_net_limit": 1048576000,
        "virtual_block_cpu_limit": 250000000,
        "last_irreversible_block_num": 23981736,
        "server_version": "11c25394",
        "block_cpu_limit": 249900,
        "head_block_producer": "blockmatrix2",
        "last_irreversible_block_id": "016deea8832f4593bdce105bb689fde1d422350df130d06ac1a1a50cf3edf025",
        "block_net_limit": 1048576,
        "head_block_id": "016deff5bd7405c6bdc7a0b80b0df4fe1ad4807d4ec725ed1cacd388912adeca",
        "server_version_string": "v1.4.3"
    }
}
```

### ~~create_account~~
- 原生：非  
- O链：注册EOS账号

#### 通信
 - REQ: [GET] URL_DOMAIN_CHAIN/xxx  
 - RSP:  
```json
```

### user/add_new_eos
- 原生：非  
- O链：备份EOS账号至服务器

#### 通信
 - REQ: [GET] URL_DOMAIN_CHAIN/xxx  
```text
ownerKey=EOS6re6s9ARUc4AGuVjQ9peqBhWYeXyXaSE6cB618MzaHe51KXiY5
&activeKey=EOS75FymzrPGwoUizRh7W6L9emEBV668yK16S4KQNht684y6ARNUm
&uid=6930550fdf0c06e50b32057a3175a414
&eosAccountName=senrsl111111
```
 - RSP:  
余额不足
```json
{
	"code": 3050003,
	"message": "assertion failure with message: overdrawn balance",
	"data": null
}
```

### get_account_asset
- 原生：非  
- O链：获取EOS账号信息

#### 通信
 - REQ: [GET] URL_DOMAIN_CHAIN/xxx  
 - RSP:  
```json
```

### get_table_rows
- 原生：Returns an object containing rows from the specified table.  
- O链：获取链上信息

#### 通信
 - REQ: [POST] URL_DOMAIN_CHAIN/get_table_rows  
```json
{
"json":true,
"code":"eosio",
"scope":"eosio",
"table":"rammarket",
"table_key":"",
"lower_bound":"",
"upper_bound":"",
"limit":10
}
```
 - RSP:  
```json
```

### get_rate
- 原生：非  
- O链：获取资产汇率

#### 通信
 - REQ: [GET] URL_DOMAIN_CHAIN/xxx  
 - RSP:  
```json
```

### get_sparklines
- 原生：非  
- O链：获取走势图

#### 通信
 - REQ: [GET] URL_DOMAIN_CHAIN/xxx  
 - RSP:  
```json
```

### abi_json_to_bin
- 原生：Serializes json to binary hex. The resulting binary hex is usually used for the data field in push_transaction.  
- O链：交易JSON序列化

#### 通信
 - REQ: [GET] URL_DOMAIN_CHAIN/xxx  
 - RSP:  
```json
```

### get_required_keys
- 原生：Returns the required keys needed to sign a transaction.  
- O链：获取keys

#### 通信
 - REQ: [GET] URL_DOMAIN_CHAIN/xxx  
 - RSP:  
```json
```

### push_transaction
- 原生：This method expects a transactions in JSON format and will attempt to apply it to the blockchain. This method push multiple transactions at once.  
- O链：发起交易

#### 通信
 - REQ: [GET] URL_DOMAIN_CHAIN/xxx  
 - RSP:  
```json
```

### get_account
- 原生：Returns an object containing various details about a specific account on the blockchain.   
- O链：获取区块链账号信息

#### 通信
 - REQ: [POST] URL_DOMAIN_CHAIN/get_account  
```text
name=eosiojunglez
```
 - RSP:  
```json
```


### 以下为原生实现O链未实现

#### get_block
- 原生：Returns an object containing various details about a specific block on the blockchain.  

#### get_block_header_state
- 原生：param block_num_or_id for Provide a block number or a block id  

#### get_abi
- 原生：param account_name for name of account to retrieve ABI for  eosio token

#### get_code
- 原生：Returns an object containing various details about a specific smart contract on the blockchain.  

#### get_raw_code_and_abi
- 原生：param account_name for Account name to get code and abi for eosio  

#### get_table_by_scope
- 原生：  

#### get_currency_balance
- 原生：  

#### abi_bin_to_json
- 原生：Serializes binary hex to json.  

#### get_currency_stats
- 原生：  

#### get_producers
- 原生：  

#### push_block
- 原生：  

#### push_transactions
- 原生：This method expects a transaction in JSON format and will attempt to apply it to the blockchain.    


工具

> [O链错误码](doc/EOSIO%20API%20ERROR%20CODE%20SPECIFICATION%20(updated%20to%20v1.4.2).xlsx)  
> [O链服务端源码](https://github.com/OracleChain/EosProxyServer)  