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
public class Human extends Raca {
    String corpele;
    String cabelo;
    String fe;

    public Human(Classe c, Faction f) {
        super(c, f);
    }

    public String getCorpele() {
        return corpele;
    }

    public void setCorpele(String corpele) {
        this.corpele = corpele;
    }

    public String getCabelo() {
        return cabelo;
    }

    public void setCabelo(String cabelo) {
        this.cabelo = cabelo;
    }

    public String getFe() {
        return fe;
    }

    public void setFe(String fe) {
        this.fe = fe;
    }

    @Override
    public void castSkill() {
        System.out.println("For the Alliance!");
    }
    
}
