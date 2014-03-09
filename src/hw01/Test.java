package hw01;
import java.util.Scanner;
public class Test {
	public static void main(String arg[]){
		System.out.println("Please Enter avalue for x : ");
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		
		X2 functiona = new X2(x);
		System.out.println("The answer of f(x) = Math.pow(x, 2) is " + functiona.f(x));
		SinX functionb = new SinX(x);
		System.out.println("The answer of f(x) = sin(x) is " + functionb.f(x));
		CosX functionc = new CosX(x);
		System.out.println("The answer of f(x) = cos(x) is " + functionc.f(x));
		TanX functiond = new TanX(x);
		System.out.println("The answer of f(x) = tan(x) is " + functiond.f(x));
		Cos5Sin functione = new Cos5Sin(x);
		System.out.println("The answer of f(x) = 5sin(x) + cos(x) is " + functione.f(x));
		Sin5Cos functionf = new Sin5Cos(x);
		System.out.println("The answer of f(x) = sin(x) + 5cos(x) is " + functionf.f(x));
		LogX2 functiong = new LogX2(x);
		System.out.println("The answer of f(x) = logx + Math.pow(x, 2) is " + functiong.f(x));
	}
}
