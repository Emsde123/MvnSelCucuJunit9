package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // features specifies where our feature files are located.
        // by extending the path to loginPage.feature we're saying we only want to run
        // tests that exist in loginPage.feature
        features = "src/test/resources/Features",

        // points to the glue, or what's holding our tests together.
        // It points to where the methods are located.
        // Refers to the annotations, not the method names.
        glue = {"StepDefinitions"},


        // If we run our test with dry run enabled, it will not execute the tests.
        // dryRun will check if you have any unconverted steps,
        // if we run it before defining step definitions it will auto generate a bunch of empty methods
        // that will be mapped to each step, allowing us to implement the body.
        // We can change it back to false once we know all steps have been converted.
        dryRun = false,

        // Maps what test cases we want to execute.
   //   tags = {"@smoke", "@positive"}  <-- says run all tests with @smoke AND @positive tags
   //   tags = {"@smoke, @positive"}    <-- says to run all tests with @smoke OR @positive tags
   //   tags = {"@regression", "~@positive"} <-- runs @regression tag and IGNORES @positive tags
   //   tags = {"@regression", "not @positive"} <-- does the same as above IGNORES @positive tags
        tags = {"@run"},  //          <-- runs tests with @smoke tag

        // This assigns the format of the reports, and also specifies where we want our reports to go.
        // ALSO sets the data type (HTML)
        plugin = {"pretty", "html:target/cucumber-reports"},

        // Doesn't do any configuration, just changes visuals.
        monochrome = false
)





public class TestRunner {



}
