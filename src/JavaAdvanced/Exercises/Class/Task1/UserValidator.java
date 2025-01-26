package JavaAdvanced.Exercises.Class.Task1;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    public String validateEmail(String email){
        if (email == null || email.isEmpty()){
            return "Unknown";
        }
        Pattern pattern = Pattern.compile("\\b[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+\\.[A-z]{2,4}\\b");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()){
            return email;
        }
        return "Unknown";
    }
}
