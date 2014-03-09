package hw01;

public class X2 extends Hw01{
	double a;
	X2(double x){
		a = x;
	}
	@Override
	double f(double x) {
		return a*a;
	}
}
