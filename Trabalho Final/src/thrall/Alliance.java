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
public class Alliance extends Faction{
    String rei="Varian Wrynn", cap="Stormwind";

    public String getRei() {
        return rei;
    }

    public String getCap() {
        return cap;
    }

    public void setRei(String rei) {
        this.rei = rei;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }
    
}
