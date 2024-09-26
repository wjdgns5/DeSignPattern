package builder;

public class smartPhoneStore {

    public static void main(String[] args) {
        
        smartPhone phone1 = new smartPhone
            .smartPhoneBuilder("디스플레이", "소리")
            .addTouch()
            .addcamera()
            .addcharge()
            .build();

            System.out.println(phone1);
            System.out.println("-------");
    }

}
