package io.github.udaharan.jhipster.cucumber;

import org.junit.runner.RunWith;


import io.github.udaharan.jhipster.AbstractCassandraTest;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "src/test/features")
public class CucumberTest extends AbstractCassandraTest {

}
