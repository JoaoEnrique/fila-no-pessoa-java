/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padrao;

/**
 * 17/03/2024
 * @author João Enrique barbosa Santos Alves
 */
public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    
    public String toString(){
        return "Nome: " + this.nome + " - Idade: " + this.idade;
    }
}
