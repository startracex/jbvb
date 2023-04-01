# 输入/表单

## 输入

`reset()` 重设为默认值

`namevalue()` 以数组[name,value]形式获取input的name和value

### label-input

label-input.js 包含一个被label完全包含的输入框

| 属性  | 类型   | 默认值        | 描述          |
| ----- | ------ | ------------- | ------------- |
| label | string | ""            | label的值     |
| type  | string | "text"        | input的类型   |
| name  | string | laebl or type | input的name   |
| pla   | string | ""            | input的提示   |
| def   | string | ""            | input的默认值 |
| value | string | def           | input的值     |

### base-input

base-input 包含一个基础的输入框

属性包含label-input的全部属性以及input的可用属性

### exp-input

exp-input 包含一个普通输入框的样式拓展

属性包含label-input的全部属性和以下

| 属性   | 类型   | 默认值 | 描述           |
| ------ | ------ | ------ | -------------- |
| base   | string | ""     | 拓展样式类型   |
| offset | string | "0"    | 说明水平偏移量 |

### search-input

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

## 表单

### sign-form

sign-form 包含一个基础的登录/注册表单

| 属性   | 类型     | 默认值 | 描述     |
| ------ | -------- | ------ | -------- |
| method | string   | "post" | form方法 |
| submit | function | ()=>{} | 提交     |

如果reset为 `true` 则会添加一个重置按钮

### search-w

search-w 包含了主要搜索引擎的合集

| 属性   | 类型   | 默认值   | 描述           |
| ------ | ------ | -------- | -------------- |
| origin | string | 我不知道 | 引擎的名称     |
| action | string | 我不知道 | 引擎的地址     |
| pla    | string | 我不知道 | 搜索框的提示   |
| name   | string | 我不知道 | 搜索请求的name |
