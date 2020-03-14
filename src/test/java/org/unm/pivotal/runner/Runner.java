package org.unm.pivotal.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * It is in charged to define the Cucumber Runner class.
 */
@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/resources/features/"},
        tags = {"@test"},
        glue = {"org.unm.pivotal"})
public class Runner extends AbstractTestNGCucumberTests {
}
