package lesson7.labs.prob2;

public interface Polygon extends ClosedCurve{
	
	public double[] getLengths();
	
	public default double computePerimeter() {
		double sides[] = getLengths();
		
		double perimeter = 0;
		
		for (double value : sides) {
			perimeter += value;
		}
		return perimeter;
	}
	
	
	
}
