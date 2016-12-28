public class HelloWorld {
     static String hello(String name) {
        return null == name || "" == name ?
            "Hello, World!" :
            "Hello, " + name + "!";
    }
}
