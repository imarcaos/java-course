package entities;

public class Rectangle {

    public double width;
    public  double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double Diagonal() {
        // d = raiz quadrada(width^2 + heigth^2)
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}
