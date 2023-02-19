package nz.co.westpac.automation.buggycars.endtoendtest.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;


@RunWith(Cucumber.class)
@ExtendedCucumberOptions(jsonReport = "report/cucumber.json", usageReport = true, detailedAggregatedReport = true, overviewReport= true, overviewChartsReport = true)
@CucumberOptions(features= "src/test/resources/nz/co/westpac/automation/buggycars/features",
        glue = {"classpath:nz.co.westpac.automation.buggycars.endtoendtest.stepdefs"},
        plugin = {"pretty", "html:build/reports/cucumber/cucumber-html-report.html", "json:report/cucumber.json"},
        tags = "@smoketest"
)
public class TestRunner {
}
