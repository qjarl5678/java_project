import java.util.ArrayList;

public class Conditional_Statement_Basic {
    public static void main(String[] args) {

        boolean have_a_lot_of_money = true; // 현재 내 상태

        // 조건문
        if(have_a_lot_of_money == true){
            System.out.println("택시를 탄다.");
        }else{
            System.out.println("걸어간다.");
        }


        // 정수 타입의 조건

        int money = 2000;
        boolean hasCard = true;

        // 내가 지금 돈이 2800원 이상이거나 카드가 true인 경우 택시를 탈 수 있다.
        if (money >= 2800 || hasCard == true){
            System.out.println("택시를 탄다.");
        }else{
            System.out.println("걸어간다.");
        }

        if (money >= 2800 && hasCard == true || (money >= 2800 || hasCard == true)){
            System.out.println("택시를 탄다.");
        }else{
            System.out.println("걸어간다.");
        }

        // 반드시 else를 써야 하는건 아니다.
        if(money == 2000){
            System.out.println("돈이 2천원 있다.");
        }

        // 문자가 들어갈 수 있는 pocket이라는 방 생성
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("돈");
        pocket.add("담배");
        pocket.add("라이터");
        // contains = 포함
        // & = 앰퍼센트
        if (pocket.contains("담배") && pocket.contains("key")){
            System.out.println("버리고 금연한다.");
        } else if (pocket.contains("돈")) {
            System.out.println("난 돈이 있어");
        } else{
            System.out.println("편의점에서 새로 산다.");
        }
        // [0] = 1  X

        int myAge = 30;
        switch (myAge){
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                System.out.println("20대 초반");
                break;

            case 25:
                System.out.println("20대 중반");
                break;
            case 26:
            case 27:
            case 28:
            case 29:
                System.out.println("20대 후반");
                break;
            default:
                System.out.println("20대가 아닌 다른 나이");
                break;
        }





    }
}
