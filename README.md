# Asciffy
Very simple snippet that allows you to change normal text to un-escaped ascii codes
## Usage

You can change any text you like by doing the following
  `Asciffycator.getAsciiString("Any text here!");`

### Very long snippet
```java
String asciiString = Asciffycator.getAsciiString("Hello World!");
```

resoult of the above code would be this

`\u0048\u0065\u006C\u006C\u006F\u0020\u0057\u006F\u0072\u006C\u0064\u0021`

## Gradle

```gradle
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.Quexii:Asciffy:test'
}
```

## Maven

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
  
<dependencies>
    <dependency>
        <groupId>com.github.Quexii</groupId>
        <artifactId>Asciffy</artifactId>
        <version>1.0</version>
    </dependency>
</dependencies>
```
