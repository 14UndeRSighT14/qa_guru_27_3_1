package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        // Чтобы не ждать пока страница загрузится
        Configuration.pageLoadStrategy = "eager";
        // Таймаут
        Configuration.timeout = 5000;
    }

    @Test
    void fillFormTest() {
        open("/text-box");
        $("#userName").setValue("Slava");
        $("#userEmail").setValue("slava@mail.ru");
        $("#currentAddress").setValue("Ufa");
        $("#permanentAddress").setValue("Street");
        $("#submit").click();

        $("#output #name").shouldHave(text("Slava"));
        $("#output #email").shouldHave(text("slava@mail.ru"));
        $("#output #currentAddress").shouldHave(text("Ufa"));
        $("#output #permanentAddress").shouldHave(text("Street"));
    }
}
