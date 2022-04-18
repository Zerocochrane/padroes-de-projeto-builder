package tests;

import src.Pessoa;
import src.PessoaBuilder;

import static org.junit.jupiter.api.Assertions.*;

class PessoaBuilderTest {

    @org.junit.jupiter.api.Test
    void builder() {
        Pessoa pessoa = PessoaBuilder.builder()
                .addNome("Paulo", "Neto")
                .addDtNascimento(22, 5, 1980)
                .addLogradouro("Rua Aqui")
                .addNumero("420")
                .addComplemento("Casa")
                .addBairro("Centro")
                .addCidade("Rio de Janeiro")
                .addPais("Brasil")
                .addFone(21, 32221236)
                .addFone(21, 99623632)
                .get();
        assertEquals(pessoa.getNome(), "Paulo");
        assertEquals(pessoa.getEndereco().getPais(), "Brasil");
    }
}