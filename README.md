前面看了一下swift 5, 顺便正好看一下kotlin

[Reference - Kotlin Programming Language](https://kotlinlang.org/docs/reference/)

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

## minimal
```
package hello

fun main() {
    println("hello world")
}
```

- package 和 java 一致，目录层级相同

## function
```
fun foo() : String {
  return "foo"
}

fun bar() = "bar"

fun foobar(): String = "foobar"
```
返回值可以省略(omit)

## var
```
val a: Int = 1  // immediate assignment
val b = 2   // `Int` type is inferred
val c: Int  // Type required when no initializer is provided
c = 3       // deferred assignment
```

var & val
- var: var
- val: let

## string
```
var foo = "foo"
val s1 = "foo is $foo and ${1+2}" 
println(s1)
```

## array and loop
```
val items = listOf("apple", "banana", "kiwifruit")
for (item in items) {
    println(item)
}
```

## class
- 和java不同，可以在一个文件中定义多个class，而且不需要和文件名一样
```
fun main() {
  var shape = Shape()
  shape.hello()
}

class Shape {
  val name:String?

  constructor() {
    this.name = "shape"
  }

  fun hello() {
    println(this.name)
  }
}
```

## derived

```
open class Shape {
  var name:String?

  constructor() {
    this.name = "shape"
  }

  fun hello() {
    println(this.name)
  }
}

class Square : Shape {
  constructor() {
    super.name = "square"
  }
}
```

差不多先这样，感觉kotlin有点过分复杂，边用边熟悉。
