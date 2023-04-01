# Items

## base-button

base-button 是普通按钮

|属性|类型|默认值|描述|
|---|---|---|---|
|disabled|Boolean|false|禁用按钮|
|ghost|Boolean|false|幽灵按钮|
|color|string|""|色调|

使用名称为`pre`和`suf`的slot元素指定前置元素和后置元素

如果使用多个按钮,可以使用[`button-group`](./group#button-group)

## base-switch

base-switch 是普通开关(checkbox input)

|属性|类型|默认值|描述|
|---|---|---|---|
|disabled|Boolean|false|禁用输入|
|checked|boolean|false|Input checked (覆盖def)|
|fat|boolean|false|使用fat样式 (默认为 rect)|
|def|string|"false"|默认值(将尝试解析字符传)|
|name|string|"checkbox"|Input name|
|value|string|"on"|Input value|

使用 name 为 `true` , `false` , `always` 的 slot 元素为不同的选择设置显示项

## dialog-item

dialog-item 是dialog的拓展

|属性|类型|默认值|描述|
|---|---|---|---|
|key|string|""|允许Esc键控制关闭|
|scale|boolean|false|允许缩放|
|model|boolean|false|是否默认为模态|
|call|string|"center"|弹出位置|

通过`show()`默认显示,`showModel()`以模态显示,通过`close()`隐藏

## details-item

details-item 是details的拓展

|属性|类型|默认值|描述|
|---|---|---|---|
|open|boolean|false|是否默认打开|

通过`toggle()`更改open状态,`isopen()`会返回此时的open值

如果使用多个details,可以使用[`details-group`](./group#details-group)

## alert-item

|属性|类型|默认值|描述|
|---|---|---|---|
|autoclose|Number|0|自动关闭时间(毫秒)|
|call|string|"info"|样式|

可以使用`info`,`danger`,`success`,`warning`来设置样式,设置非零的`autoclose`或使用`close()`移除

## avatar-anchor

avatar-anchor 是创建用户实例的组件

|属性|类型|默认值|描述|
|---|---|---|---|
|name|string|""|无图像时显示的用户名|
|src|string|""|图像源|
|href|string|""|跳转链接|
|gap|boolean|false|将slot元素至于底层|
|more|number|0|隐藏的数量|
|call|string|"center"|对齐方式|

使用 name 为 `state` 的 slot 元素设置状态点

使用 name 为 `bar` 的 slot 元素设置状态栏

如果使用多个avatar-auchor,可以使用[`avatar-group`](./group#avatar-group)

## super-a

super-a 是a的拓展

|属性|类型|默认值|描述|
|---|---|---|---|
|href|string|""|跳转链接|
|target|string|""|跳转方式|
|active|string|""|在指向链接为此页时添加的类名|
|arrow|string|""|显示附带的图标|

使用名称为`pre`和`suf`的slot元素指定前置元素和后置元素
