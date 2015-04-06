package theoldone822.WootzPignGray;

public class PluginChecks {
	private static final Class<?> hadite = getHADITE();
	private static final Class<?> cobalt = getCOBALT();
	private static final Class<?> tungsten = getTUNGSTEN();
	private static final Class<?> sterling = getSTERLING();
	private static final Class<?> steel = getSTEEL();

	private static Class<?> getHADITE() {
		try {
			return Class.forName("akkamaddi.plugins.hadite.HaditeCoal");
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	private static Class<?> getCOBALT() {
		try {
			return Class.forName("akkamaddi.plugins.simplecobalt.SimpleCobalt");
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	private static Class<?> getTUNGSTEN() {
		try {
			return Class.forName("akkamaddi.plugins.simpletungsten.SimpleTungsten");
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	private static Class<?> getSTERLING() {
		try {
			return Class.forName("akkamaddi.plugins.SterlingAndBlack.SterlingAndBlack");
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	private static Class<?> getSTEEL() {
		try {
			return Class.forName("akkamaddi.plugins.SteelyGlint.SteelyGlint");
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	public static boolean getHaditeInstalled() {
		return hadite != null;
	}

	public static boolean getCobaltInstalled() {
		return cobalt != null;
	}

	public static boolean getTungstenInstalled() {
		return tungsten != null;
	}

	public static boolean getSterlingInstalled() {
		return sterling != null;
	}

	public static boolean getSteelInstalled() {
		return steel != null;
	}
}
