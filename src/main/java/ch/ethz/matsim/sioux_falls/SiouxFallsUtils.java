package ch.ethz.matsim.sioux_falls;

import java.net.URL;

public class SiouxFallsUtils {
    static public URL getConfigURL() {
        return SiouxFallsUtils.class.getResource("/ch/ethz/matsim/sioux_falls/config.xml");
    }
}
