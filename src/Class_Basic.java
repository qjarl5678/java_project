//     2. 자동차 클래스 안에는 브랜드, 탑승 가능한 인원 수, 가격의 객체 변수가 있다.
//    이 자동차 클래스를 사용해 3가지 자동차 객체를 만들어서 출력하시오.

class car {
    String brand;
    int rider;
    int price;

    public void setCar(String brand, int price, int rider){
        this.brand = brand;
        this.rider = rider;
        this.price = price;
    }
}

public class Class_Basic {
//     1.붕어빵에는 3가지 맛이 있다. (크림, 팥, 김치)
//     3가지 종류의 맛을 넣어서 붕어빵을 출력하는 메서드를 만드시오.
    public  static void bungabbang (String[] taste, int idx){
        System.out.println(taste[idx] + "붕어빵 입니다.");
    }
    public static void main(String[] args) {
        car sjcar = new car();
        car shcar = new car();
        sjcar.setCar("아우디",2000000000, 5 );

        shcar.brand = "벤츠";
        shcar.rider = 10;
        shcar.price = 500;

        System.out.println(sjcar.brand + ", " + sjcar.rider + ", " + sjcar.price);
        System.out.println(shcar.brand + ", " + shcar.rider + ", " + shcar.price);

        String [] taste = {"크림", "팥", "김치"};
        bungabbang(taste, 0);
    }
}
