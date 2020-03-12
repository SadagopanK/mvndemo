package mvndemo;



public class MyCalculator<T, U, R> {
	T t;
	U u;
	
	public MyCalculator(T t, U u) {
		this.t = t;
		this.u = u;
	}
	
	public R  calculate(Calculator<T, U, R> calculator) {
		return calculator.calculate(t, u);
	}
	
	
}

@FunctionalInterface
interface Calculator<T,U,R> {
	R calculate(T t, U u);
}


