public class OpFactory {
	public Operator getOp(String bType) {
		if(bType == null) {
			return null;
		}
		if(bType.equalsIgnoreCase("ADD")) {
			return new Add();
		} else if(bType.equalsIgnoreCase("SUB")) {
			return new Sub();
		} else if(bType.equalsIgnoreCase("MUL")) {
			return new Mul();
		} else if(bType.equalsIgnoreCase("Div")) {
			return new Div();
		} else if(bType.equalsIgnoreCase("Log")) {
			return new Log();
		}
		
		
		return null;
	}
}
