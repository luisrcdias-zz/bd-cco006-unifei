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
public class Dwarf  extends Raca{
    int tamanho;
    boolean barba;
    String corcabelo;
    String clan;

    public Dwarf(Classe c, Faction f) {
        super(c, f);
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isBarba() {
        return barba;
    }

    public void setBarba(boolean barba) {
        this.barba = barba;
    }

    public String getCorcabelo() {
        return corcabelo;
    }

    public void setCorcabelo(String corcabelo) {
        this.corcabelo = corcabelo;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    @Override
    public void castSkill() {
        System.out.println("For the Alliance!");
    }
    
}
