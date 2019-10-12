<html>
<body>
<h2>Hello World! brucezhang</h2>
<a href="city/detail">点我跳转详情页</a>
用户名：<input type="text" id="username" name="username">
<input type="button" value="跳转查找用户" onclick="Search()">

<input type="button" value="注册一个特定用户(连数据库)" onclick="adduser()">
</body>
<script>
    function Search(){
        window.open("city/search/data="+document.getElementById("username").value);
    }

    function adduser(){
        window.open("user/add");
    }
</script>
</html>
