package adapter;

// 핵심 개념 
// 어댑터 클래스는 두 객체 간의 중재자로서, 서로 다른 인터페이스를 가진 객체들이 
// 함께 동작할 수 있게 한다. 

// 어댑터 클래스 : 110v 기기를 220v 전압에서 사용할 수 있도록 변환하는 역할을 시킬 예정 

// 2. 변환하고자 하는 스펙을 구현해야 한다. 
public class ElectronicAdapter implements IElectronic220v {

    // 1. 변환 시킬 스펙을 포함 관계로 가지고 있어야 한다. 
    private IElectronic110v electronic110v;


    // 3. 생성자를 통해서 110v 가전기기를 주입 받음. 이를 110v 와 220v 를 연결하게 처리 한다. 
    public ElectronicAdapter(IElectronic110v electronic110v) {
        // 멤버 변수에 초기화 처리 
        this.electronic110v = electronic110v;
    }

    @Override
    public void connect() {
        // 어댑터는 220v 인터페이스로 호출도니 메서드를 110v 기기의 connect() 로 변환하여 실행 한다. 
        electronic110v.connect();
        System.out.println("어댑터를 통해 110v 가전기기를 220v 스펙에 연결 합니다");
    }

}
