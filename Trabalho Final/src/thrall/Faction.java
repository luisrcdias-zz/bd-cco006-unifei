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
abstract class Faction {
    boolean atwar;
    String repraca, leader, capital;

    public boolean isAtwar() {
        return atwar;
    }

    public void setAtwar(boolean atwar) {
        this.atwar = atwar;
    }

    public String getRepraca() {
        return repraca;
    }

    public void setRepraca(String repraca) {
        this.repraca = repraca;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
