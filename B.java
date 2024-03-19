protected class A
{
static void printHello() {
System.out.println("Varun");
}
}

public class B extends A {
static void printHello() {
System.out.println("D");
}
public static void main(String[] args){
printHello();
}
}