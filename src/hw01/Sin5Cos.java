package hw01;

public class Sin5Cos extends Hw01{
	double a;
	Sin5Cos(double x){
		a = x;
	}
	@Override
	double f(double x) {
		return Math.sin(a) + 5 * Math.cos(a);
	}
}
