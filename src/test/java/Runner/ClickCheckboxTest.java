package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
//        format = { "pretty", "html:target/pippo", "json:target/cucumber.json" },
        features = {"src/test/resources/features/first2.feature"},
        tags = {"@Checkbox"},
        glue = "com.step.definitions")
public class ClickCheckboxTest {

}

