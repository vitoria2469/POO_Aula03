package edu.curso;

public class Escola {
    public static void main (String[] args){

        Aluno a1 = new Aluno("0001", "Maria Silva");
        Aluno a2 = new Aluno("Thiago");

        Carteirinha c1 = new Carteirinha();
        a1.carteirinha = c1;
        a2.carteirinha = c1;
    }
}