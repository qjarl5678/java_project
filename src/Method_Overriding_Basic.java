class Cat extends Animal {  // Animal 클래스를 상속한다.
    // void sleep 메서드는 함수 인자가 없고, 실행 시 this.name + "zzz"를 출력합니다.
    void speak() {
        System.out.println(this.name+" 냐아아옹~ 냐아아옹~");
    }
}

class SiamCat extends Cat{
    void speak() {
        System.out.println(this.name+" 멍멍멍 왈왈왈~ 2찍 냐옹~ 1찍도 냐옹~");
    }
    void speak(int jjik){
        System.out.println(this.name+" 멍멍멍 왈왈왈~ 2찍 냐옹~ 1찍도 냐옹~ 하지만 나는 " + jjik + "번 찍었다~");
    }
}

public class Method_Overriding_Basic {
    public static void main(String[] args) {
        SiamCat siamCat = new SiamCat();
        Cat cat = new Cat();
        siamCat.setName("나비");
        cat.setName("바둑이");
        siamCat.speak();
        cat.speak();


        siamCat.speak(100);
    }
}
