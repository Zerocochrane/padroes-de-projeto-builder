package src;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = PessoaBuilder.builder()
                .addNome("Alice", "dos Santos")
                .addDtNascimento(22, 5, 1980)
                .addLogradouro("Rua das Oliveiras")
                .addNumero("272")
                .addComplemento("Bloco B")
                .addBairro("Centro")
                .addCidade("Porto Alegre")
                .addPais("Brasil")
                .addFone(51, 32221236)
                .addFone(51, 99623632)
                .get();

        System.out.println(pessoa.toString());
    }
}