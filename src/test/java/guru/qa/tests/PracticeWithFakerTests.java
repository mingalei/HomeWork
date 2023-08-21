package guru.qa.tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static utils.Variables.*;


public class PracticeWithFakerTests extends BeforeUrl {

    RegistrationPage registrationPage = new RegistrationPage();


    @Test
    void formPageObject() {
        registrationPage.openPage()
                .setFirstName(userFirstName)
                .setLastname(userLastName)
                .setUserEmail("name@example.com")
                .setUserNumber("7564536345")
                .selectGender("Male")
                .birthday("24", "July", "1996")
                .subjectSelect("Physics")
                .adress("Kazan, Lenina st., 32")
                .hobbie("Sports")
                .pictureUpload("023.png")
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
                .resultPage("Picture", "023.png")
                .resultPage("Address", "Kazan, Lenina st., 32")
                .resultPage("State and City", "NCR Noida");
    }
}