/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padrao;

/**
 * 17/03/2024
 * @author João Enrique barbosa Santos Alves
 */
public class Fila {
    //Classe No interna
    private class No{
        Object item;
        No prox;
    }

    private No incio;
    private No fim;
    private int size;
    
    //Construtor
    public Fila(){
        this.incio = new No();
        this.fim = this.incio;
        this.incio.prox = null;
    }
    
    // Enfileirar
    public void enqueue(Pessoa valor){
        this.fim.prox = new No();
        this.fim = this.fim.prox;
        this.fim.item = valor;
        this.fim.prox = null;
        size++;
    }
    
    // Desinfileirar
    public Pessoa denqueue() throws Exception{
        Pessoa valor = null;
        if(this.isEmpty())
            throw new Exception("Erro a fila está vazia");
        
        this.incio = this.incio.prox;
        valor = (Pessoa) this.incio.item;
        size--;
        
        return valor;
    }
    
    // verificar se fila é vazia
    public boolean isEmpty(){
        return (this.incio == this.fim);
    }
    
    // imprime fila
    public void emprime(){
        No aux;
        aux = this.incio.prox;
        
        while(aux != null){
            System.out.println(aux.item.toString());
            aux = aux.prox;
        }
        System.out.println("");
    }
    
    public int tamanho(){
        return this.size;
    }
}
