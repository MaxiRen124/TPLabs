package mypackage;
public class MaClass{ 
  
  static Player[] players = new Player[12];
	
  public static void main(String[] args) {
	  
  
  players[0] = new Player("s1mple", "Alexander Kostylev", "Navi", "Ukraine",25);
  players[1] = new Player("Jame","Jami Ali","Virtus.pro","Russia",24);
  players[2] = new Player("sh1ro","Dmitry Sokolov","Cloud9","Russia",21);
  players[3] = new Player("ZywOo","Mathieu Herbot","Vitality","France",22);
  players[4] = new Player("jks","Justin Savage","G2","Australia",27);
  players[5] = new Player("perfecto","Ilya Zalutsky","Navi","Russia",23);
  players[6] = new Player("cadiaN","Kasper Meller","Heroic","Denmark",27);
  players[7] = new Player("twistzz","Russell Van Dyken","Faze","Canada",23);
  players[8] = new Player("device","Nikolai Ritz","Astralis","Denmark",27);
  players[9] = new Player("m0NESY","Ilya Osipov","G2","Russia",17);
  players[10] = new Player("Patsi","Robert Isyanov","Team Spirit","Russia",19);
  players[11] = new Player("carrigan","Finn Andersen","Faze","Denmark",32);
  
  //Сортировка по возрасту игроков
  for (int i=0; i < players.length;i++) {
	    int j_max = i;
	    for(int j= i+1; j < players.length; j++) {
	      if (players[j_max].age < players[j].age) {
	        j_max = j;
	      }
	    }
	    Player temp = players[i];
	    players[i] = players[j_max];
	    players[j_max] = temp;
	  }

  for (int i = 0; i<12;i++) {
      System.out.println(players[i].nick + "   " + players[i].name + "   " + players[i].team + "   " + players[i].country + " " + players[i].age);
    }  
   } 
  }

class Player{
  String nick,name,team,country;
  Integer age;
  
  public Player (String nick,String name,String team,String country, Integer age) {
    this.nick = nick;
    this.name = name;
    this.team = team;
    this.country = country;
    this.age = age;
  }
} 