package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
//        format = { "pretty", "html:target/pippo", "json:target/cucumber.json" },
        features = {"src/test/resources/Second.feature"},
        tags = {"@FileDownload"},
        glue = "com.step.definitions")
public class FileDownloadTest2 {

}

