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

