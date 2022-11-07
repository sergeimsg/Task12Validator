package by.itacademy.validator.service;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Checker {

    private final String email = "([.[^@\\s]]+)@([.[^@\\s]]+)\\.([a-z]+)";
    private final String login = "([.[^@\\s]]+)";
    private final String password = "([.[^@\\s]]+)";

    private final Pattern emailPattern = Pattern.compile(email);

    private final Pattern loginPattern = Pattern.compile(login);
    private final Pattern passwordPattern = Pattern.compile(password);

    private Map <String, Pattern> checkerMap = new HashMap<String, Pattern> ();

    public Map<String, Pattern> makeMap () {
            checkerMap.put("email", emailPattern);
            checkerMap.put("login", loginPattern);
            checkerMap.put("password", passwordPattern);

            return checkerMap;
    }

    public String getEmail() {
        return "email";
    }

    public String getLogin() {
        return "login";
    }
    public String getPassword(){

        return "password";
    }



}
