/**
 * @author bonchervu.meena
 *
 */

package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions( features = "features",glue="stepsDefinition")

public class TestRunner {

}

//features reference and steps defination actual implemnation for the scenario