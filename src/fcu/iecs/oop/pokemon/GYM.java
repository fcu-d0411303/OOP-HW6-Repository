package fcu.iecs.oop.pokemon;

public class GYM {
	public static Player fight(Player...players){
	int p1=0;
	int p2=0;
	int i=0;
	int j = (int) (Math.random() * 2 + 1);
	for(i=0;i<3;i++){	
		if(players[0].getPokemons()[i].getType().equals("FIRE")&&players[1].getPokemons()[i].getType().equals("GRASS")){
			p1++;
			continue;
		}
		else if(players[0].getPokemons()[i].getType().equals("GRASS")&&players[1].getPokemons()[i].getType().equals("FIRE")){
			p2++;
			continue;
		}
		else if(players[0].getPokemons()[i].getType().equals("GRASS")&&players[1].getPokemons()[i].getType().equals("WATER")){
			p1++;
			continue;
		}
		else if(players[0].getPokemons()[i].getType().equals("WATER")&&players[1].getPokemons()[i].getType().equals("GRASS")){
			p2++;
			continue;
		}
		else if(players[0].getPokemons()[i].getType().equals("WATER")&&players[1].getPokemons()[i].getType().equals("FIRE")){
			p1++;
			continue;
		}
		else if(players[0].getPokemons()[i].getType().equals("FIRE")&&players[1].getPokemons()[i].getType().equals("WATER")){
			p2++;
			continue;
		}
		else {
			if(players[0].getPokemons()[i].getCp()>players[1].getPokemons()[i].getCp()){
				p1++;
				continue;
			}
			else if(players[0].getPokemons()[i].getCp()>players[1].getPokemons()[i].getCp()){
				p2++;
				continue;
			}
			else {
				
				if(j==1){
					p1++;
					continue;
				}
				else{
					p2++;
					continue;
				}
			}
		}
	}
	if(p2>p1){
		players[1].setLevel(players[1].getLevel()+1);
		System.out.println("Winner is "+players[1].getPlayerName()+", and his/her level becomes "+players[1].getLevel());
		return players[1];
	}
	else{
		players[0].setLevel(players[0].getLevel()+1);
		System.out.println("Winner is "+players[0].getPlayerName()+", and his/her level becomes "+players[0].getLevel());
		return players[0];
	}
	
	}
}


