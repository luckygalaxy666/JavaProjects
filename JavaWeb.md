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

