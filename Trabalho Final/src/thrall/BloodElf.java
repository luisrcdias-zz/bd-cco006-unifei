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
public class BloodElf extends Raca {
    String acessorio;
    String tamorelha;
    double sedepoder;

    public BloodElf(Classe c, Faction f) {
        super(c, f);
    }

    public void setAcessorio(String acessorio) {
        this.acessorio = acessorio;
    }

    public void setTamorelha(String tamorelha) {
        this.tamorelha = tamorelha;
    }

    public void setSedepoder(double sedepoder) {
        this.sedepoder = sedepoder;
    }

    public String getAcessorio() {
        return acessorio;
    }

    public String getTamorelha() {
        return tamorelha;
    }

    public double getSedepoder() {
        return sedepoder;
    }

    @Override
    public void castSkill() {
        System.out.println("For the Horde!");
    }
}
