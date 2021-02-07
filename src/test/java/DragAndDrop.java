import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @Test
    void DragAndDropWithSelenideActions() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(0,150).release().perform();

        $.sleep(20000);
    }
}
