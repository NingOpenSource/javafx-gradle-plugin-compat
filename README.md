# javafx-gradle-plugin-compat
一个在java8环境下兼容[`javafx-gradle-plugin`](https://github.com/openjfx/javafx-gradle-plugin)的`gradle`脚本

## tasks
`runnableJar`:用来打包可执行的jar文件,安装后双击执行，在`java11+`以上的环境下打包后的jar包含了javafx组件，占用空间将会很大，大概占用`50MB`左右的磁盘空间。

例如：
```gradle
cd demo //可用提供的demo进行测试
jdk8 ./gradlew runnableJar //jdk8,jdk14都是切换java环境的命令，需自行配置
```

## 使用
下载[`javafxplugin-compat.gradle`](https://raw.githubusercontent.com/NingOpenSource/vcsLib/master/javafxplugin-compat.gradle)，或者
```gradle
apply from: 'https://raw.githubusercontent.com/NingOpenSource/vcsLib/master/javafxplugin-compat.gradle'
```