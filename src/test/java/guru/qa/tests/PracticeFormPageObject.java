package guru.qa.tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

public class PracticeFormPageObject extends BeforeUrl {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void first() {
        registrationPage.openPage()
                .setFirstName("Aydar")
                .setLastname("Mingaleev")
                .setUserEmail("name@example.com")
                .setUserNumber("7564536345")
                .selectGender("Male")
                .selectBirthday("24", "July", "1996")
                .subjectSelect("Physics")
                .adressSelect("Kazan, Lenina st., 32")
                .hobbieSelect("Sports")
                .pictureUpload("01.jpg")
                .selectState("NCR")
                .selectCity("Noida")
                .clickSubmit();

        registrationPage.checkModalTable()
                .resultPage("Student Name", "Aydar Mingaleev")
                .resultPage("Student Email", "name@example.com")
                .resultPage("Gender", "Male")
                .resultPage("Mobile", "7564536345")
                .resultPage("Date of Birth", "24 July,1996")
                .resultPage("Subjects", "Physics")
                .resultPage("Hobbies", "Sports")
                .resultPage("Picture", "01.jpg")
                .resultPage("Address", "Kazan, Lenina st., 32")
                .resultPage("State and City", "NCR Noida");
    }
}