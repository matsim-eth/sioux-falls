package ch.ethz.matsim.sioux_falls;

import org.matsim.api.core.v01.Scenario;
import org.matsim.core.config.Config;
import org.matsim.core.config.ConfigUtils;
import org.matsim.core.controler.Controler;
import org.matsim.core.scenario.ScenarioUtils;

public class RunSiouxFalls {
    static public void main(String[] args) {
        Config config = ConfigUtils.loadConfig(SiouxFallsUtils.getResource("config.xml"));
        Scenario scenario = ScenarioUtils.loadScenario(config);

        Controler controler = new Controler(scenario);
        controler.run();
    }
}
