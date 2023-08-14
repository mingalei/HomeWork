package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPageObject {


    @BeforeAll
    static void beforeAll()
    {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy="eager";

    }


    @Test
    void first()
    {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        $("#firstName").setValue("Aydar");
        $("#lastName").setValue("Mingaleev");
        $("#userEmail").setValue("name@example.com");
        $("label[for='gender-radio-1']").click();
        $("#userNumber").setValue("7564536345");
        $("#dateOfBirthInput").click();
        $("select[class='react-datepicker__year-select'] option[value='1996']").click();
        $("select[class='react-datepicker__month-select'] option[value='5']").click();
        $("div[class='react-datepicker__day react-datepicker__day--024']").click();
        $("#subjectsInput").setValue("c");
        $("#react-select-2-option-4").click();
        $("label[for='hobbies-checkbox-3']").click();
        $("#uploadPicture").uploadFromClasspath("01.jpg");
        $("#currentAddress").setValue("Kazan, Lenina st., 32");
        $("#state").click();
        $x("//div[text()='NCR']").click();
        $("#city").click();
        $x("//div[text()='Noida']").click();
        $("#submit").click();

        $x("//tr[1]//td[2]").shouldHave(exactText("Aydar Mingaleev"));
        $x("//tr[2]//td[2]").shouldHave(exactText("name@example.com"));
        $x("//tr[3]//td[2]").shouldHave(exactText("Male"));
        $x("//tr[4]//td[2]").shouldHave(exactText("7564536345"));
        $x("//tr[5]//td[2]").shouldHave(exactText("24 June,1996"));
        $x("//tr[6]//td[2]").shouldHave(exactText("Accounting"));
        $x("//tr[7]//td[2]").shouldHave(exactText("Music"));
        $x("//tr[8]//td[2]").shouldHave(exactText("01.jpg"));
        $x("//tr[9]//td[2]").shouldHave(exactText("Kazan, Lenina st., 32"));
        $x("//tr[10]//td[2]").shouldHave(exactText("NCR Noida"));
    }
}