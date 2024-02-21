// Multi Level 
public class One {
    public static int a = 10;
    
    public static void printHello() {
        System.out.println("Hellooo");
    }
}

public class Two extends One {
    public static int b = 15;
}

public class Main {
    public static void main(String[] args) {
        System.out.println(One.a);
        System.out.println(Two.b);
        One.printHello();
    }
}