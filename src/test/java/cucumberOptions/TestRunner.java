package cucumberOptions;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/Feature/search.feature"}, 
        glue="stepDefinations",tags ="@SeleniumTest",monochrome=true,
        plugin = {"pretty",
        "json:target/cucumber_json_reports/home-page.json",
        "html:target/home-page-html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
      
        
        //glue = "com.automatedtest.digital.infrastructure.driver", tags="@SeleniumTest","stepDefinations")
public class TestRunner {

}
