前面看了一下swift 5, 顺便正好看一下kotlin

## 安装
```
$ sdk install kotlin
$ kotlin -version
Kotlin version 1.3.50-release-112 (JRE 1.8.0_161-b12)
```

最新的文档显示
> Downloading the compiler
> Every release ships with a standalone version of the compiler. We can download it from GitHub Releases. The latest release is 1.3.50.

## Kotlin
Kotlin是2011年由JetBrains开发, 基于JVM的一个语言, 起初是配合IntelliJ IDEA的销售, 而后转为Anroid官方支持的语言。

app.kt
```
fun main(args: Array<String>) {
  println("hello world")
}
```

compile
`kotlinc app.kt -include-runtime -d app.jar`

run
`java -jar app.jar` or `kotlin app.jar`

```
$ kotlin app.jar
hello world
```

## REPL
```
$ kotlinc-jvm
Welcome to Kotlin version 1.3.50 (JRE 1.8.0_161-b12)
Type :help for help, :quit for quit
>>> println("hello world")
hello world
>>> 
```

## Gradle
$ gradle init
选application / gradle
然后就会形成一个tree, 
```

├── build.gradle.kts
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── settings.gradle.kts
└── src
    ├── main
    │   ├── kotlin
    │   │   └── hello
    │   │       └── App.kt
    │   └── resources
    └── test
        ├── kotlin
        │   └── hello
        │       └── AppTest.kt
        └── resources
```

然后就回到了java的套路,
```
$ gradle run -q
Hello world
```