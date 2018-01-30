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
abstract class Raca implements Classe {
    String origem;
Classe classe;
Faction faction;
    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public Raca(Classe c, Faction f){
        this.classe=c;
        this.faction=f;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Faction getFaction() {
        return faction;
    }

    public void setFaction(Faction faction) {
        this.faction = faction;
    }
    
    public void Toon(String classe, String faction){
            System.out.println("A " +classe+ " from the mighty " +faction+ " from the lands of " +origem);
    }
}
