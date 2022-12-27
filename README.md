# Asciffy
Very simple snippet that allows you to change normal text to un-escaped ascii codes
## Usage

First you need to load all the codes from the provided JSON to a map
  `Asciffycator.load();`
  
Then you can change any text you like by doing the following
  `Asciffycator.getAsciiString("Any text here!");`

### Very long snippet
```java
Asciffycator.load();
String asciiString = Asciffycator.getAsciiString("Hello World!");
```

resoult of the above code would be this

`\u0048\u0065\u006C\u006C\u006F\u0020\u0057\u006F\u0072\u006C\u0064\u0021`
