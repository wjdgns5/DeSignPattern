package dto;

import java.util.List;

// import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@JsonNaming(value = PropertyNamingStrategies.StandardCharsets.class);
public class UserDTO {

    private String name;
    private Integer age;
    private List<CarDTO> car_list;
   
    // 내부 클래스로 만들어 본다.
    class CarDTO {
        private String name;
      //  @JsonProperty("car_number")
        private String carName;
    }
}
