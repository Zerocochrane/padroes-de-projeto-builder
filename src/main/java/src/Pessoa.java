package src;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private int dia;
    private int mes;
    private int ano;
    private Endereco endereco;
    private List telefones = new ArrayList();

    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAno() {
        return ano;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public List getTelefones() {
        return telefones;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setTelefones(List telefones) {
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return "src.Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                ", endereco=" + endereco +
                ", telefones=" + telefones +
                '}';
    }
}