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
public class Gnome extends Raca {
    String infectado, bigode, fe;

    public Gnome(Classe c, Faction f) {
        super(c, f);
    }

    public String getInfectado() {
        return infectado;
    }

    public void setInfectado(String infectado) {
        this.infectado = infectado;
    }

    public String getBigode() {
        return bigode;
    }

    public void setBigode(String bigode) {
        this.bigode = bigode;
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
