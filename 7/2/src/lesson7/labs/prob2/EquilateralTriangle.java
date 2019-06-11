package lesson7.labs.prob2;

public class EquilateralTriangle implements Polygon {
	
	private double length;
	public EquilateralTriangle(double length) {
		this.length = length;
	}
	
	public double getLength() {
		return length;
	}

	@Override
	public double[] getLengths() {
		return new double[] {length, length, length};
	}

}
