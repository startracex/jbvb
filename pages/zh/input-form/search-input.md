# search-input

search-input 包含一个多功能搜索框,用于通过页面或服务器或网络获取内容

| 属性   | 类型    | 默认值 | 描述               |
| ------ | ------- | ------ | ------------------ |
| query  | string  | ""     | 查询内容的索引     |
| target | string  | ""     | 查询结构的展示目标 |
| remote | boolean | false  | 更改为从远程搜索   |
| infer  | boolean | false  | 展示推断           |
| action | string  | "./"   | form行为           |
| method | string  | "get"  | form方法           |
| name   | string  | "q"    | 搜索索引           |

如果remote为 `false` 将从文档中搜索. 从全部 `query` 中搜索输入值,并放置于
`target` 中

如果remote为 `true` 请设置远程地址. 如果infer为 `true`
将会展示一个推断列表,可从远程获取