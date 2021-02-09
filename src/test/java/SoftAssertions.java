import com.codeborne.selenide.CollectionCondition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertions {

    @Test
    void shouldHaveJUnit5Example() {
        //open github
        open("https://github.com/");

        // find selenide
        $("[name='q']").setValue("selenide").pressEnter();

        // go to the first link
        $(".repo-list a").click();

        // check it
        $("h1").shouldHave(text("selenide / selenide"));

        // go to wiki
        $(byText("Wiki")).click();

        // go to SoftAssertions
        $$("ul li").findBy(text("SoftAssertions")).click();

        // check it
        $("#wiki-wrapper h1").shouldHave(text("SoftAssertions"));

        // check for JUnip5 code
        $$("#wiki-content ol li").shouldHave(CollectionCondition.itemWithText("Using JUnit5 extend test class:"));
    }
}

//$("h1 div") - найдет первый элемент h1, который будет содержать div
//$("h1").$("div") - найдет первый элемент h1, а внутри него первый div