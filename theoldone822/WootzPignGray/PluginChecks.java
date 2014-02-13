package theoldone822.WootzPignGray;

public class PluginChecks {
	private static final Class hadite = getHADITE();
	private static final Class sterling = getSTERLING();

	private static Class getHADITE() {
		try {
			return Class.forName("SimpleOres.plugins.akkamaddi.hadite.code.HaditeCoalCore");
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	private static Class getSTERLING() {
		try {
			return Class.forName("SimpleOres.plugins.akkamaddi.SterlingAndBlack.code.SterlingAndBlackCore");
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	public static boolean getHaditeInstalled() {
		return hadite != null;
	}

	public static boolean getSterlingInstalled() {
		return sterling != null;
	}
}
