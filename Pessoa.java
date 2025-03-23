package atividade;

public class Pessoa {
    //características 
    private int idade;
    private String nome;
    private String email;
        
    //métodos construtores

    public Pessoa() {
        this.nome = "";
        this.idade = 0;
        this.email = "";

    } //construtor padrão

    public Pessoa(int idade, String nome, String email) {
        this.idade = idade;
        this.setNome(nome);
        this.setEmail(email);
    }

    //métodos e funcionalidades
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }
         
}