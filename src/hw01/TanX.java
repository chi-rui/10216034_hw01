package hw01;

public class TanX extends Hw01{
	double a;
	TanX(double x){
		a = x;
	}
	@Override
	double f(double x) {
		return Math.tan(a);
	}
}
