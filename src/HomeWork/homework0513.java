package HomeWork;

class Student {
    //field
    private String name;
    private String id;
    private int year;
    private String major;

    private static int count = 0;

    public Student (String name, String id, int year, String major){
        this.name = name;
        this.id = id;
        this.year = year;
        this.major = major;
        count++;
    }

    public void printInfo(){
        System.out.println("Name: " + name + ", ID: " + id + ", Year: " + year + ", Major: " + major);
    }

    public static int getCount(){
        return count;
    }
}

/**
 * 하나의 클래스를 만듭니다. 이 클래스는 학생들의 정보를 나타내는 Student 클래스입니다.
 * 학생의 이름(name), 학번(id), 학년(year), 그리고 전공(major)을 나타내는 필드를 포함해야 합니다.
 *
 * Student 클래스에는 학생의 수를 추적하는 정적(static) 필드를 추가하세요.
 *
 * 생성자를 구현하여 모든 필드를 초기화합니다.
 *
 * 학생의 수를 반환하는 정적(static) 메서드 getCount()를 추가하세요.
 *
 * 학생 정보를 출력하는 인스턴스 메서드 printInfo()를 추가하세요.
 *
 * 이 클래스를 테스트하는 Main 클래스를 작성하세요. Main 클래스에서는 다음을 수행해야 합니다.
 *
 * 몇 명의 학생을 생성하고, 각 학생의 정보를 설정합니다.
 * getCount() 메서드를 사용하여 학생 수를 출력합니다.
 * 모든 학생의 정보를 출력하기 위해 printInfo() 메서드를 호출합니다.
 *
 *
 * */
public class homework0513 {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", "20210001", 1, "Computer Science");
        Student student2 = new Student("Jane Smith", "20210002", 2, "Biology");
        Student student3 = new Student("Bob Brown", "20210003", 3, "English");

        System.out.println("총 학생의 수 : " + Student.getCount());
        student1.printInfo();
        student2.printInfo();
        student3.printInfo();
    }
}
