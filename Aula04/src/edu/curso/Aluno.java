package edu.curso;

public class Aluno extends Pessoa{
    String ra;
    Carteirinha carteirinha = new Carteirinha();

    public Aluno(String ra, String nome) {
        super();
        System.out.println("Instanciano Aluno ....");
        this.ra = ra;
        this.nome = nome;
    }

    public Aluno(String nome){
        this("0000", nome);
    }
}