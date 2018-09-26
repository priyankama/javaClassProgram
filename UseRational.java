import java.io.*;
public class UseRational
{
	public static void main(String args[])
	{
		Console con=System.console();
		Rational r1=new Rational();
		Rational r2=new Rational();
		System.out.println("Enter numerator and denominator");
		int a=Integer.parseInt(con.readLine());
		int b=Integer.parseInt(con.readLine());
		System.out.println("Enter numerator and denominator");
		int p=Integer.parseInt(con.readLine());
		int q=Integer.parseInt(con.readLine());
		r1.set(a,b);
		r2.set(p,q);
		Rational r=new Rational();
		r=r1.add(r2);
		System.out.print("Addition is 2 rational no: ");
		r.show();

		Rational r3=new Rational();
		r3=r1.less(r2);
		System.out.print("Subtraction of 2 rational no: ");
		r3.show();

		Rational r5=new Rational();
		r5=r1.mul(r2);
		System.out.print("Multiplication of 2 rational no: ");
		r5.show();

		Rational r4=new Rational();
		r4=r1.divide(r2);
		System.out.print("Division of 2 rational no: ");

		r4.show();
	}
}