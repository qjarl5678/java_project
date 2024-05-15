package ExceptionBasic;

public class ExceptionSample2 {

    // RuntimeException = 에러가 날 수도 있고 안날수도 있을때
    // Exception  = 보통 예측이 가능할 때
    class FoolException extends Exception{
    }

    public void sayNick(String nick) throws FoolException{
            if ("바보".equals(nick)){
                throw new FoolException();
            }
            System.out.println("당신의 별명은 " + nick + "입니다.");
    }

    public static void main(String[] args) {
        ExceptionSample2 sample1 = new ExceptionSample2();
        ExceptionSample2 sample2 =  new ExceptionSample2();

        try {

            sample1.sayNick("바보");
            sample2.sayNick("햄스터");

        } catch (FoolException e) {
            System.err.println("FoolException 발생!!");
        }

    }
}
