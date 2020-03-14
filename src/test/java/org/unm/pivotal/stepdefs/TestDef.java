package org.unm.pivotal.stepdefs;

import cucumber.api.java.en.Given;

public class TestDef {
    @Given("^I started to test$")
    public void iStartedToTest() {
        System.out.println("test");
    }
}
