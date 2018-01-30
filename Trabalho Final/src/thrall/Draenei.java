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
public class Draenei extends Raca {
    String origem;
    double tamrabo, numtentaculos, tamorelhas;

    public Draenei(Classe c, Faction f) {
        super(c, f);
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public double getTamrabo() {
        return tamrabo;
    }

    public void setTamrabo(double tamrabo) {
        this.tamrabo = tamrabo;
    }

    public double getNumtentaculos() {
        return numtentaculos;
    }

    public void setNumtentaculos(double numtentaculos) {
        this.numtentaculos = numtentaculos;
    }

    public double getTamorelhas() {
        return tamorelhas;
    }

    public void setTamorelhas(double tamorelhas) {
        this.tamorelhas = tamorelhas;
    }

    @Override
    public void castSkill() {
        System.out.println("For the Alliance!");
    }
    
    
}
