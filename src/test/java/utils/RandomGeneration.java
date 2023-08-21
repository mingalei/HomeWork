package utils;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class RandomGeneration {
    static Faker faker = new Faker();


    public static String getFirstName() {
        return faker.name().firstName();
    }

    public static String getLastName(){
        return faker.name().lastName();
    }
}
