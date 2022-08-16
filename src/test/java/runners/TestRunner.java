package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"

        },
        features = "./src/test/resources/features",
        glue = "stepdefinitions",
<<<<<<< Updated upstream
        tags = "@tum",
        dryRun = true

=======
        tags = "@all",
        dryRun =true
>>>>>>> Stashed changes
)
public class TestRunner {

}
