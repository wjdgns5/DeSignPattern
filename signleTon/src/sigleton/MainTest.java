package sigleton;

public class MainTest {

    public static void main(String[] args) {
        // 싱글톤 객체를 불러 와보자. !!
        SingleTon systemSingleTon1 = SingleTon.getInstance();
        SingleTon systemSingleTon2 = SingleTon.getInstance();

        if (systemSingleTon1 == systemSingleTon2) {
            System.out.println("같은 객체를 바라 보고 있습니다.");
        }

        test systemSingleTon3 = test.getInstance();
        test systemSingleTon4 = test.getInstance();

        if (systemSingleTon3 == systemSingleTon4) {
            System.out.println("같은 객체를 바라 보고 있습니다.");
        }

    }

}
