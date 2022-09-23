import java.util.ArrayList;
import java.util.List;

public class Main {

    // deze tekst heb ik toegevoegd omdat er een verschil moet zijn tussen de branch Main en de branch Uitwerkingen.
    public static void main(String[] args) {

        System.out.println();

        Pokemon pikachu = new Pikachu();
        Pokemon squirtle = new WaterType();
        Pokemon waterPokemon = new WaterType("Squirtle");
        Pokemon doubleType = new Gyarados();
        Pokemon firePokemon = new FireType("Charmander");
        Pokemon grassPokemon = new GrassType("Bulbasaur");

        List<Pokemon> pokemonList = new ArrayList<>();
        pokemonList.add(pikachu);
        pokemonList.add(squirtle);
        pokemonList.add(waterPokemon);
        pokemonList.add(doubleType);
        pokemonList.add(firePokemon);
        pokemonList.add(grassPokemon);

        for (Pokemon pokemon : pokemonList) {
            System.out.println("My name is \"" + pokemon.getName() + "\"");
            System.out.println("I am a " + pokemon.getType() + " Pokemon");
            pokemon.eats();
            pokemon.speaks();
            System.out.println();
        }

        Flying gyarados = (Gyarados)doubleType;
        gyarados.fly();
    }
}
