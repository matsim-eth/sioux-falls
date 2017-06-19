import ch.ethz.matsim.sioux_falls.SiouxFallsUtils;
import org.junit.Test;
import org.matsim.api.core.v01.Scenario;
import org.matsim.core.config.Config;
import org.matsim.core.config.ConfigUtils;
import org.matsim.core.controler.Controler;
import org.matsim.core.scenario.ScenarioUtils;

public class RunSiouxFallsTest {
    @Test
    public void testSiouxFalls() {
        Config config = ConfigUtils.loadConfig(SiouxFallsUtils.getConfigURL());
        config.controler().setLastIteration(1);

        Scenario scenario = ScenarioUtils.loadScenario(config);

        Controler controler = new Controler(scenario);
        controler.run();
    }
}
