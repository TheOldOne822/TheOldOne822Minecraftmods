package theoldone822.NetherrocksFusion;

public class PluginChecks {
	private static final Class cthon = getCTHON();
	private static final Class cobalt = getCOBALT();
	private static final Class tungsten = getTUNGSTEN();

	private static Class getCTHON() {
		try {
			return Class.forName("akkamaddi.cthon.core.SimpleCthonCore");
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	private static Class getCOBALT() {
		try {
			return Class.forName("akkamaddi.simplecobalt.code.SimpleCobaltCore");
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	private static Class getTUNGSTEN() {
		try {
			return Class.forName("akkamaddi.simpletungsten.code.SimpleTungstenCore");
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	public static boolean getCthonInstalled() {
		return cthon != null;
	}

	public static boolean getCobaltInstalled() {
		return cobalt != null;
	}

	public static boolean getTungstenInstalled() {
		return tungsten != null;
	}

}
