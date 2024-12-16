# 目录

<!-- vim-markdown-toc GFM -->

* [整体流程](#整体流程)
* [WEB前端](#web前端)
    * [HTML](#html)
        * [CSS引入方式](#css引入方式)

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
    * **文档声明**：`<!DOCTYPE html>`
    * **html标签**：`<html>`
    * **head标签**：`<head>`
    * **title标签**：`<title>`
    * **body标签**：`<body>`
    * **h1~h6标签**：标题标签

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


**标题排版.html**
```html
<!-- 文档类型为HTML -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>焦点访谈：中国底气 新思想夯实大国粮仓</title>
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

