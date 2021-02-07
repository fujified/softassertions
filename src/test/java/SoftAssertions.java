import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertions {

    @Test
    void shouldHaveJUnit5Example() {
        open("https://github.com/");
        $("[name='q']").setValue("selenide").pressEnter();
        $$("ul.repo-list li").first().$("a").click();
        $("h1").shouldHave(text("selenide / selenide"));
        $$("ul.UnderlineNav-body.list-style-none li").get(4).$("a").click();
        $("#wiki-wrapper h1").shouldHave(text("Home"));
        $$("ul li").findBy(text("SoftAssertions")).click();
        $("#wiki-wrapper h1").shouldHave(text("SoftAssertions"));
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class"));
    }
}