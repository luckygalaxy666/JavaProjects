# 目录

<!-- vim-markdown-toc GFM -->

* [整体流程](#整体流程)
* [WEB前端](#web前端)
    * [HTML](#html)
        * [CSS引入方式](#css引入方式)
        * [CSS选择器](#css选择器)
        * [CSS属性](#css属性)
        * [CSS盒子模型](#css盒子模型)
        * [表单标签](#表单标签)
    * [JavaScript](#javascript)
        * [JavaScirpt引入方式](#javascirpt引入方式)
        * [输出语句](#输出语句)
        * [变量](#变量)
        * [函数](#函数)
        * [对象](#对象)
            * [Array](#array)
            * [String](#string)
            * [Json](#json)
            * [Bom](#bom)
            * [Dom](#dom)
            * [事件](#事件)
    * [Vue](#vue)
        * [Vue生命周期](#vue生命周期)
    * [Ajax](#ajax)
* [Maven](#maven)
    * [依赖范围](#依赖范围)
    * [生命周期](#生命周期)
* [SpringBoot](#springboot)
* [HTTP](#http)
    * [请求协议](#请求协议)
    * [响应协议](#响应协议)
* [请求响应](#请求响应)
    * [简单参数&&实体参数](#简单参数实体参数)
    * [数组参数&&集合参数](#数组参数集合参数)
    * [日期参数&&Json参数](#日期参数json参数)
    * [路径参数](#路径参数)
    * [统一响应格式](#统一响应格式)
* [分层解耦](#分层解耦)
    * [三层架构](#三层架构)
    * [分层解耦](#分层解耦-1)
* [Mysql](#mysql)
    * [SQL语句](#sql语句)
        * [DDL语句](#ddl语句)
        * [DML语句](#dml语句)
        * [DQL语句](#dql语句)
        * [外键约束](#外键约束)
    * [连接查询](#连接查询)
    * [事务管理](#事务管理)
    * [索引优化](#索引优化)
    * [数据库连接池](#数据库连接池)
    * [lombok](#lombok)
* [Mybatis](#mybatis)
    * [预编译SQL](#预编译sql)
        * [SQL注入](#sql注入)
    * [添加数据](#添加数据)
    * [XML映射文件](#xml映射文件)
        * [动态SQL](#动态sql)
    * [PageHelper](#pagehelper)
* [yml配置文件](#yml配置文件)
* [会话跟踪](#会话跟踪)
    * [JWT](#jwt)
* [Filter](#filter)
    * [过滤器链](#过滤器链)
* [Interceptor](#interceptor)
    * [拦截路径](#拦截路径)
    * [FIlter和Interceptor区别](#filter和interceptor区别)
* [全局异常处理器](#全局异常处理器)
* [事务管理 @Transactional](#事务管理-transactional)
* [AOP 面向切面编程](#aop-面向切面编程)
    * [通知类型](#通知类型)
    * [切入点表达式](#切入点表达式)
    * [连接点](#连接点)
* [Bean管理](#bean管理)
    * [获取Bean对象](#获取bean对象)
    * [Bean的作用域](#bean的作用域)
    * [第三方Bean](#第三方bean)
* [SpringBoot](#springboot-1)
    * [自动配置](#自动配置)
        * [自动配置原理](#自动配置原理)
    * [自定义Starter](#自定义starter)
* [Maven高级](#maven高级)
    * [分模块设计](#分模块设计)
    * [继承设计](#继承设计)
    * [聚合设计](#聚合设计)
    * [私服设计](#私服设计)

<!-- vim-markdown-toc -->

## 整体流程 

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412162053187.png)

## WEB前端

* **前端代码如何转换成用户看到的页面**
    * **浏览器**解析和渲染HTML、CSS、JavaScript代码
    * 浏览器解析渲染的部分，称为**浏览器内核**

* **Web标准** 
    * **HTML**：网页的骨架，用来展示网页的内容
    * **CSS**：网页的皮肤，用来设置网页的表现，比如字体、颜色、布局等
    * **JavaScript**：网页的肌肉，用来设置网页的行为，比如点击按钮、弹出提示框等

### HTML

* **HTML**：HyperText Markup Language，超文本标记语言
    * **超文本**：文本中可以包含图片、链接等非文本元素
    * **标记**：用标签包裹的文本，标签是HTML的基本单位

* **HTML基本结构**

| 标签 | 说明 |
| --- | --- |
| `<!DOCTYPE html>` | 声明文档类型 |
| `<html>` | 根标签 |
| `<head>` | 头部标签，包含网页的元信息 |
| `<title>` | 网页标题 |
| `<body>` | 主体标签，包含网页的内容 |
| `<h1...h6>` | 一到六级标题 |
| `<p>` | 段落标签 |
| `<hr>` | 水平线标签 |
| `<br>` | 换行标签 |
| `<img>` | 图片标签 |
| `<a>` | 链接标签 |
| `<span>` | 行内标签，用来设置文本的样式。一行可以有多个span标签 |
| `<div>` | 块级标签，用来设置文本的样式 |
| `<style>` | 内嵌样式标签 |
| `<link>` | 外联样式标签 |
| `audio` | 音频标签 |
| `video` | 视频标签 |
| `table` | 表格标签 |
| `b` | 加粗标签 |
| `div` | 块级标签 |




* 特点
    * 标签不区分大小写，但是建议使用小写
    * 标签属性值单双引号都可以，但是建议使用双引号
    * 语法松散，不严格要求缩进和换行

**HTML 常用格式**
```html
<html>
    <head>
        <title>标题</title>
    </head>    
    <body>
        <h1>一级标题</h1>
        <h2>二级标题</h2>
        <h3>三级标题</h3>
        <h4>四级标题</h4>
        <h5>五级标题</h5>
        <h6>六级标题</h6>
    </body>
</html>
```
#### CSS引入方式
* **行内样式**：直接在标签中使用style属性 `<h1 style = "...">`
* **内嵌样式**：在head标签中使用style标签 `<style>...</style>`
* **外联样式**：在head标签中使用link标签引入外部样式表 `<link rel="stylesheet" type="text/css" href="xxxxx.css">`

**示例：**
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412162203252.png)

#### CSS选择器
* **标签选择器**：`h1{...}`
* **类选择器**：`.class{...}`  **不唯一**
* **ID选择器**：`#id{...}`  **唯一**

ID选择器优先级最高，标签选择器优先级最低

#### CSS属性
| 属性 | 说明 |
| --- | --- |
| `color` | 文本颜色 |
| `font-size` | 字体大小 |
| `font-family` | 字体 |
| `font-weight` | 字体粗细 |
| `text-align` | 文本对齐方式 |
| `background-color` | 背景颜色 |
| `background-image` | 背景图片 |
| `href` | 链接地址 |
|`target`|链接打开方式 _self 在当前页面打开 _blank 在空白页面打开|
|`text-decoration`|文本装饰 underline 下划线 overline 上划线 line-through 删除线|

#### CSS盒子模型

* **盒子模型**：网页布局的基本单位，由内容区、内边距、边框、外边距组成
    * **内容区**：显示文本和图片
    * **内边距**：内容区和边框之间的距离
    * **边框**：内边距和外边距之间的距离
    * **外边距**：边框和相邻元素之间的距离

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412171450038.png)

**标题排版.html**
```html
<!-- 文档类型为HTML -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>焦点访谈：中国底气 新思想夯实大国粮仓</title>
    <!-- 外链方式 -->
    <link rel="stylesheet" href="color.css">
    <!-- 内嵌方式 -->
    <!-- <style>
        h1{
            color: red;
        } -->
</head>
<body>
    <img src="https://i2.sinaimg.cn/dy/deco/2012/0613/yocc20120613img01/news_logo.png"> 新浪政务>正文
    <h1>焦点访谈：中国底气 新思想夯实大国粮仓</h1>
    <hr>
    2023年03月02日 9：00 新华社
    <hr>
</body>
</html>
```

**color.css**

设置标题颜色为灰色

```css
h1{
    color: #4D4F53;
}
```

**效果图**
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412171509975.png)

#### 表单标签

* **表单标签**：用来收集用户输入的数据
    * **input**：单行文本框、密码框、单选框、复选框、按钮
    * **textarea**：多行文本框
    * **select**：下拉框
    * **button**：按钮
    * **form**：表单
    * **submit**：提交按钮

**表单.html**
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HTML-表单</title>
</head>
<body>
    <!-- 
    form表单属性: 
        action: 表单提交的url, 往何处提交数据 . 如果不指定, 默认提交到当前页面
        method: 表单的提交方式 .
            get: 在url后面拼接表单数据, 比如: ?username=Tom&age=12 , url长度有限制 . 默认值
            post: 在消息体(请求体)中传递的, 参数大小无限制的.
    -->   

    <form action="" method="post">
        用户名: <input type="text" name="username">
        年龄: <input type="text" name="age">

        <input type="submit" value="提交">
    </form>

</body>
</html>
```

### JavaScript 

#### JavaScirpt引入方式

* **内部脚本**
    * 在HTML文件中使用`<script>...</script>`标签
    * 在`<body>`标签的底部使用，可以保证页面的内容先加载，再加载脚本，提高用户体验
    * 代码会在页面加载时执行

* **外部脚本**
    * 在HTML文件中使用`<script src="..."></script>`标签引入外部脚本
    * 外部脚本可以被多个页面引用，提高代码的复用性

#### 输出语句
* **alert()**：弹出提示框
* **console.log()**：在控制台输出信息
* **document.write()**：在文档中写入内容

#### 变量 
* **var** : 全局变量 可以反复声明、赋值
* **let** : 局部变量 只能声明一次
* **const** : 常量 只能声明一次，不能修改

#### 函数

* **函数**：封装一段代码，可以重复调用
    * **函数声明**：`function 函数名(参数){...}`
    * **函数调用**：`函数名(参数)`

**函数.html**
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JavaScript-函数</title>
</head>
<body>
    <script>
        // 函数声明
        function sayHello(){
            alert("Hello World!");
        }

        // 函数调用
        sayHello();
    </script>
</body>
</html>
```

#### 对象

##### Array

* **数组**：用来存储多个数据的集合
    * **声明**：`var arr = [元素1, 元素2, ...]` 或 `var arr = new Array(元素1, 元素2, ...)`
    * **访问**：`arr[下标]`
    * **长度**：`arr.length`
    * **遍历**：`for(var i = 0; i < arr.length; i++)`

| 方法                                  | 说明 |
| ---                                   | --- |
| `push()`                              | 在数组末尾添加元素，可以添加若干个 |
| `pop()`                               | 删除数组末尾元素 |
| `forEach()`                           | 遍历数组 |
| `splice(start:number,delete?:number)` | 删除从start开始的delete个元素 |

##### String

* **字符串**：用来存储文本数据
    * **声明**：`var str = "字符串"` 或 `var str = new String("字符串")`
    * **长度**：`str.length`
    * **访问**：`str[下标]` 或 `str.charAt(下标)`
    * **拼接**：`str1 + str2`
    * **查找**：`str.indexOf("子串")`，返回子串的下标，找不到返回-1
    * **截取**：`str.substring(start, end)`，截取从start到end的子串
    * **替换**：`str.replace("旧子串", "新子串")`
    * **转换**：`str.toUpperCase()`，`str.toLowerCase()`，转换为大写或小写
    * **去除空格**：`str.trim()`，去除字符串两端的空格  

##### Json

* **JSON**：JavaScript Object Notation，JavaScript对象表示法
    * **声明**：`var obj = {key1: value1, key2: value2, ...}`
    * **访问**：`obj.key` 或 `obj["key"]`
    * **遍历**：`for(var key in obj)`
    * **转换**：`JSON.stringify(obj)`，将对象转换为字符串
    * **解析**：`JSON.parse(str)`，将字符串转换为对象

##### Bom

* **BOM**：Browser Object Model，浏览器对象模型
    * **window**：浏览器窗口
    * **location**：浏览器地址栏
    * **navigator**：浏览器信息
    * **screen**：屏幕信息
    * **history**：浏览历史

* **window对象**

| 方法            | 说明 |
| ---             | --- |
| `alert()`       | 弹出提示框 |
| `confirm()`     | 弹出确认框，点击确认返回`true`,取消返回`false` |
| `prompt()`      | 弹出输入框 |
| `setInterval()` | 定时器，每隔一段时间执行一次 |
| `setTimeout()`  | 定时器，一段时间后执行一次 |
| `document`      | 文档对象 |


* **location对象**

`location.href`：获取或设置当前页面的URL，可以实现页面跳转

##### Dom

* **DOM**：Document Object Model，文档对象模型
    * **文档**：HTML文档
    * **对象**：文档中的元素
    * **模型**：元素之间的关系

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412181521615.png)

* **DOM操作**

| 方法                                | 说明 |
| ---                                 | --- |
| `document.getElementById()`         | 通过id获取元素 |
| `document.getElementsByTagName()`   | 通过标签名获取元素 |
| `document.getElementsByClassName()` | 通过类名获取元素 |
| `document.getElementsByName`| 通过属性获取元素|

**示例：**
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JS-对象-DOM-案例</title>
</head>

<body>
    <img id="h1" src="img/off.gif">  <br><br>

    <div class="cls">传智教育</div>   <br>
    <div class="cls">黑马程序员</div>  <br>

    <input type="checkbox" name="hobby"> 电影
    <input type="checkbox" name="hobby"> 旅游
    <input type="checkbox" name="hobby"> 游戏
</body>

<script>
    //1. 点亮灯泡 
    var img = document.getElementById("h1");
    img.src = "img/on.gif";
    //2. 将所有div标签的内容后面加上
    var divs = document.getElementsByClassName("cls");
    for (let i = 0; i < divs.length; i++) {
        const div = divs[i];
        div.innerHTML += "<font color='red'>very good</font>"
        
    }
    //3. 使所有的复选框呈现选中状态
    var ins = document.getElementsByName("hobby");
    for (let i = 0; i < ins.length; i++) {
        const check = ins[i];
        check.checked = true;
    }

</script>
</html>
```

##### 事件

* **事件**：用户和浏览器之间的交互
    * **鼠标事件**：`click`，`mouseover`，`mouseout`，`mousedown`，`mouseup`
    * **键盘事件**：`keydown`，`keyup`，`keypress`
    * **表单事件**：`focus`，`blur`，`change`，`submit`
    * **窗口事件**：`load`，`resize`，`scroll`
    * **其他事件**：`copy`，`cut`，`paste`

**示例：**
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JS-事件-案例</title>
</head>
<body>

    <img id="light" src="img/off.gif"> <br>

    <input type="button" value="点亮" onclick="on()"> 
    <input type="button"  value="熄灭" onclick="off()">

    <br> <br>

    <input type="text" id="name" value="ITCAST" onfocus="lower()" onblur="upper()">
    <br> <br>

    <input type="checkbox" name="hobby"> 电影
    <input type="checkbox" name="hobby"> 旅游
    <input type="checkbox" name="hobby"> 游戏
    <br>

    <input type="button" value="全选" onclick="checkAll()"> 
    <input type="button" value="反选" onclick="reverse()">

</body>

<script>

    //1. 点击 "点亮" 按钮, 点亮灯泡; 点击 "熄灭" 按钮, 熄灭灯泡; -- onclick
    function on(){
        //a. 获取img元素对象
        var img = document.getElementById("light");

        //b. 设置src属性
        img.src = "img/on.gif";
    }

    function off(){
        //a. 获取img元素对象
        var img = document.getElementById("light");

        //b. 设置src属性
        img.src = "img/off.gif";
    }

    //2. 输入框聚焦后, 展示小写; 输入框离焦后, 展示大写; -- onfocus , onblur
    function lower(){//小写
        //a. 获取输入框元素对象
        var input = document.getElementById("name");

        //b. 将值转为小写
        input.value = input.value.toLowerCase();
    }

    function upper(){//大写
        //a. 获取输入框元素对象
        var input = document.getElementById("name");

        //b. 将值转为大写
        input.value = input.value.toUpperCase();
    }

    //3. 点击 "全选" 按钮使所有的复选框呈现选中状态 ; 点击 "反选" 按钮使所有的复选框呈现取消勾选的状态 ; -- onclick
    function checkAll(){
        //a. 获取所有复选框元素对象
        var hobbys = document.getElementsByName("hobby");

        //b. 设置选中状态
        for (let i = 0; i < hobbys.length; i++) {
            const element = hobbys[i];
            element.checked = true;
        }
    }
    
    function reverse(){
        //a. 获取所有复选框元素对象
        var hobbys = document.getElementsByName("hobby");

        //b. 设置未选中状态
        for (let i = 0; i < hobbys.length; i++) {
            const element = hobbys[i];
            element.checked = false;
        }
    }
</script>
</html>
```

### Vue

* **Vue**：一套用于构建用户界面的渐进式框架
    * **MVVM**：Model-View-ViewModel，数据模型-视图-视图模型
    * **数据驱动**：数据发生变化，视图自动更新
    * **组件化**：将页面拆分成多个组件，每个组件独立开发、维护

* **Vue指令**

| 指令      | 说明 |
| ---       | --- |
| `v-bind`  | 为HTML标签绑定属性值，如设置href，css样式等 |
| `v-model` | 双向数据绑定，将数据和表单元素绑定在一起 |
| `v-on`    | 为HTML标签绑定事件，如点击事件、鼠标移入事件等 |
| `v-if`    | 根据表达式的值，判断是否渲染元素 |
| `v-show`  | 根据表达式的值，判断是否显示元素，区别在于切换的是display的值 |
| `v-for`   | 遍历数组或对象，生成多个元素 |

**示例：**

给定一个数组，展示学生信息，根据成绩判断等级

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Vue-指令-案例</title>
    <script src="js/vue.js"></script>
</head>
<body>
    
    <div id="app">
        
        <table border="1" cellspacing="0" width="60%">
            <tr>
                <th>编号</th>
                <th>姓名</th>
                <th>年龄</th>
                <th>性别</th>
                <th>成绩</th>
                <th>等级</th>
            </tr>

            <tr align="center" v-for="(user,index) in users">
                <td>{{index + 1}}</td>
                <td>{{user.name}}</td>
                <td>{{user.age}}</td>
                <td>
                    <span v-if="user.gender == 1">男</span>
                    <span v-if="user.gender == 2">女</span>
                </td>
                <td>{{user.score}}</td>
                <td>
                    <span v-if="user.score >= 85">优秀</span>
                    <span v-else-if="user.score >= 60">及格</span>
                    <span style="color: red;" v-else>不及格</span>
                </td>
            </tr>
        </table>

    </div>

</body>

<script>
    new Vue({
        el: "#app",
        data: {
            users: [{
                name: "Tom",
                age: 20,
                gender: 1,
                score: 78
            },{
                name: "Rose",
                age: 18,
                gender: 2,
                score: 86
            },{
                name: "Jerry",
                age: 26,
                gender: 1,
                score: 90
            },{
                name: "Tony",
                age: 30,
                gender: 1,
                score: 52
            }]
        },
        methods: {
            
        },
    })
</script>
</html>
```

**效果图**
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412191443216.png)

#### Vue生命周期 

* **生命周期**：Vue实例从创建到销毁的过程
    * **创建**：`beforeCreate`，`created`
    * **挂载**：`beforeMount`，`mounted`
    * **更新**：`beforeUpdate`，`updated`
    * **销毁**：`beforeDestroy`，`destroyed`

### Ajax

* **Ajax**：Asynchronous JavaScript and XML，异步的JavaScript和XML
    * **异步**：不阻塞页面的刷新和跳转
    * **JavaScript**：使用JavaScript操作DOM
    * **XML**：使用XML格式传输数据
    * 用于在不重新加载整个页面的情况下，与服务器交换数据

* **Axios2**
    * **Axios**：基于Promise的HTTP客户端，用于浏览器和Node.js
    * **特点**：支持浏览器和Node.js，支持Promise API，支持请求和响应的拦截器，支持请求的取消，支持自动转换JSON数据，支持客户端防御XSRF

* **Axios使用**
    * `axios.get(url, {params: {key: value}}).then(res => {}).catch(err => {})`
    * `axios.post(url, data).then(res => {}).catch(err => {})`

**示例：**

使用Axios发送请求，获取数据

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ajax-Axios-案例</title>
    <script src="js/axios-0.18.0.js"></script>
    <script src="js/vue.js"></script>
</head>
<body>
    <div id="app">
        <table border="1" cellspacing="0" width="60%">
            <tr>
                <th>编号</th>
                <th>姓名</th>
                <th>图像</th>
                <th>性别</th>
                <th>职位</th>
                <th>入职日期</th>
                <th>最后操作时间</th>
            </tr>

            <tr align="center" v-for="(emp,index) in emps">
                <td>{{index + 1}}</td>
                <td>{{emp.name}}</td>
                <td>
                    <img :src="emp.image" width="70px" height="50px">
                </td>
                <td>
                    <span v-if="emp.gender == 1">男</span>
                    <span v-if="emp.gender == 2">女</span>
                </td>
                <td>{{emp.job}}</td>
                <td>{{emp.entrydate}}</td>
                <td>{{emp.updatetime}}</td>
            </tr>
        </table>
    </div>
</body>
<script>
    new Vue({
       el: "#app",
       data: {
         emps:[] // 用于存储从服务器获取的数据
       },
       mounted () {
          //发送异步请求,加载数据
          axios.get("https://mock.apifox.cn/m1/3128855-0-default/emp/list").then(result => {
            this.emps = result.data.data;
          })
       }
    });
</script>
</html>
```

## Maven

* **Maven**：基于项目对象模型的项目管理工具
    * **项目对象模型**：Project Object Model，POM
    * **特点**：统一管理项目的依赖、构建、部署、文档等，提高项目的可维护性和可扩展性  
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412201437571.png)

### 依赖范围 

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412201725736.png)

### 生命周期

* **生命周期**：Maven的构建过程分为三个阶段，每个阶段包含多个插件
    * **Clean**：清理项目，删除target目录
    * **Default**：构建项目，编译、测试、打包、部署
    * **Site**：生成项目站点，生成项目文档、报告

* **阶段**：每个生命周期包含多个阶段，每个阶段包含多个插件

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412201919299.png)

* **重要的阶段**
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412201920558.png)

## SpringBoot

* **SpringBoot**：基于Spring框架的快速开发框架
    * **特点**：简化Spring应用的开发、部署、运维，提供开箱即用的功能，减少配置文件，提高开发效率
    * **优势**：内嵌Tomcat，无需部署WAR包，提供大量的Starter，简化依赖管理，提供自动配置，减少配置文件

**入门程序**

在IDEA中创建SpringBoot项目，创建一个请求处理类`HelloController`,处理`/hello`请求

```Java
// 请求处理类
@RestController
public class HelloController {
    //请求匹配
    @RequestMapping("/hello")
    public String hello()
    {
        System.out.println("Hello World!");
        return "Hello World!";
    }
}

```

## HTTP 

* **HTTP**：HyperText Transfer Protocol，超文本传输协议
    * **特点**：基于TCP/IP协议，无状态协议，请求-响应模型
    * **请求**：客户端向服务器发送请求
    * **响应**：服务器向客户端返回响应

### 请求协议

* **请求数据格式**
    * **GET**：请求参数在URL中，长度有限制
    * **POST**：请求参数在请求体中，长度无限制

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412201944605.png)

### 响应协议

* **响应数据格式**
    * **状态行**：协议版本、状态码、状态描述
    * **响应头**：服务器信息、响应时间、内容类型等
    * **响应体**：响应的数据

* **状态码**
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412201945732.png) 

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412201953518.png)

## 请求响应

### 简单参数&&实体参数

* **简单参数**：基本数据类型、String类型
    * **请求**：`/hello?name=Tom&age=20`
    * **处理**：`public String hello(String name, Integer age)`
    * **响应**：`Hello Tom, 20 years old!`

* **实体参数**：自定义实体类
    * **请求**：`/hello`，请求体`{"name":"Tom","age":20}`
    * **处理**：`public String hello(User user)`
    * **响应**：`Hello Tom, 20 years old!`

### 数组参数&&集合参数

* **数组参数**：相同类型的参数
    * **请求**：`/hello?names=Tom&names=Jerry`
    * **处理**：`public String hello(String[] names)`
    * **响应**：`Hello Tom, Jerry!`

* **集合参数**：通过@RequestParam绑定参数关系
    * **请求**：`/hello?names=Tom&names=Jerry`
    * **处理**：`public String hello(@RequestParam List<String> names)`
    * **响应**：`Hello Tom, Jerry!`

### 日期参数&&Json参数

* **日期参数**：使用@DateTimeFormat注解
    * **请求**：`/hello?birthday=2023-03-02`
    * **处理**：`public String hello(@DateTimeFormat(pattern = "yyyy-MM-dd") Date birthday)`
    * **响应**：`Hello 2023-03-02!`

* **Json参数**：使用@RequestBody注解
    * **请求**：`/hello`，请求体`{"name":"Tom","age":20}`
    * **处理**：`public String hello(@RequestBody User user)`
    * **响应**：`Hello Tom, 20 years old!` 

### 路径参数

* **路径参数**：使用@PathVariable注解
    * **请求**：`/hello/Tom/20`
    * **处理**：
    ```Java
    @RequestMapping("/hello/{name}/{age}")
    public String hello(@PathVariable String name, @PathVariable Integer age)
    ```
    * **响应**：`Hello Tom, 20 years old!`

### 统一响应格式

* **统一响应格式**：封装响应数据，统一返回格式
    * **数据**：状态码、消息、数据
    * **格式**：`{"code":200, "msg":"success", "data":{...}}`

## 分层解耦

* **分层解耦**：将项目拆分成多个模块，每个模块负责不同的功能，降低耦合度，提高代码的可维护性和可扩展性

* **Controller层**：处理请求，调用Service层
* **Service层**：处理业务逻辑，调用Dao层
* **Dao层**：操作数据库，执行SQL语句


### 三层架构

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412211531223.png)

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412211532039.png)

### 分层解耦 

**控制反转** Inversion of Control，简称IOC。对象的创建控制权由程序员转交给Spring容器，由Spring容器负责创建对象，程序员只需要使用对象

**依赖注入** Dependency Injection，简称DI。容器为应用程序提供运行时所依赖的资源

**Bean**：Spring管理的对象，由Spring容器创建和管理

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412211543969.png)

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412211628737.png)

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412211639005.png)

## Mysql

* **Mysql**：关系型数据库管理系统
    * **特点**：开源、免费、跨平台、高性能、高可靠、易扩展
    * **功能**：存储数据、管理数据、查询数据、保护数据

### SQL语句

* **SQL**：Structured Query Language，结构化查询语言
    * **DDL**：Data Definition Language，数据定义语言，创建、修改、删除数据库、表
    * **DML**：Data Manipulation Language，数据操作语言，增删改数据
    * **DCL**：Data Control Language，数据控制语言，授权、回收权限
    * **DQL**：Data Query Language，数据查询语言，查询数据库中表的记录

#### DDL语句

* **数据库操作**
    * **创建数据库**：`create database 数据库名`
    * **删除数据库**：`drop database 数据库名`
    * **选择数据库**：`use 数据库名`
    * **查看数据库**：`show databases`
    * **查看当前数据库**：`select database()`

* **表操作**
    * **创建表**：`create table 表名(字段名 类型(长度) 约束)`
    * **删除表**：`drop table 表名`
    * **查看表**：`show tables`
    * **查看表结构**：`desc 表名`
    * **修改表**：`alter table 表名 add|drop|modify|change 字段名 (新字段名) 类型(长度) 约束`
    * **修改表名**：`rename table 旧表名 to 新表名`

#### DML语句

* **数据操作**
    * **插入数据**：`insert into 表名(字段名) values(值)`
    * **删除数据**：`delete from 表名 where 条件`
    * **修改数据**：`update 表名 set 字段名=值 where 条件`
    * **查询数据**：`select 字段名 from 表名 where 条件` 

#### DQL语句

* **数据查询**
    * **查询所有字段**：`select * from 表名`
    * **查询指定字段**：`select 字段名 from 表名`
    * **查询条件**：`select 字段名 from 表名 where 条件`
    * **查询排序**：`select 字段名 from 表名 order by 字段名 asc|desc`
    * **查询分页**：`select 字段名 from 表名 limit 起始位置,查询数量`
    * **起别名**: `select 字段名 as 别名 from 表名`
    * **去重**: `select distinct 字段名 from 表名`

* **条件查询**

| 操作符 | 说明 |
| --- | --- |
| `=` | 等于 |
| `!=` | 不等于 |
| `>` | 大于 |
| `<` | 小于 |
| `>=` | 大于等于 |
| `<=` | 小于等于 |
| `between`...`and` | 在范围内 |
| `like` | 模糊查询 `_`匹配单个字符 `%`匹配多个字符 |
| `in` | 在集合内 |
| `is null` | 为空 |

* **聚合函数**
    * **count**：统计数量
    * **sum**：求和
    * **avg**：平均值
    * **max**：最大值
    * **min**：最小值

* **分组查询**
    * **分组**：`group by 字段名`
    * **条件**：`having 条件`

```sql
select 字段名 [聚合函数] from 表名 [where 条件] group by 字段名 having 分组后过滤条件
```
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412230939500.png)

* **分页查询**
    * **limit**：`limit 起始位置,查询数量`

```sql
select 字段名 from 表名 limit 起始位置,查询数量
```

* **if和case**
    * **if**：`if(条件, 真值, 假值)`
    * **case**：`case 字段名 when 值 then 结果 else 结果 end`

#### 外键约束

* **外键约束**：保证表与表之间的关系，保证数据的完整性
    * **创建外键**：`alter table 表名 add foreign key(字段名) references 表名(字段名)`
    * **删除外键**：`alter table 表名 drop foreign key 外键名`

* **物理外键**：外键字段与主键字段的数据类型、长度、约束必需一致
  * 缺点:
    1. 影响增删改的效率（需要检查外键关系）。
    2. 仅用于单节点数据库，不适用于分布式数据库。
    3. 容易引发数据库的死锁问题。

### 连接查询

* **连接查询**：多表查询，根据表与表之间的关系，查询数据
    * **内连接**：
        * 显式内连接：`select 字段名 from 表1 inner join 表2 on 表1.字段名=表2.字段名`
        * 隐式内连接：`select 字段名 from 表1,表2 where 表1.字段名=表2.字段名`
    * **外连接**：
        * **左连接**：`select 字段名 from 表1 left join 表2 on 表1.字段名=表2.字段名` 
        * **右连接**：`select 字段名 from 表1 right join 表2 on 表1.字段名=表2.字段名`

### 事务管理

* **事务**：一组操作，要么全部成功，要么全部失败
    * **特点**：原子性、一致性、隔离性、持久性
    * **隔离级别**：读未提交、读已提交、可重复读、串行化

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412231409981.png)

* **事务操作**
    * **开启事务**：`start transaction`
    * **提交事务**：`commit`
    * **回滚事务**：`rollback`
 
### 索引优化

* **索引**：提高查询效率，加快数据检索速度
    * **特点**：提高查询效率，降低写入效率，占用磁盘空间
    * **类型**：主键索引、唯一索引、普通索引、全文索引 

* **优缺点**
    * **优点**：提高查询效率，加快数据检索速度
    * **缺点**：降低写入效率，占用磁盘空间

* **B+树**：多路平衡查找树，每个节点最多有M个子节点，每个非叶子节点存储M-1个关键字
    * **特点**：所有叶子节点在同一层，查询效率稳定，适合范围查询

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412231617110.png)

* **创建索引**：`create index 索引名 on 表名(字段名)`
* **删除索引**：`drop index 索引名 on 表名`
* **查看索引**：`show index from 表名`

### 数据库连接池

* **连接池**：提高数据库连接的复用性，减少连接的创建和销毁
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412231950520.png)

### lombok

* **lombok**：简化Java开发，通过注解自动生成代码
    * **特点**：减少冗余代码，提高开发效率
    * **注解**：`@Data`，`@Getter`，`@Setter`，`@ToString`，`@NoArgsConstructor`，`@AllArgsConstructor`

## Mybatis

* **Mybatis**：持久层框架，用于操作数据库
    * **特点**：基于XML配置文件，提供SQL映射，提供对象关系映射
    * **优势**：减少开发工作量，提高开发效率，提高代码的可维护性和可扩展性

### 预编译SQL

* **预编译SQL**：提前编译SQL语句，提高查询效率
    * **特点**：防止SQL注入，提高查询效率，减少编译次数



```Java
// 预编译SQL 
@Mapper 
public interface EmpMapper {

    @Delete("delete from emp where id = #{id}")
    public void deleteEmpById(Integer id);
}
```


#### SQL注入

* **SQL注入**：通过输入恶意SQL语句，获取数据库中的数据
    * **原理**：拼接SQL语句，执行恶意SQL语句
    


```SQL
# 查询所有用户
select * from user where username='' and password=''
# SQL注入 username 任意  password 1' or '1'='1

select * from user where username='' and password='1' or '1'='1'
# 逻辑发生改变，where 恒成立
```

### 添加数据

* **添加数据**：向数据库中插入数据
    * **特点**：提供对象关系映射，将Java对象映射为数据库表

**示例：**

向emp表中插入数据,使用@Insert注解封装SQL语句，使用@Options注解获取返回的主键

```Java
    @Options(keyProperty ="ID",useGeneratedKeys = true) // 获取返回的主键
    @Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time)"
            + "values(#{username}, #{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
    public void insertEmp(Emp emp);
```

### XML映射文件

* **XML映射文件**：提供SQL映射，将SQL语句封装到XML文件中
    * **特点**：提供SQL映射，提高代码的可维护性和可扩展性

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412241617849.png)

**示例：**

在resources目录下创建EmpMapper.xml文件，封装SQL语句

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.itheima.mapper.EmpMapper">

    <!-- 添加数据 -->
    <insert id="insertEmp" parameterType="com.itheima.pojo.Emp">
        insert into emp(username, name，gender, image, job, entrydate, dept_id, create_time, update_time) values(#{username}, #{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})
    </insert>

</mapper>
```

#### 动态SQL

* **动态SQL**：根据条件动态生成SQL语句
    * **特点**：根据条件生成SQL语句，提高代码的可维护性和可扩展性

* **if标签**：根据条件生成SQL语句
    * **示例**：`<if test="条件">SQL语句</if>`

* **where标签**：根据条件生成where子句
    * **示例**：`<where>SQL语句</where>`
    * **特点**：去除多余的and或or

* **set标签**：根据条件生成set子句
    * **示例**：`<set>SQL语句</set>`
    * **特点**：去除多余的逗号

* **foreach 标签**：根据条件生成in子句
    * **示例**：`<foreach collection="集合" item="别名" separator="分隔符",open="前封装"，close="后封装">SQL语句</foreach>`
    * **特点**：根据集合生成in子句

     


* **choose标签**：根据条件生成选择语句

* **sql标签**：封装SQL语句，提高代码的复用性
    * **示例**：`<sql id="别名">SQL语句</sql>`

* **include标签**：引入其他SQL语句
    * **示例**：`<include refid="别名"/>`

**示例：**
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412261047334.png)

### PageHelper

* **PageHelper**：Mybatis分页插件，提供分页查询功能
    * **特点**：提供分页查询功能，提高查询效率，减少代码量

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412262110684.png)

* **使用步骤**
    * **引入依赖**：`<dependency>...</dependency>`
    * **配置插件**：`PageHelper.startPage(页码, 每页数量)`
    * **查询数据**：`PageInfo<Emp> pageInfo = new PageInfo<>(list);`



## yml配置文件

* **yml**：YAML Ain't Markup Language，一种数据序列化格式
    * **特点**：简洁、易读、易写，支持多种数据类型，支持注释

* **语法规则**
    * **缩进**：使用空格缩进，不使用Tab缩进
    * **大小写**：区分大小写
    * **注释**：使用`#`注释，单行注释
    * **多行**：使用`|`保留换行，使用`>`折叠换行
    * **引号**：使用`""`表示字符串，使用`''`表示字面量

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412271633718.png)

## 会话跟踪

* **会话跟踪**：记录用户的访问信息，保持用户的状态
    * **特点**：保持用户的状态，提高用户体验，提高系统的安全性

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412272012801.png)

### JWT

* **JWT**：JSON Web Token，一种用于身份验证的令牌
    * **特点**：无状态、跨域、安全、可扩展
    * **组成**：头部、载荷、签名

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412272017461.png)  

* **生成JWT**

```Java
@Test 
public void testGenJWT()
    {
        Map<String,Object> claims = new HashMap<>();
        claims.put("username","liu");
        claims.put("age",18);
        String jwt = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256, "luckygalaxy") // 设置加密算法和加密盐
                .setClaims(claims) // 设置自定义的数据
                .setExpiration(new Date(System.currentTimeMillis()+1000*60*60)) // 设置过期时间为1小时
                .compact(); // 生成字符串
        System.out.println(jwt);
    }
```

* **解析JWT**

```Java
@Test
public void testParseJWT()
    {
        Claims claims = Jwts.parser()
                .setSigningKey("luckygalaxy") // 设置加密盐
                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJleHAiOjE3MzUzMDYyMDMsImFnZSI6MTgsInVzZXJuYW1lIjoibGl1In0.nKyVXOywcfiVpHJJumm9X3qTAqvTOqjaYmxsfWLwtvw") // 设置要解析的jwt
                .getBody(); // 获取jwt的body部分

        System.out.println(claims);

    }
```

## Filter

* **Filter**：过滤器，用于拦截请求，处理请求和响应
    * **特点**：拦截请求，处理请求和响应，提高代码的复用性和可维护性

* **生命周期**：初始化、请求处理、销毁
    * **初始化**：调用init方法，初始化Filter
    * **请求处理**：调用doFilter方法，处理请求和响应
    * **销毁**：调用destroy方法，销毁Filter

* **使用步骤**
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412281258191.png)

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412281256053.png)

### 过滤器链

* **过滤器链**：多个过滤器按照顺序执行
    * **特点**：多个过滤器按照顺序执行，提高代码的复用性和可维护性

* **执行顺序**：按照过滤器的配置顺序执行

## Interceptor

* **Interceptor**：拦截器，用于拦截请求，处理请求和响应
    * **特点**：拦截请求，处理请求和响应，提高代码的复用性和可维护性

### 拦截路径

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412281402449.png)

### FIlter和Interceptor区别

* **Filter**：Servlet规范，基于回调函数，无法获取Spring容器中的Bean
* **Interceptor**：Spring框架，基于AOP，可以获取Spring容器中的Bean

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412281406056.png)

## 全局异常处理器

* **全局异常处理器**：处理系统中的异常，提高系统的稳定性
    * **特点**：处理系统中的异常，提高系统的稳定性，提高用户体验

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412281451789.png)

通过`@RestControllerAdvice`注解，捕获所有异常，返回统一的格式，方便前端处理，展示错误信息

```JAVA
/**
 * 全局异常处理器
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class) // 捕获所有异常
    public Result ex(Exception ex) {
        ex.printStackTrace();
        return Result.error("对不起，操作失败，请联系管理员");
    }
}

```

## 事务管理 @Transactional

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412281629773.png)

**默认只有RuntimeException会事件回滚**

* **rollbackFor**：指定异常时回滚 ，**``rollbackFor = Exception.class`` 所有异常都回滚**


```JAVA
    /**
     * 删除部门信息 以及部门下的员工信息
     * @param id
     */
    @Transactional(rollbackFor = Exception.class)  // 事务管理 所有异常都回滚
    @Override
    public void deleteDeptById(Integer id) {
        deptMapper.deleteDeptById(id);
        empMapper.deleteEmpByDeptId(id);

    }
```



* **propagation**：事务传播行为
    * **REQUIRED**：支持当前事务，如果不存在，创建一个新事务
    * **REQUIRES_NEW**：创建新事务，如果存在，挂起当前事务

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412291241170.png)    

## AOP 面向切面编程

* **AOP**：Aspect Oriented Programming，面向切面编程
    * **特点**：提高代码的复用性和可维护性，提高系统的稳定性和安全性

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412291245851.png)
 
### 通知类型

*  **@Before**：前置通知，方法执行前执行
*  **@After**：后置通知，方法执行后执行
*  **@AfterReturning**：返回通知，方法返回结果后执行
*  **@AfterThrowing**：异常通知，方法抛出异常后执行
*  **@Around**：环绕通知，方法执行前后执行

### 切入点表达式

* **切入点表达式**：匹配目标方法的表达式
    * **通配符**：`*`匹配任意字符，`..`匹配任意参数
    * **关键字**：`execution`，`within`，`args`，`@annotation`

* **示例**：`execution(* com.itheima.service.*.*(..))`

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412291324862.png)

* `@Pointcut`：将公共的切入点表达式抽取出来，提高代码的复用性

```JAVA
    @Pointcut("execution(* com.itheima.service.*.*(..))")
    public void pointcut() {}
```

* `@Before`：前置通知，方法执行前执行

```JAVA
    @Before("pointcut()") // 可以使用pointcut()代替切入点表达式
    public void before(JoinPoint joinPoint) {
        System.out.println("前置通知");
    }
```

### 连接点

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412291401845.png)

## Bean管理

### 获取Bean对象

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412291932023.png)



```Java
@SpringBootTest
class SpringbootWebConfig2ApplicationTests {

    @Autowired
    private ApplicationContext applicationContext; //spring容器
    //获取bean对象
    @Test
    public void testGetBean(){
        //根据bean的名称获取
        DeptController bean1 = (DeptController) applicationContext.getBean("deptController");
        System.out.println(bean1);

        //根据bean的类型获取
        DeptController bean2 = applicationContext.getBean(DeptController.class);
        System.out.println(bean2);

        //根据bean的名称 及 类型获取
        DeptController bean3 =  applicationContext.getBean("deptController",DeptController.class);
        System.out.println(bean3);
    }
}
```

### Bean的作用域

* **Bean的作用域**：控制Bean的生命周期
    * **singleton**：单例模式，一个容器只有一个Bean对象
    * **prototype**：原型模式，每次获取Bean对象都会创建一个新的Bean对象
    * **request**：请求模式，每次请求都会创建一个新的Bean对象
    * **session**：会话模式，每次会话都会创建一个新的Bean对象

* **默认作用域**：singleton

* **修改作用域**：`@Scope("prototype")`

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412291942038.png)

### 第三方Bean

* **第三方Bean**：由第三方提供的Bean对象
    * **特点**：无法修改源码，无法添加注解

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412291957400.png)

## SpringBoot

### 自动配置

* **自动配置**：根据依赖自动配置Bean对象
    * **特点**：根据依赖自动配置Bean对象，提高开发效率，减少配置文件

* **自动配置类**：`@Configuration`，`@EnableAutoConfiguration`，`@ComponentScan`
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412292046890.png)


![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412292038694.png)

#### 自动配置原理

* **`@Conditional`**：条件注解，根据条件自动配置Bean对象
![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412301055598.png)

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412301103871.png)

### 自定义Starter

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412301642027.png)

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412301648168.png)


`AliOSSAutoConfiguration` 自动配置类

将`AliOSSProperties`配置类注入到`AliOSSUtils`工具类中, 并将`AliOSSUtils`注入到Spring容器中

```Java
@EnableConfigurationProperties(AliOSSProperties.class)
@Configuration
public class AliOSSAutoConfiguration {

    @Bean
    public AliOSSUtils aliOSSUtils(AliOSSProperties aliOSSProperties) {
        AliOSSUtils aliOSSUtils = new AliOSSUtils();
        aliOSSUtils.setAliOSSProperties(aliOSSProperties);
        return aliOSSUtils;
    }
}
```

`AliOSSProperties` 配置类

将`aliyun.oss`配置文件映射到`AliOSSProperties`配置类中



```Java
@ConfigurationProperties(prefix = "aliyun.oss")
public class AliOSSProperties {
    private String endpoint ;
    private String accessKeyId;
    private String accessKeySecret;
    private String bucketName;

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getAccessKeySecret() {
        return accessKeySecret;
    }

    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }
}
```

`AliOSSUtils` 工具类

使用`AliOSSProperties`配置类, 上传文件到阿里云OSS

```Java
public class AliOSSUtils {

    private AliOSSProperties aliOSSProperties;

    public void setAliOSSProperties(AliOSSProperties aliOSSProperties) {
        this.aliOSSProperties = aliOSSProperties;
    }

    /**
     * 实现上传图片到OSS
     */
    public String upload(MultipartFile file) throws IOException {
        // 获取上传的文件的输入流
        String endpoint = aliOSSProperties.getEndpoint();
        String accessKeyId = aliOSSProperties.getAccessKeyId();
        String accessKeySecret = aliOSSProperties.getAccessKeySecret();
        String bucketName = aliOSSProperties.getBucketName();

        InputStream inputStream = file.getInputStream();

        // 避免文件覆盖
        String originalFilename = file.getOriginalFilename();
        String fileName = UUID.randomUUID().toString() + originalFilename.substring(originalFilename.lastIndexOf("."));

        //上传文件到 OSS
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        ossClient.putObject(bucketName, fileName, inputStream);

        //文件访问路径
        String url = endpoint.split("//")[0] + "//" + bucketName + "." + endpoint.split("//")[1] + "/" + fileName;
        // 关闭ossClient
        ossClient.shutdown();
        return url;// 把上传到oss的路径返回
    }

}
```

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412301653772.png) 

## Maven高级

### 分模块设计

* **分模块设计**：将项目拆分成多个模块，每个模块负责不同的功能
    * **特点**：降低耦合度，提高代码的可维护性和可扩展性

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412302147952.png)


在springboot-day10-web模块引入子模块的依赖，可以分模块开发
```xml
<dependency>
            <groupId>com.itheima</groupId>
            <artifactId>tilas-pojo</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
        <dependency>
            <groupId>com.itheima</groupId>
            <artifactId>tilas-utils</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
```

### 继承设计

**如果分模块设计的多个工程有公共的依赖，可以创建父工程来实现依赖继承**

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412302150577.png)

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412302149750.png)

 ### 版本锁定

* **版本锁定**：锁定依赖的版本，避免版本冲突
    * **特点**：避免版本冲突，提高代码的稳定性和可维护性

* **版本锁定**：`<dependencyManagement>`，`<dependency>`

**在父工程中锁定依赖的版本，各个子工程中引入依赖时自动锁定版本**

### 聚合设计

* **聚合设计**：将多个模块聚合成一个工程，统一管理
    * **特点**：统一管理，提高代码的可维护性和可扩展性

* **聚合设计**：`<modules>`

* **通常在父工程中聚合多个子工程，统一管理**
    * 解决packege过程中的依赖问题

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412302208296.png)

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412302208726.png)

### 私服设计

* **私服设计**：搭建私有的Maven仓库，提高依赖的下载速度
    * **特点**：提高依赖的下载速度，提高代码的稳定性和可维护性

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412302213903.png)

![](https://cdn.jsdelivr.net/gh/luckygalaxy666/img_bed@main/img/202412302217849.png)

 
