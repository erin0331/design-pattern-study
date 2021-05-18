package decorator.pattern;

public class Icetea extends Beverage{
	public Icetea() {
		description = "아이스티";
	}

	@Override
	public double cost() {
		return 1500;
	}
}
