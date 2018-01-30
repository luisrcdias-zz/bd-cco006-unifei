/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thrall;

import java.util.Set;

/**
 *
 * @author LuisRoberto
 */
public class Thrall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Raca orc;
  Warrior du = new Warrior();
  Faction horde = new Horde();
  Faction alliance = new Alliance();
  Orc durotan = new Orc(du,horde);
  du.setWeapon("Doomhammer");
  System.out.println("\n Durotan conhece uma jovem orc chamada Draka na antiga Draenor.");
  Mundo draenor = new Mundo();
  draenor.setNomeMundo("Draenor");
  draenor.setDestruidoElementos(true);
  Shaman draka = new Shaman();
  Orc d = new Orc(draka,horde);
         
  System.out.println("\n Juntos os dois tem um filho. Thrall.");
  Shaman t = new Shaman();
  Orc thrall = new Orc(t,horde);
  thrall.setHonra(1000);
  System.out.println("\n Durotan e seu filho entram no Dark Portal rumo à Eastern Kingdoms em Azeroth");
  Continente easternkingdoms = new Continente();
  easternkingdoms.setClimaDominante("Tropical");
  Mundo azeroth = new Mundo();
  azeroth.setNomeMundo("Azeroth");
  azeroth.setDestruidoElementos(false);
  System.out.println("\n Após incessantes batalhas, Thrall é capturado como escravo por humanos da Aliança de Lordaeron.");
  Raca human; 
  Cidade lordaeron;
  
  alliance.setLeader("Anduin Lothar");
  Paladin and = new Paladin();
  Human anduinlothar = new Human(and,alliance);
  System.out.println("\n Com a ajuda de Taretha, Thrall consegue escapar do acampamento e segue sua jornada para unificar a Horda em Azeroth no continente de Kalimdor.");
  Mage ta = new Mage();
  Human taretha = new Human(ta, alliance);  
  Continente kalimdor = new Continente();
  
  System.out.println("\n Ao chegar em kalimdor, Thrall se alia com os renegados Trolls das Echo Isles, e cria uma cidade em Durotar, Orgrimmar, ambas em homenagem à seu pai e seu mentor, Durotan e Orgrim Doomhammer.");
  Shaman org = new Shaman();  
  
  Orc orgrim = new Orc(org, horde);
  orgrim.setClan("Doomhammer");
  orgrim.setClasse(org);
          
  Cidade orgrimmar;    
    }
    
}
