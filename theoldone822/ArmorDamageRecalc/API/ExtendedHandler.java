package theoldone822.ArmorDamageRecalc.API;

import cpw.mods.fml.common.Loader;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import travellersgear.api.TravellersGearAPI;

public class ExtendedHandler {
	public static int[] helmAmount;
	public static String[] helmList;

	public static int[] chestAmount;
	public static String[] chestList;

	public static int[] legsAmount;
	public static String[] legsList;

	public static int[] bootsAmount;
	public static String[] bootsList;

	public static int[] cloakAmount;
	public static String[] cloakList;

	public static int[] shoulderAmount;
	public static String[] shoulderList;

	public static int[] vambraceAmount;
	public static String[] vambraceList;

	public static boolean damagedArmor = false;
	public static float damagedArmorFactor = 1;

	public static float getExtendedArmorValue(EntityLivingBase living) {
		float i = 0;
		ItemStack[] aitemstack = living.getLastActiveItems();
		int j = aitemstack.length;
		for (int k = 0; k < j; ++k) {
			ItemStack itemstack = aitemstack[k];

			if (itemstack != null && itemstack.getItem() instanceof ItemArmor) {
				float l = ((ItemArmor) itemstack.getItem()).damageReduceAmount;
				int x = ((ItemArmor) itemstack.getItem()).armorType;
				switch (x) {
				case 0:
					if (helmList.length > 0)
						for (int m = 0; m < helmList.length; ++m) {
							if (itemstack.getItem() == (Item) Item.itemRegistry.getObject(helmList[m])) {
								int n = helmAmount[m];
								l += n;
								if (damagedArmor && damagedArmorFactor > 0 && itemstack.getItem().getMaxDamage() > 0) {
									int itd = itemstack.getItemDamage();
									int itmd = itemstack.getItem().getMaxDamage();
									float factordamagemin = l * (1 / damagedArmorFactor);
									float factordamagemax = l * ((damagedArmorFactor - 1) / damagedArmorFactor);
									float newArmorMin = l * factordamagemin;
									float newArmorMax = l * factordamagemax * ((itmd - itd) / itmd);
									l = newArmorMin + newArmorMax;
								}
							}
						}
					break;

				case 1:
					if (chestList.length > 0)
						for (int m = 0; m < chestList.length; ++m) {
							if (itemstack.getItem() == (Item) Item.itemRegistry.getObject(chestList[m])) {
								int n = chestAmount[m];
								l += n;
								if (damagedArmor && damagedArmorFactor > 0 && itemstack.getItem().getMaxDamage() > 0) {
									int itd = itemstack.getItemDamage();
									int itmd = itemstack.getItem().getMaxDamage();
									float factordamagemin = l * (1 / damagedArmorFactor);
									float factordamagemax = l * ((damagedArmorFactor - 1) / damagedArmorFactor);
									float newArmorMin = l * factordamagemin;
									float newArmorMax = l * factordamagemax * ((itmd - itd) / itmd);
									l = newArmorMin + newArmorMax;
								}

							}
						}
					break;

				case 2:
					if (legsList.length > 0)
						for (int m = 0; m < legsList.length; ++m) {
							if (itemstack.getItem() == (Item) Item.itemRegistry.getObject(legsList[m])) {
								int n = legsAmount[m];
								l += n;
								if (damagedArmor && damagedArmorFactor > 0 && itemstack.getItem().getMaxDamage() > 0) {
									int itd = itemstack.getItemDamage();
									int itmd = itemstack.getItem().getMaxDamage();
									float factordamagemin = l * (1 / damagedArmorFactor);
									float factordamagemax = l * ((damagedArmorFactor - 1) / damagedArmorFactor);
									float newArmorMin = l * factordamagemin;
									float newArmorMax = l * factordamagemax * ((itmd - itd) / itmd);
									l = newArmorMin + newArmorMax;
								}

							}
						}
					break;

				case 3:
					if (bootsList.length > 0)
						for (int m = 0; m < bootsList.length; ++m) {
							if (itemstack.getItem() == (Item) Item.itemRegistry.getObject(bootsList[m])) {
								int n = bootsAmount[m];
								l += n;
								if (damagedArmor && damagedArmorFactor > 0 && itemstack.getItem().getMaxDamage() > 0) {
									int itd = itemstack.getItemDamage();
									int itmd = itemstack.getItem().getMaxDamage();
									float factordamagemin = l * (1 / damagedArmorFactor);
									float factordamagemax = l * ((damagedArmorFactor - 1) / damagedArmorFactor);
									float newArmorMin = l * factordamagemin;
									float newArmorMax = l * factordamagemax * ((itmd - itd) / itmd);
									l = newArmorMin + newArmorMax;
								}

							}
						}
					break;


				}
				i += l;
			}
		}
		if (Loader.isModLoaded("TravellersGear") && living instanceof EntityPlayer) {
			ItemStack[] titemstack = TravellersGearAPI.getExtendedInventory((EntityPlayer) living);
			int j2 = titemstack.length - 1;
			for (int k = 0; k < j2; ++k) {
				ItemStack itemstack = titemstack[k];
				if (itemstack != null) {
					float l = 0;
					if (itemstack.getItem() instanceof IExtendedArmor) {
						l += ((IExtendedArmor) itemstack.getItem()).getDamageReduceAmount();
					}
					switch (k) {
					case 0:
						if (cloakList.length > 0)
							for (int m = 0; m < cloakList.length; ++m) {
								if (itemstack.getItem() == (Item) Item.itemRegistry.getObject(cloakList[m])) {
									int n = cloakAmount[m];
									l += n;
									if (damagedArmor && damagedArmorFactor > 0
											&& itemstack.getItem().getMaxDamage() > 0) {
										int itd = itemstack.getItemDamage();
										int itmd = itemstack.getItem().getMaxDamage();
										float factordamagemin = l * (1 / damagedArmorFactor);
										float factordamagemax = l * ((damagedArmorFactor - 1) / damagedArmorFactor);
										float newArmorMin = l * factordamagemin;
										float newArmorMax = l * factordamagemax * ((itmd - itd) / itmd);
										l = newArmorMin + newArmorMax;
									}
								}
							}
						break;
					case 1:
						if (shoulderList.length > 0)
							for (int m = 0; m < shoulderList.length; ++m) {
								if (itemstack.getItem() == (Item) Item.itemRegistry.getObject(shoulderList[m])) {
									int n = shoulderAmount[m];
									l += n;
									if (damagedArmor && damagedArmorFactor > 0
											&& itemstack.getItem().getMaxDamage() > 0) {
										int itd = itemstack.getItemDamage();
										int itmd = itemstack.getItem().getMaxDamage();
										float factordamagemin = l * (1 / damagedArmorFactor);
										float factordamagemax = l * ((damagedArmorFactor - 1) / damagedArmorFactor);
										float newArmorMin = l * factordamagemin;
										float newArmorMax = l * factordamagemax * ((itmd - itd) / itmd);
										l = newArmorMin + newArmorMax;
									}
								}
							}
						break;
					case 2:
						if (vambraceList.length > 0)
							for (int m = 0; m < vambraceList.length; ++m) {
								if (itemstack.getItem() == (Item) Item.itemRegistry.getObject(vambraceList[m])) {
									int n = vambraceAmount[m];
									l += n;
									if (damagedArmor && damagedArmorFactor > 0
											&& itemstack.getItem().getMaxDamage() > 0) {
										int itd = itemstack.getItemDamage();
										int itmd = itemstack.getItem().getMaxDamage();
										float factordamagemin = l * (1 / damagedArmorFactor);
										float factordamagemax = l * ((damagedArmorFactor - 1) / damagedArmorFactor);
										float newArmorMin = l * factordamagemin;
										float newArmorMax = l * factordamagemax * ((itmd - itd) / itmd);
										l = newArmorMin + newArmorMax;
									}
								}
							}
						break;

					}
					i += l;

				}
			}

		}

		return i;

	}

	public static float getExtendedItemArmorValue(ItemStack itemstack) {
		float i = 0;
		if (itemstack != null && itemstack.getItem() instanceof ItemArmor) {
			float l = ((ItemArmor) itemstack.getItem()).damageReduceAmount;
			int x = ((ItemArmor) itemstack.getItem()).armorType;
			switch (x) {
			case 0:
				if (helmList.length > 0)
					for (int m = 0; m < helmList.length; ++m) {
						if (itemstack.getItem() == (Item) Item.itemRegistry.getObject(helmList[m])) {
							int n = helmAmount[m];
							l += n;
							if (damagedArmor && damagedArmorFactor > 0 && itemstack.getItem().getMaxDamage() > 0) {
								int itd = itemstack.getItemDamage();
								int itmd = itemstack.getItem().getMaxDamage();
								float factordamagemin = l * (1 / damagedArmorFactor);
								float factordamagemax = l * ((damagedArmorFactor - 1) / damagedArmorFactor);
								float newArmorMin = l * factordamagemin;
								float newArmorMax = l * factordamagemax * ((itmd - itd) / itmd);
								l = newArmorMin + newArmorMax;
							}
						}
					}
				break;
			case 1:
				if (chestList.length > 0)
					for (int m = 0; m < chestList.length; ++m) {
						if (itemstack.getItem() == (Item) Item.itemRegistry.getObject(chestList[m])) {
							int n = chestAmount[m];
							l += n;
							if (damagedArmor && damagedArmorFactor > 0 && itemstack.getItem().getMaxDamage() > 0) {
								int itd = itemstack.getItemDamage();
								int itmd = itemstack.getItem().getMaxDamage();
								float factordamagemin = l * (1 / damagedArmorFactor);
								float factordamagemax = l * ((damagedArmorFactor - 1) / damagedArmorFactor);
								float newArmorMin = l * factordamagemin;
								float newArmorMax = l * factordamagemax * ((itmd - itd) / itmd);
								l = newArmorMin + newArmorMax;
							}

						}
					}
				break;
			case 2:
				if (legsList.length > 0)
					for (int m = 0; m < legsList.length; ++m) {
						if (itemstack.getItem() == (Item) Item.itemRegistry.getObject(legsList[m])) {
							int n = legsAmount[m];
							l += n;
							if (damagedArmor && damagedArmorFactor > 0 && itemstack.getItem().getMaxDamage() > 0) {
								int itd = itemstack.getItemDamage();
								int itmd = itemstack.getItem().getMaxDamage();
								float factordamagemin = l * (1 / damagedArmorFactor);
								float factordamagemax = l * ((damagedArmorFactor - 1) / damagedArmorFactor);
								float newArmorMin = l * factordamagemin;
								float newArmorMax = l * factordamagemax * ((itmd - itd) / itmd);
								l = newArmorMin + newArmorMax;
							}

						}
					}
				break;
			case 3:
				if (bootsList.length > 0)
					for (int m = 0; m < bootsList.length; ++m) {
						if (itemstack.getItem() == (Item) Item.itemRegistry.getObject(bootsList[m])) {
							int n = bootsAmount[m];
							l += n;
							if (damagedArmor && damagedArmorFactor > 0 && itemstack.getItem().getMaxDamage() > 0) {
								int itd = itemstack.getItemDamage();
								int itmd = itemstack.getItem().getMaxDamage();
								float factordamagemin = l * (1 / damagedArmorFactor);
								float factordamagemax = l * ((damagedArmorFactor - 1) / damagedArmorFactor);
								float newArmorMin = l * factordamagemin;
								float newArmorMax = l * factordamagemax * ((itmd - itd) / itmd);
								l = newArmorMin + newArmorMax;
							}

						}
					}
				break;

			}
			i += l;
		}

		return i;
	}
}
