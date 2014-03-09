package hw01;

public class LogX2  extends Hw01{
	double a;
	LogX2(double x){
		a = x;
	}
	@Override
	double f(double x) {
		return Math.log(a) + a*a;
	}
}