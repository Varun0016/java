public class CmdLineArgu{
public static void main(String[] args)
{
int age=Integer.parseInt(args[0]);
System.out.println(age);
String name=(args[1]);
if (age>=18){
System.out.println(name+" Eligible");
}
else{
System.out.println(name+" Not Eligible");
}
}
}
