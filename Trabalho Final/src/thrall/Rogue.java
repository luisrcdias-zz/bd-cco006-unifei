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
public class Rogue implements Classe{
    String weapon;
    ArmorType armor;

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setArmor(ArmorType armor) {
        this.armor = armor;
    }

    public String getWeapon() {
        return weapon;
    }

    public ArmorType getArmor() {
        return armor;
    }
    // public String castSkill(){
    //    String n= "Rogue used Sap and then ran away, typical rogue.";
    //    return n;
    // }

    @Override
    public void castSkill() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

