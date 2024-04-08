
public class Fibonacci2 
{
public static void main (String[] args)
{
	int n =10;
int a= -1,b=1,c;
for (int i =1;i<=n;i++) {
	c = a+b;
	a=b;
	b=c;
	System.out.println(c);
}
}
}