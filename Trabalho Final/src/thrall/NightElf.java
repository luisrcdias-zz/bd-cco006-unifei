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
public class NightElf extends Raca {
    boolean imortal;
    String corpele;
    double tamorelhas;

    public NightElf(Classe c, Faction f) {
        super(c, f);
    }

    public boolean isImortal() {
        return imortal;
    }

    public void setImortal(boolean imortal) {
        this.imortal = imortal;
    }

    public String getCorpele() {
        return corpele;
    }

    public void setCorpele(String corpele) {
        this.corpele = corpele;
    }

    public double getTamorelhas() {
        return tamorelhas;
    }

    public void setTamorelhas(double tamorelhas) {
        this.tamorelhas = tamorelhas;
    }

    @Override
    public void castSkill() {
        System.out.println("For the Alliance!");
    }
}
