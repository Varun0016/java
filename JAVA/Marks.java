public class Marks
{
public static void main(String[] args)
{
int mark1 = 40,mark2 = 34,mark3 = 45;
int total = mark1 + mark2 + mark3;
float avg = total/3;
if(avg<50)
{
System.out.println("Fail");
}
else if(avg>=51 && avg<=60)
{
System.out.println("C");
}
else if(avg>=61 && avg<=70)
{
System.out.println("B");
}
else if(avg<=71 && avg>=80)
{
System.out.println("B+");
}
else if(avg<=81 && avg>=90)
{
System.out.println("A");
}
else 
{
System.out.println("A+");
}
}
}
