public class Loop_Basic {
    public static void main(String[] args) {

        // While 반복문
        // 조건문이 true일동안 반복합니다.
        int treeHit = 0;
        while (treeHit < 10){
            treeHit ++;
            if (treeHit % 10 != 0){
                continue;
            }
            System.out.println("나무를 " + treeHit + "번 찍었습니다.");
            if (treeHit == 100){
                System.out.println("나무가 넘어갑니다~");
                break;
            }
        }

        // For 문
        String[] dlist = {"one", "two", "three", "four", "five"};

        // 하나씩 출력하기에는 너무 비효율적입니다.
//        System.out.println(dlist[0]);
//        System.out.println(dlist[1]);
//        System.out.println(dlist[2]);
//        System.out.println(dlist[3]);
//        System.out.println(dlist[4]);

        // 그렇다면 for문을 통해 출력을 하면 됩니다.
        // .length == 배열의 길이를 반환.

        for (int i = 0; i < 10; i++){
            if (i > 4){
                break;
            }
            System.out.println(dlist[i]);
//            if (i < 5){
//                System.out.println(dlist[i]);
//            }

//            System.out.println(dlist.length);
        }




    }
}
