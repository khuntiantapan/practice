import  java.util.Scanner;
interface calci
{
public int add(int a,int b);
public int minus(int a,int b);
}
 calciimpl implements calci
{
public int add(int a,int b)
{
return a+b;
}
public int minus(int a,int b)
{
return a-b;
}
}

class Test
{
public static void main(String [] args)
{
calciimpl c=new calciimpl();
Scanner sc=new Scanner(System.in);
System.out.println("enter first number");
int n1=sc.nextInt();
System.out.println("enter second number");
int n2=sc.nextInt();
System.out.println(n1+"+"+n2+c.add());
System.out.println(n1+"-"+n2+c.minus());
}
}