class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {  // Animal 클래스를 상속한다.
    // void sleep 메서드는 함수 인자가 없고, 실행 시 this.name + "zzz"를 출력합니다.
    void sleep() {
        System.out.println(this.name+" zzz");
    }
}

public class Inheritance_Basic {
    public static void main(String[] args) {
        Dog dog = new Dog();
//        Animal dog = new Dog(); == 가능하지만 Dog Class의 메서드는 사용할 수 없습니다. == Dog is a Animal
//        Dog dog = new Animal(); == X 불가능 == Animal is a Dog
        dog.setName("뽀삐");
        System.out.println(dog.name);
        dog.sleep();
    }
}
