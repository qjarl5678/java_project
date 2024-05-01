package exam_0429;

interface Shape {
    double getArea();
}

class Circle2 implements Shape{
    private double radius; // instance 변수 radius - 반지름 선언

    public Circle2(double i) {
        this.radius = i;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        // 원의 넓이 구하는 공식 =  반지름 * 반지름 * PI
        return radius * radius * Math.PI;
    }
}

class Rectangle implements Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }
}

/**
 *
 * 8. 다음의 요구 사항을 충족시키는 Java 프로그램을 작성하세요.
 *
 * 8-1. Shape 인터페이스를 만드세요. 이 인터페이스는 getArea() 메서드를 가져야 합니다.  - clear
 *
 * 8-2. Circle 클래스를 작성하세요. 이 클래스는 Shape 인터페이스를 구현해야 합니다.
 * Circle 클래스는 반지름을 인스턴스 변수로 가지며, getArea() 메서드를 구현하여 원의 넓이를 반환해야 합니다.
 *
 * 8-3. Rectangle 클래스를 작성하세요. 이 클래스는 Shape 인터페이스를 구현해야 합니다.
 * Rectangle 클래스는 가로와 세로를 인스턴스 변수로 가지며, getArea() 메서드를 구현하여 직사각형의 넓이를 반환해야 합니다.
 *
 * 8-4. Main 클래스에서는 Circle 및 Rectangle 객체를 생성하고, 각 객체의 넓이를 출력하세요.
 *
 * */
public class homework08 {
    public static void main(String[] args) {
        Circle2 circle2 = new Circle2(10);
        Rectangle rectangle = new Rectangle(8,7);

        // setWidthAndHeight 메서드를 만들고 가로는 8, 세로는 7을 넣어주고 출력해보세요.
//        circle2.setRadius(10);
//        rectangle.setWidthAndHeight(8,7);

        System.out.println("원의 넓이 : " + circle2.getArea());
        System.out.println("사각형의 넓이 : " + rectangle.getArea()) ;

    }

}
