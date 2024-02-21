class SomeClass {
private SomeClass() {
// to say - no class should access this class by creating object
｝
}
public class Main
Main （）｛｝
Main (Main mainobj) {
System.out.println("Copy Constructor");
｝
public static void main(String[] args) {
Main m = new Main ();
new Main(m) ;|
SomeClass s = new SomeClass;
｝
}