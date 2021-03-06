package br.com.stream;

import java.util.Arrays;
import java.util.List;

public class ListTop {

    public static void main(String[] args) {
        List<Pessoa> listaPessoas = Arrays.asList(
                new Pessoa("Joao", 32),
                new Pessoa("Antonio", 20),
                new Pessoa("Maria", 18),
                new Pessoa("Gustavo", 18),
                new Pessoa("Angela", 30)
        );
        listaPessoas.stream().forEach(p -> System.out.println(p.getNome()));

        List<Integer> listaInteger = Arrays.asList(1, 2, 3);
        listaInteger.stream().forEach(l -> System.out.println(l));
    }
}
