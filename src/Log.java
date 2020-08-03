public class Log implements Operator{
	
	@Override
	public double perform(double a, double b) {
		return Math.log(a);
	}
}