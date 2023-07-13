
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(	features = "D:\\lang\\Java\\Demo100\\src\\sources\\login1.feature"
		,glue={"D:\\lang\\Java\\Demo100\\src\\main\\java\\Login.java","Hooks"},
		monochrome=true,
		plugin={"pretty"}
		)

public class TestRunner {

}
