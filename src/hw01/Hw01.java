package hw01;

public abstract class Hw01 {
	abstract double f(double x); 	
}

class X2 extends Hw01{
	double a;
	X2(double x){
		a = x;
	}
	@Override
	double f(double x) {
		return a*a;
	}
	
}

class SinX extends Hw01{
	double a;
	SinX(double x){
		a = x;
	}
	@Override
	double f(double x) {
		return Math.sin(a);
	}
	
}

class CosX extends Hw01{
	double a;
	CosX(double x){
		a = x;
	}
	@Override
	double f(double x) {
		return 0;
	}
}

class Cos5Sin extends Hw01{
	double a;
	Cos5Sin(double x){
		a = x;
	}
	@Override
	double f(double x) {
		return 0;
	}
}

class Sin5Cos extends Hw01{
	double a;
	Sin5Cos(double x){
		a = x;
	}
	@Override
	double f(double x) {
		return 0;
	}
}

class Log extends Hw01{
	double a;
	Log(double x){
		a = x;
	}
	@Override
	double f(double x) {
		return 0;
	}
}