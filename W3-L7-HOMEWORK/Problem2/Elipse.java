package lesson7.labsProb2;

public class Elipse implements ClosedCurve {
	private double eIntegral;
	private double semiAxes;

    public Elipse(double semiAxes, double eIntegral) {
        this.semiAxes = semiAxes;
        this.eIntegral = eIntegral;
    }

    @Override
    public double computePerimeter() {
        return 4 * semiAxes * eIntegral;
    }

}
