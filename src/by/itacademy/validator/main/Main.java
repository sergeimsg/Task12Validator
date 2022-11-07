package by.itacademy.validator.main;

import by.itacademy.validator.service.ValidatorImpl;

public class Main {
    public static void main(String[] args)  {

        ValidatorImpl validator = new ValidatorImpl();
        String toCheck = "dfsfsdf, 6asdfa1, ivanivanov33@mail.ru";
        System.out.println(validator.validate(toCheck));

    }
}