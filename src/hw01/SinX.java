package hw01;

public class SinX extends Hw01{
	double a;
	SinX(double x){
		a = x;
	}
	@Override
	double f(double x) {
		return Math.sin(a);
	}
}
