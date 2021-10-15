import java.util.Scanner;
public class Swich {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Scan=new Scanner(System.in);
System.out.println("--------menu-----");
System.out.println("1.addition");
System.out.println("2.subtraction");
System.out.println("3.multiplication");
System.out.println("please enter your choice!!");
int choice=Scan.nextInt();
System.out.println("please enter two numbers:");
int x=Scan.nextInt();
int y =Scan.nextInt();
switch(choice)
{
case 1:
	int sum = x+y;
	System.out.println(sum);
	break;
case 2:
	int sub = x-y;
	System.out.println(sub);
	break;
case 3:
	int mul = x*y;
	System.out.println(mul);
	break;
	default:
		System.out.println("invalid choice,please try again");
		}
	
	}
	}
