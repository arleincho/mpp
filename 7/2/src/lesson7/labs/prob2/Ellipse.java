package lesson7.labs.prob2;

public class Ellipse implements ClosedCurve {
	
	private double axisLength;
	private double ellipticIntegral;
	
	public Ellipse(double axisLength, double ellipticIntegral) {
		this.axisLength = axisLength;
		this.ellipticIntegral = ellipticIntegral;
	}
	public double getAxisLength() {
		return axisLength;
	}
	public double getEllipticIntegral() {
		return ellipticIntegral;
	}
	public void setAxisLength(double axisLength) {
		this.axisLength = axisLength;
	}
	

	public void setEllipticIntegral(double ellipticIntegral) {
		this.ellipticIntegral = ellipticIntegral;
	}
	
	@Override
	public double computePerimeter() {
		return 4 * axisLength * ellipticIntegral;
	}
}
