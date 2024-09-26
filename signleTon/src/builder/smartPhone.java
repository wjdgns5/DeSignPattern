package builder;

// 스마트폰 클래스 : 빌더 패턴을 사용해 단계적으로 객체를 생성
public class smartPhone {

    private String display;
    private String sound;
    private boolean touch;
    private boolean charge;
    private boolean camera;

    private smartPhone(smartPhoneBuilder builder) {
        this.display = builder.display;
        this.sound = builder.sound;
        this.touch = builder.touch;
        this.charge = builder.charge;
        this.camera = builder.camera;
    }

    public static class smartPhoneBuilder {

        private String display;
        private String sound;
        private boolean touch = false;
        private boolean charge = false;
        private boolean camera = false;

        public smartPhoneBuilder(String display, String sound) {
            this.display = display;
            this.sound = sound;
        }

        public smartPhoneBuilder addTouch() {
            this.touch = touch;
            return this;
        }

        public smartPhoneBuilder addcharge() {
            this.touch = touch;
            return this;
        }

        public smartPhoneBuilder addcamera() {
            this.touch = touch;
            return this;
        }

     public smartPhone build() {
        return new smartPhone(this);
     }
    } // end of inner class

    @Override
    public String toString() {
        return "smartPhone [display=" + display + ", sound=" + sound + ", touch=" + touch + ", charge=" + charge
                + ", camera=" + camera + "]";
    }

    

   



}
