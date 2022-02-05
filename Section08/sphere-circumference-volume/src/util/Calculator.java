package util;

public class Calculator {
	
	// para estudar a diferença, será retirado o static das declarações	
	public final double PI = 3.14159;
	
	public double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
