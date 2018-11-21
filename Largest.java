import java.util.Scanner;
class Largest
{
public static void main(String[] args)
{
int a,b,c;
Scanner Sc = new Scanner(System.in);
System.out.println("Enter the value for a:");
a = Sc.nextInt();
System.out.println("Enter the value for b:");
b = Sc.nextInt();
System.out.println("Enter the value for c:");
c = Sc.nextInt();
if (a > b && a > c)
{
System.out.println(" a is largest number");
}
else if (b > a && b > c)
{
System.out.println("b is the largest number");
}
else
{
System.out.println("c is the largest number");
}
System.out.println("End of the program");
}}