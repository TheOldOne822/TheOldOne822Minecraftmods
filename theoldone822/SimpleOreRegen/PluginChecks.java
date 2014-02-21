package theoldone822.SimpleOreRegen;

public class PluginChecks {
	private static final Class simple = getSIMPLE();
	private static final Class silver = getSILVER();
	private static final Class cobalt = getCOBALT();
	private static final Class tungsten = getTUNGSTEN();
	private static final Class tennantite = getTENNANTITE();

	private static Class getSIMPLE() {
		try {
			return Class.forName("alexndr.SimpleOres.core.SimpleOres");
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	private static Class getSILVER() {
		try {
			return Class.forName("zotmc.onlysilver.OnlySilver");
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

	private static Class getTENNANTITE() {
		try {
			return Class.forName("theoldone822.Tennantite.Tennantite");
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	public static boolean getSimpleInstalled() {
		return simple != null;
	}

	public static boolean getSilverInstalled() {
		return silver != null;
	}

	public static boolean getCobaltInstalled() {
		return cobalt != null;
	}

	public static boolean getTungstenInstalled() {
		return tungsten != null;
	}

	public static boolean getTennantiteInstalled() {
		return tennantite != null;
	}
}
