import AccessAndStatic.DefaultBasic;

public class DefaultBasic3 {
    public static void main(String[] args) {
        DefaultBasic defaultBasic = new DefaultBasic();
        // default는 다른 패키지에서는 접근할 수 없습니다.
        // System.out.println(defaultBasic.name);
    }
}
