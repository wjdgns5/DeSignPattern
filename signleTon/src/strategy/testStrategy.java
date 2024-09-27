package strategy;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class testStrategy {

    public static void main(String[] args) {
        
        // 클라이언트 측 코드
        String name = "홍길동"; // URL 인코딩에 사용할 한글 메세지
        String name2 = "%ED%99%8D%EA%B8%B8%EB%8F%99";

        // 1. 텍스트를 인코딩하는 클래스를 메모리에 올린다.
        Encoder encoder = new Encoder();
    
        UrlEncodingStrategy urlEncodingStrategy = new UrlEncodingStrategy();

         // 4. URL 인코딩 전략
         encoder.setEncodingStrategy(urlEncodingStrategy);
         String urlEncodedMessage = encoder.getMessage(name);
         System.out.println("URL 인코더: " + urlEncodedMessage);

        
        
    } // end of main

}

// 인코딩 전략 인터페이스
interface EncodingStrategy {
    String encode(String text);
}

// 도전과제 1
// HTML 인코딩 전략을 만들어 보자.
// http://localhost:8080/name="홍길동" 
// http://localhost:8080/name=%22%ED%99%8D%EA%B8%B8%EB%8F%99%22

class UrlEncodingStrategy implements EncodingStrategy {

    @Override
    public String encode(String text) {
        try {
            String searchEn = URLEncoder.encode(text, "UTF-8");
            return searchEn;
            
        } catch (Exception e) {
            e.printStackTrace();
            return text;
        }
    }
}


// 도전과제 2
// base64 디코딩 클래스를 설계하시오.
class UrlDecodingStrategy implements EncodingStrategy {

    @Override
    public String encode(String text) {
        return URLDecoder.decode(text, StandardCharsets.UTF_8);
    }

       
}

// 핵심! - 클라이언트 클래스
class Encoder {

    // 1. 추상화 (멤버)
    private EncodingStrategy encodingStrategy;
    // 2.
    // 전략에 따라 메세지를 인코딩하여 반환한다.
    public String getMessage(String message) {
        return this.encodingStrategy.encode(message); 
    }
    
    // 3.
    // 전략을 따라서 동적으로 전략을 선택할 수 있는 기능
    public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }
   
}
