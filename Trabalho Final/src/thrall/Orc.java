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
public class Orc  extends Raca{
    double Honra;
    String cor;
    String sedepoder;
    String origem;
    String clan;

    public Orc(Classe c, Faction f) {
        super(c, f);
    }

    public double getHonra() {
        return Honra;
    }

    public void setHonra(double Honra) {
        this.Honra = Honra;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSedepoder() {
        return sedepoder;
    }

    public void setSedepoder(String sedepoder) {
        this.sedepoder = sedepoder;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    @Override
    public void castSkill() {
        System.out.println("For the Horde!");
    }

}
