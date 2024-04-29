package exam_0429;

public class exam_0429 {
    /**
     *
     * 1. 자바에서 상수로 선언한 객체는 다시 재선언을 하는 것이 불가능하다.
     * 자바에서 상수를 선언할 때 사용하는 키워드는 무엇인가? (final)
     *
     * 2. final int mini = 3; 라는 코드가 있을 때 여기서 상수와 리터럴을 각각 쓰시오.
     * 상수 =  mini
     * 리터럴 = 3
     *
     * */

    public static void main(String[] args) {

       /**
        * 3. 삼항 연산자를 사용하여 아래 코드를 수정해 number가 0일 경우 false를 아닐경우 true를 출력하시오.
        * */
        int number = 0;
        System.out.println("3번 정답:" + (number == 0 ? false : true));


        /**
         * 4. 10x10의 이차원 배열 dArray를 만들고 아래와 같이 값을 넣는 코드를 작성하시오.
         * */
        int[][] dArray = new int[10][10];
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                dArray[i][j] = j;
            }
        }

        // 4번 출력
        System.out.println("4번 출력 : ");
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.print(dArray[i][j] + " ");
            }
            System.out.println();
        }

        /**
         * 5. 반복문을 사용하여 2차원 배열의 총 합계를 구하는 코드를 작성하시오.
         * */
        int sum = 0;
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                sum += dArray[i][j];
            }
        }

        System.out.println("5번 답 : " + sum);

        /**
         *
         * 6. Switch Case 문을 사용해 월을 숫자로 입력 받아 영어의 월을 출력하는 코드를 작성하시오.
         * ex.) 1 입력 시 January.
         *
         * */

        int monthNumber = 11;
        String monthName;

        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month number";
                break;
        }

        System.out.println("6번 답: " + monthName);
    }
}
