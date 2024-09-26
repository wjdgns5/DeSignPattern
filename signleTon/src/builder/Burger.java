package builder;

// 햄버거 클래스 : 빌더 패턴을 사용해 단계적으로 객체를 생성
public class Burger {

    // 필수요소와 선택적 요소가 있을 수 있다.
    private String bread;
    private String patty;
    private boolean cheese;
    private boolean tomato;
    private boolean lettuce;

    // 외부에서 이 객체를 직접 생성하지 못하도록 - private 생성자 선언
    // 내부 정적 클래스에서 생성된 상태값들을 받아 멤버 변수를 초기화 한다. 
    private Burger(BurgerBuilder builder) {
        this.bread = builder.bread;
        this.patty = builder.patty;
        this.cheese = builder.cheese;
        this.tomato = builder.tomato;
        this.lettuce = builder.lettuce;
    }


    // 반드시 정적 내부 클래스를 선언한다. 
    public static class BurgerBuilder{

        private String bread;
        private String patty;
        private boolean cheese = false;
        private boolean tomato = false;
        private boolean lettuce = false;

        // 필수 매개변수를 받을 생성자를 설계한다. 
        public BurgerBuilder(String bread, String patty) {
            this.bread =  bread;
            this.patty = patty;
        }

        // 선택적 요소를 단계적으로 추가할 수 있도록 메서드를 설계해 준다.
        public BurgerBuilder addCheese() {
            this.cheese = true;
            return this; // 메서드 체이닝 지원
        }

        // 선택적 요소를 단계적으로 추가할 수 있도록 메서드를 설계해 준다.
        public BurgerBuilder addTomato() {
            this.tomato = true;
            return this; // 메서드 체이닝 지원
        }

        // 선택적 요소를 단계적으로 추가할 수 있도록 메서드를 설계해 준다.
        public BurgerBuilder addLettuce() {
            this.lettuce = true;
            return this; // 메서드 체이닝 지원
        }

        // 핵심 1 - 최종적으로 Burger 객체를 반환하는 메서드를 생성 (만들어 준다.)
        public Burger build() {
            return new Burger(this);
        }
    }  // end of inner class

        // alt + shift + s 누르고  => "Generated toString()" 선택

        @Override
        public String toString() {
            return "BurgerBuilder [bread=" + bread + ", patty=" + patty + ", cheese=" + cheese + ", tomato=" + tomato
                    + ", lettuce=" + lettuce + "]";
        } 

    }


