package sigleton;

public class test {

    // 1. 정적 변수를 선언한다.
    // 2. private 생성자를 선언한다.
    // 3. 외부에서 접근할 수 있는 public 정적 메서드를 선언한다.
    private static test instance;

    // 생성자를 생성
    private test() {}

    public static synchronized test getInstance() {
        if(instance == null) {
            instance = new test();
        }
        return instance;
    }
}
