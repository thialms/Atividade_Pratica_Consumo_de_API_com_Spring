package br.edu.fatecpg.atividadepokemon.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
