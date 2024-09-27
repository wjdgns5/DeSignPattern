package adapter;

public class MyHouse {

    // 정적 메서드 (기능 )
    // 집에 220v 전기 콘센트를 연결 하는 메서드 
    public static void homeConnect(IElectronic220v electronic220v) {
        // 청소기, 드라이어기, 냉장고, 티비 
        electronic220v.connect();
    }

    public static void main(String[] args) {
        
        // 집 콘센트에 220v 스펙을 구현한 에어컨을 연결해 보자. 
        AirConditioner airConditioner = new AirConditioner();
        homeConnect(airConditioner);

        HairDryer dryer = new HairDryer();
        // 문제 발생 
        // homeConnect(dryer);  220v 에는 연결 불가 

        // 어댑터 클래스를 사왔음 
        ElectronicAdapter 헤어드라이기연결어댑터 = new ElectronicAdapter(dryer);
        homeConnect(헤어드라이기연결어댑터);
    
    } // end of main 

}  // end of MyHouse 


// 스펙 : 220v 가전기기 인터페이스 
interface IElectronic220v {
    void connect(); 
}

// 스펙 : 110v 가전기기 인터페이스 
interface IElectronic110v {
    void connect();
}

/**
 * AirConditioner 
 */
class AirConditioner implements IElectronic220v {

    @Override
    public void connect() {
        System.out.println("에어컨 연결 220v On");
        
    }
    
}

class HairDryer implements IElectronic110v {
    @Override
    public void connect() {
        System.out.println("헤어드라이기 연결 110v On");
    }

}