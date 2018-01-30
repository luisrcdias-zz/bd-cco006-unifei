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
public class Forsaken  extends Raca{
    boolean mandibula;
    String ress;
    String corpele;

    public Forsaken(Classe c, Faction f) {
        super(c, f);
    }

    public boolean isMandibula() {
        return mandibula;
    }

    public void setMandibula(boolean mandibula) {
        this.mandibula = mandibula;
    }

    public String getRess() {
        return ress;
    }

    public void setRess(String ress) {
        this.ress = ress;
    }

    public String getCorpele() {
        return corpele;
    }

    public void setCorpele(String corpele) {
        this.corpele = corpele;
    }

    @Override
    public void castSkill() {
        System.out.println("For the Horde!");
    }
}
