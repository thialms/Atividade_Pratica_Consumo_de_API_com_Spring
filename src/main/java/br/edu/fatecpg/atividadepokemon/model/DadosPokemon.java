package br.edu.fatecpg.atividadepokemon.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosPokemon(
        @JsonAlias("name") String nome,
        @JsonAlias("height") Double altura,
        @JsonAlias("weight") Double peso
) {
}
