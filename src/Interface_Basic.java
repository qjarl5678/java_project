abstract class Predator extends Animal{
    abstract String getFood();

     void printFood(){
         //default를 제거한다. - 인터페이스에서 추상화 클래스로 변경했기 때문에 default method는 더이상 사용할 수 없습니다.
        System.out.printf("my food is %s\n", getFood());
    }
}

interface Barkable{
    void bark();
}

class Tiger extends Predator implements Barkable{
    public String getFood(){
        return "apple";
    }
    public void bark() {
        System.out.println("어흥~~~~~~");
    }
}

class Lion extends Predator implements Barkable {
    public String getFood() {
        return "banana";
    }
    public void bark() {
        System.out.println("냐옹~~!!@!@!@!@!@!@!@!@!@!@!");
    }
}

class ZooKeeper{
    void feed ( Predator predator ){
        System.out.println("feed " + predator.getFood());
    }
}

class Bouncer{
    void barkAnimal( Barkable barkable ){
        /**
         * TODO: 인터페이스에서 생성한 메서드를 기반으로 효율적으로 바꿔봅시다.
         * **/
        barkable.bark();
    }
}

public class Interface_Basic {
    public static void main(String[] args) {
//        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
//        zooKeeper.feed(tiger);
//        zooKeeper.feed(lion);

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);

        Tiger tiger1 = new Tiger();  // Tiger is a Predator
        tiger1.bark();
        tiger1.getFood();
    }
}
