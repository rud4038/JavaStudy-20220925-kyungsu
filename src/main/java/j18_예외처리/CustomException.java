package j18_예외처리;

import lombok.Getter;

import java.util.Map;

@Getter
public class CustomException extends RuntimeException {

    Map<String, String> errorMap;

    public CustomException(String message, Map<String, String> errorMap) {
        super(message);
        this.errorMap = errorMap;
    }

}
