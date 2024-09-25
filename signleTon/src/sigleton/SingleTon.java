package sigleton;

// 1. 정적 변수를 선언한다. 
// 2. private 생성자를 선언한다. 
// 3. 외부에서 접근할 수 있는 public 정적 메서드를 선언한다. 
public class SingleTon {

    // 1. 유일한 인스턴스를 저장할 변수를 선언한다. (private, static)
    private static SingleTon instance; 

    // 2. 외부에서 객체를 생성 못 하도록 private 생성자를 선언한다. 
    private SingleTon() {}

    // 3. 외부에서 인스턴스 주소를 반환 받을 수 있는 메서드를 선언한다. 
    // 심화 : 멀티 스레스 환경에서 안정하게 싱글톤 패턴을 구현 하기 위해서는 
    public static synchronized SingleTon getInstance() { // 동기화 처리 
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }




}
