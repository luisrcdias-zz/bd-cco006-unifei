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
public class Troll extends Raca {
    String honor;
    String dentes;
    String corpele;
    String tribo;

    public Troll(Classe c, Faction f) {
        super(c, f);
    }

    public String getHonor() {
        return honor;
    }

    public void setHonor(String honor) {
        this.honor = honor;
    }

    public String getDentes() {
        return dentes;
    }

    public void setDentes(String dentes) {
        this.dentes = dentes;
    }

    public String getCorpele() {
        return corpele;
    }

    public void setCorpele(String corpele) {
        this.corpele = corpele;
    }

    public String getTribo() {
        return tribo;
    }

    public void setTribo(String tribo) {
        this.tribo = tribo;
    }

    @Override
    public void castSkill() {
        System.out.println("For the Horde!");
    }
    
}
