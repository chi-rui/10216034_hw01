package hw01;

public class Cos5Sin extends Hw01{
	double a;
	Cos5Sin(double x){
		a = x;
	}
	@Override
	double f(double x) {
		return 5 * Math.sin(a) + Math.cos(a);
	}
}
