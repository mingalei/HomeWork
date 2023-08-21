package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class RegistrationPage {

    SelectCalendar calendar = new SelectCalendar();

    SelenideElement
            firstname = $("#firstName"),
            lastName = $("#lastName"),
            userEmail = $("#userEmail"),
            genderSelect = $("#genterWrapper"),
            userNumber = $("#userNumber"),
            subjectsInput = $("#subjectsInput"),
            currentAddress = $("#currentAddress"),
            dateOfBirthInput = $("#dateOfBirthInput"),
            selectHobbie = $("#hobbiesWrapper"),
            uploadPicture = $("#uploadPicture"),
            state = $("#state"),
            stateSelect = $("#stateCity-wrapper #state"),
            city = $("#city"),
            citySelect = $("#stateCity-wrapper #city"),
            submitClick = $("#submit"),
            modalTable = $(".modal-content"),
            tableField = $(".table-responsive");

    public RegistrationPage openPage() {
        open("/automation-practice-form");

        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstname.setValue(value);
        return this;
    }

    public RegistrationPage selectGender(String value) {
        genderSelect.$(byText(value)).click();
        return this;
    }


    public RegistrationPage selectState(String value) {
        state.click();
        stateSelect.$(byText(value)).click();
        return this;
    }

    public RegistrationPage selectCity(String value) {
        city.click();
        citySelect.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setLastname(String value) {
        lastName.setValue(value);
        return this;
    }

    public RegistrationPage setUserEmail(String value) {
        userEmail.setValue(value);
        return this;
    }

    public RegistrationPage setUserNumber(String value) {
        userNumber.setValue(value);
        return this;
    }

    public RegistrationPage adress(String value) {
        currentAddress.setValue(value);
        return this;
    }

    public RegistrationPage hobbie(String value) {
        selectHobbie.$(byText(value)).click();
        return this;
    }

    public RegistrationPage clickSubmit() {
        submitClick.click();
        return this;
    }

    public RegistrationPage pictureUpload(String value) {
        uploadPicture.uploadFromClasspath(value);
        return this;
    }

    public RegistrationPage birthday(String day, String month, String year) {
        dateOfBirthInput.click();
        calendar.selectCalendar(day, month, year);
        return this;
    }

    public RegistrationPage subjectSelect(String value) {
        subjectsInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage checkModalTable() {
        modalTable.should(Condition.appear);

        return this;
    }

    public RegistrationPage resultPage(String checkField, String value) {
        tableField.$(byText(checkField)).parent().shouldHave(Condition.text(value));

        return this;
    }
}
