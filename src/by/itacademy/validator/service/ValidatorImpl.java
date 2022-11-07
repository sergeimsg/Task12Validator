package by.itacademy.validator.service;

import java.util.Map;
import java.util.regex.Pattern;

public class ValidatorImpl implements Validator{

    private Checker checker = new Checker();

    private final String separator = ", ";
    private String message = "Correct data";
    private final Map<String, Pattern> machMap = checker.makeMap();
    private String error = "Incorrect data, check input  ";

    private final String keyLogin = checker.getLogin();
    private final String keyEmail = checker.getEmail();
    private final String keyPassword = checker.getPassword();


    @Override
    public String validate(String value) {

        String stringData[] = value.split(separator);
        String userLogin = stringData[0];
        String userPassword = stringData[1];
        String userEmail = stringData[2];

        if (!machMap.get(keyLogin).matcher(userLogin).matches()) {

            message = error + keyLogin;

        }
        if (!machMap.get(keyPassword).matcher(userPassword).matches()) {

            message = error + keyPassword;
        }
        if (!machMap.get(keyEmail).matcher(userEmail).matches()) {


            message = error + keyEmail;


        }

        if (machMap.get(keyLogin).matcher(userLogin).matches()
                && machMap.get(keyPassword).matcher(userPassword).matches()
            && machMap.get(keyEmail).matcher(userEmail).matches()){
            message = message;
        }


        return message;
    }

}
