package theoldone822.NetherrocksFusion;

public class PluginChecks {
	private static final Class fusion = getFUSION();
	private static final Class simple = getSIMPLE();
	private static final Class nether = getNETHER();
	private static final Class silver = getSILVER();
	private static final Class netherfusion = getNETHERFUSION();
	private static final Class arsenic = getARSENIC();
	private static final Class alchemy = getALCHEMY();
	private static final Class cthon = getCTHON();
	private static final Class glitter = getGLITTER();
	private static final Class hadite = getHADITE();
	private static final Class cobalt = getCOBALT();
	private static final Class tungsten = getTUNGSTEN();
	private static final Class sterling = getSTERLING();

	private static Class getFUSION() {
		try {
			return Class.forName("SimpleOres.plugins.fusion.FusionPlugin");
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	private static Class getSIMPLE() {
		try {
			return Class.forName("SimpleOres.core.SimpleOres");
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	private static Class getNETHER() {
		try {
			return Class.forName("Netherrocks.core.Netherrocks");
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	private static Class getSILVER() {
		try {
			return Class.forName("OnlySilver.code.OnlySilver");
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	private static Class getNETHERFUSION() {
		try {
			return Class.forName("theoldone822.NetherrocksFusion.NetherrocksFusion");
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	private static Class getARSENIC() {
		try {
			return Class.forName("SimpleOres.plugins.akkamaddi.arsenic.code.ArsenicAndLace");
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	private static Class getALCHEMY() {
		try {
			return Class.forName("SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code.ClassicalAlchemyCore");
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	private static Class getCTHON() {
		try {
			return Class.forName("SimpleOres.plugins.akkamaddi.cthon.SimpleCthonCore");
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	private static Class getGLITTER() {
		try {
			return Class.forName("SimpleOres.plugins.akkamaddi.goldenglitter.code.GoldenGlitterCore");
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	private static Class getHADITE() {
		try {
			return Class.forName("SimpleOres.plugins.akkamaddi.hadite.code.HaditeCoalCore");
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	private static Class getCOBALT() {
		try {
			return Class.forName("SimpleOres.plugins.akkamaddi.simplecobalt.SimpleCobaltCore");
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	private static Class getTUNGSTEN() {
		try {
			return Class.forName("SimpleOres.plugins.akkamaddi.simpletungsten.SimpleTungstenCore");
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

	public static boolean getFusionInstalled() {
		return fusion != null;
	}

	public static boolean getSimpleInstalled() {
		return simple != null;
	}

	public static boolean getNetherInstalled() {
		return nether != null;
	}

	public static boolean getSilverInstalled() {
		return silver != null;
	}

	public static boolean getNetherFusionInstalled() {
		return netherfusion != null;
	}

	public static boolean getArsenicInstalled() {
		return arsenic != null;
	}

	public static boolean getAlchemyInstalled() {
		return alchemy != null;
	}

	public static boolean getCthonInstalled() {
		return cthon != null;
	}

	public static boolean getGlitterInstalled() {
		return glitter != null;
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
}
