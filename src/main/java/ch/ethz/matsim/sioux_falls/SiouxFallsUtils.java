package ch.ethz.matsim.sioux_falls;

import java.net.URL;

public class SiouxFallsUtils {
    static public URL getResource(String path) {
        return SiouxFallsUtils.class.getResource("../../../../" + path);
    }
}
