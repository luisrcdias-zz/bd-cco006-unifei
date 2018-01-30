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
public class Worgen extends Raca {
    boolean infectado;
    boolean formahumana;
    boolean tamdentes;

    public Worgen(Classe c, Faction f) {
        super(c, f);
    }

    public boolean isInfectado() {
        return infectado;
    }

    public void setInfectado(boolean infectado) {
        this.infectado = infectado;
    }

    public boolean isFormahumana() {
        return formahumana;
    }

    public void setFormahumana(boolean formahumana) {
        this.formahumana = formahumana;
    }

    public boolean isTamdentes() {
        return tamdentes;
    }

    public void setTamdentes(boolean tamdentes) {
        this.tamdentes = tamdentes;
    }

    @Override
    public void castSkill() {
        System.out.println("For the Alliance!");
    }
    
}
