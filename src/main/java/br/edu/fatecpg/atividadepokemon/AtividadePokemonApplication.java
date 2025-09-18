package br.edu.fatecpg.atividadepokemon;

import br.edu.fatecpg.atividadepokemon.client.ConsomeAPI;
import br.edu.fatecpg.atividadepokemon.model.DadosPokemon;
import br.edu.fatecpg.atividadepokemon.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AtividadePokemonApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AtividadePokemonApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o pokemon: ");
        String pokemon = sc.nextLine().toLowerCase();

        String url = "https://pokeapi.co/api/v2/pokemon/" + pokemon;

        ConsomeAPI api = new ConsomeAPI();
        String json = api.obterDados(url);

        ConverteDados converteDados = new ConverteDados();
        DadosPokemon dadosPokemon = converteDados.obterDados(json, DadosPokemon.class);

        System.out.println("Nome: " + dadosPokemon.nome());
        System.out.println("Altura: " + dadosPokemon.altura());
        System.out.println("Peso: " + dadosPokemon.peso());

        sc.close();
    }
}
