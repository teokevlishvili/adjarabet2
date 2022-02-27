import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Test;
import java.time.Duration;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;


public class adjarabet {
    @Test
    public void adjarabet2 (){


        Configuration.browserSize = "1920x1080";
        open("https://www.adjarabet.com/ka");
        $(byAttribute("data-id","register-btn")).click();
        $(byText("შექმენი ახალი ანგარიში")).shouldBe(Condition.visible, Duration.ofMillis(5000));
        $(byAttribute("data-id","signUpFormFirstOfThree_firstname")).setValue("Teona");
        $(byAttribute("data-id","signUpFormFirstOfThree_lastname")).setValue("KEVLISHVILI");
        $(byText("მდედრობითი")).click();
        $(byAttribute("data-id","signUpFormFirstOfThree_day")).setValue("24");
        $(byAttribute("data-id","signUpFormFirstOfThree_month")).setValue("01");
        $(byAttribute("data-id","signUpFormFirstOfThree_year")).setValue("1994");
        $(byAttribute("data-id","signUpFormFirstOfThree_address")).setValue("kharabadzis:N41");
        $(byAttribute("data-id","signUpFormFirstOfThree_email")).setValue("teokevlishvili123@gmail.com");
        $(byAttribute("data-id","signUpFormFirstOfThree_username")).setValue("teona");
        $(byAttribute("data-id","signUpFormFirstOfThree_password")).setValue("Password!123");
        $(byAttribute("data-id","signUpFormFirstOfThree_password-eye")).click();
        sleep(5000);
            }
        }
