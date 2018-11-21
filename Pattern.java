import java.util.Scanner;
class Pattern
{
public static void  main(String a[])
{
System.out.println("Enter a number to print the line ");
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
for (int i=1; i<=n; i++)
{
for( int j=1;j<=n;j++)
{
if(i ==j || i == (n-j+1))
{System.out.print("*");}
else 
{
System.out.print(" ");
}
}
System.out.println("");
}
}
}