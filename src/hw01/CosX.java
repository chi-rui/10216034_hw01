package hw01;

public class CosX extends Hw01{
	double a;
	CosX(double x){
		a = x;
	}
	@Override
	double f(double x) {
		return Math.cos(a);
	}
}
