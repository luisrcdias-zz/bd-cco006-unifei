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
public class Tauren extends Raca {
    String honra;
    String forcaesp;
    String clan;
    String chifres;

    public Tauren(Classe c, Faction f) {
        super(c, f);
    }

    public String getHonra() {
        return honra;
    }

    public void setHonra(String honra) {
        this.honra = honra;
    }

    public String getForcaesp() {
        return forcaesp;
    }

    public void setForcaesp(String forcaesp) {
        this.forcaesp = forcaesp;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public String getChifres() {
        return chifres;
    }

    public void setChifres(String chifres) {
        this.chifres = chifres;
    }

    @Override
    public void castSkill() {
        System.out.println("For the Horde!");
    }
    
}
