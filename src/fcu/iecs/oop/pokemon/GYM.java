package fcu.iecs.oop.pokemon;

public class GYM {
	public static Player fight(Player...players){
	PokemonType fire=PokemonType.FIRE;
	PokemonType water=PokemonType.WATER;
	PokemonType grass=PokemonType.GRASS;
	int p1=0;
	int p2=0;
	int i=0;
	int j = (int) (Math.random() * 2 + 1);
	for(i=0;i<3;i++){	
		if((players[0].getPokemons()[i].getType().equals(fire)==true)&&(players[1].getPokemons()[i].getType().equals(grass)==true)){
			p1++;
			continue;
		}
		else if((players[0].getPokemons()[i].getType().equals(grass)==true)&&(players[1].getPokemons()[i].getType().equals(fire)==true)){
			p2++;
			continue;
		}
		else if((players[0].getPokemons()[i].getType().equals(grass)==true)&&(players[1].getPokemons()[i].getType().equals(water)==true)){
			p1++;
			continue;
		}
		else if((players[0].getPokemons()[i].getType().equals(water)==true)&&(players[1].getPokemons()[i].getType().equals(grass)==true)){
			p2++;
			continue;
		}
		else if((players[0].getPokemons()[i].getType().equals(water)==true)&&(players[1].getPokemons()[i].getType().equals(fire)==true)){
			p1++;
			continue;
		}
		else if((players[0].getPokemons()[i].getType().equals(fire)==true)&&(players[1].getPokemons()[i].getType().equals(water)==true)){
			p2++;
			continue;
		}
		else {
			if(players[0].getPokemons()[i].getCp()>players[1].getPokemons()[i].getCp()){
				p1++;
				continue;
			}
			else if(players[1].getPokemons()[i].getCp()>players[0].getPokemons()[i].getCp()){
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


