package factory;

// 다형성 

/**
 *  InnerCharacterFactory
 */
interface Character {
    void attack(); // 각 캐릭터의 공격 방식을 정의하는 메서드  
}

 // 전사 클래스
class Warrior implements Character {
    @Override
    public void attack() {
        System.out.println("전사가 칼로 공격을 합니다.");
        
    }
}

 // 마법사 클래스
 class Mage implements Character {
    @Override
    public void attack() {
        System.out.println("마법사가 화염구를 발사합니다.");
        
    }
}

 // 궁수 클래스
 class Archer implements Character {
    @Override
    public void attack() {
        System.out.println("궁수가 화살을 쏩니다."); 
    }
}

// 팩토리 클래스 - 구체적인 클래스를 생성하는 로직을 캡슐화 한다.
public class CharacterFactory {
    // 리턴 타입 : Character
    public Character createCharacter(String type) {
        if(type.equalsIgnoreCase("warrior")) {
            return new Warrior();

        } else if (type.equalsIgnoreCase("mage")) {
            return new Mage();

        } else if (type.equalsIgnoreCase("archer")) {
            return new Archer();

        }
        return null;
    }
}
