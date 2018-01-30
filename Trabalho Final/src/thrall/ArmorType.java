/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thrall;

/**
 *
 * @author LuisRoberto
 */
//public enum ArmorType {
   // CLOTH("C"), PLATE("P"), LEATHER("L"), MAIL("M");
   // 
    
//}
public enum ArmorType {
	CLOTH("C"), PLATE("P"), LEATHER("L"), MAIL("M");
 
	private String armortp;
 
	private ArmorType(String a) {
		armortp = a;
	}
 
	public String getArmorType() {
		return armortp;
	}
 
}