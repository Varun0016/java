import java.io.console;
public class Input
{
public static void main(String[] args)
{
int age = Integer.parseInt(args[0]);
System.out.println(age);
String name = (args[1]);
System.out.println(name);
if (age>=18){
System.out.println(name+" Eligible");
}
else{
System.out.println(name+" Not Eligible");
}
Console cons = System.readLine();
String name = console.readLine();
System.out.println(cons);
}
}

