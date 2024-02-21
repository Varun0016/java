public class Main3
{
Main3(){
System.out.println("Constructor");
}
Main3(String str){
System.out.println(str);
}
public static void main(String[] args){
new Main3("HelloParam");
}
}