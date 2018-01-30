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
public class Goblin extends Raca {
    int ganancia;
    boolean mercenario;
    String orelha;

    public Goblin(Classe c, Faction f) {
        super(c, f);
    }

    public int getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }

    public boolean isMercenario() {
        return mercenario;
    }

    public void setMercenario(boolean mercenario) {
        this.mercenario = mercenario;
    }

    public String getOrelha() {
        return orelha;
    }

    public void setOrelha(String orelha) {
        this.orelha = orelha;
    }

    @Override
    public void castSkill() {
        System.out.println("For the Horde!");
    }
}
