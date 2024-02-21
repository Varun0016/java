class Two{
protected int a = 10;
}
public class Main5 extends Two {
public static int a=15;
void printData(){
System.out.println(a);
System.out.println(this.a);
System.out.println(super.a);
}
public static void main (String[] args){
new Main5().printData();
}
}

