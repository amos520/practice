### 用 tomcat  部署 jpress

前言

​	我使用的是一台阿里云的CentOS 7.6 的Linux

​	已经安装了JDK1.8

我自己实际情况，做出的个性步骤

1. 首先下载tomcat，更改名称为：apache-tomcat-[version]-jpress

2. 在conf目录下创建Catalina--》localhost--》ROOT.xml，写入外部路径配置
~~~xml
<Context path="" docBase="/root/jpress/starter-tomcat-2.0.war"  reloadable="false" antiJARLocking="true" antiResourceLocking="false"></Context>
~~~
docBase=“项目war包实际路径”

3. 上传war包（starter-tomcat-2.0.war）到服务器的jpress目录下

4. 启动tomcat

   http://www.publicstatic.cn:8080/admin



