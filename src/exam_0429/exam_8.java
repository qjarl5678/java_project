package exam_0429;

// Shape 인터페이스
interface Shape {
    double getArea();
}

// Circle 클래스
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle 클래스
class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}


public class exam_8 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(5, 5);

        System.out.println("원의 넓이 : " + circle.getArea());
        System.out.println("사각형의 넓이 : " + rectangle.getArea());
    }

}
