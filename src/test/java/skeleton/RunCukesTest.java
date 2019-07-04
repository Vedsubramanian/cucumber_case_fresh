package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/skeleton/signin.feature","src/test/resources/skeleton/signup.feature","src/test/resources/skeleton/search.feature","src/test/resources/skeleton/addtocart.feature"},
glue="skeleton",
plugin="json:target/cucumbernew.json")
public class RunCukesTest {
}
