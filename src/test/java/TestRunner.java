import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions( plugin = {"pretty",
        "html:target/cucumber-reports/cucumber-report.html",
        "json:target/cucumber-reports/cucumber.json"
}, features = "src/test/resources/feature/Calculator.feature", stepNotifications = true)
public class TestRunner {
}