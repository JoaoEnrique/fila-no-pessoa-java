/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package padrao;

/**
 * 17/03/2024
 * @author João Enrique barbosa Santos Alves
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // 3.1) Instanciar 5 objetos da classe Pessoa
        Pessoa joao = new Pessoa("Joao", 18);
        Pessoa enrique = new Pessoa("Enrique", 17);
        Pessoa amanda = new Pessoa("Amanda", 15);
        Pessoa adelson = new Pessoa("Adelson", 52);
        Pessoa elaine = new Pessoa("Elaine", 51);
        
        Fila fila = new Fila();//3.2) Criar uma fila vazia
        
        // 3.3) Testar se a fila está vazia
        System.out.println("Fila vazia: " + fila.isEmpty());
        System.out.println();
        
        // 3.4) Enfileirar 4 objetos da classe Pessoa
        fila.enqueue(joao);
        fila.enqueue(enrique);
        fila.enqueue(amanda);
        fila.enqueue(adelson);
        
        // 3.5) Imprimir a Fila
        fila.emprime();
        
        //3.6) Desenfileirar, ou seja, remover o primeiro elemento da fila, retornando-o.
        System.out.println("Removido: " + fila.denqueue());
        System.out.println();
        
        //3.7) Imprimir a Fila
        fila.emprime();
        
        //3.8) Enfileirar mais um objeto da classe Pessoa.
        fila.enqueue(elaine);
        
        //3.9) Imprimir a Fila
        fila.emprime();
        
        /*
        3.10) Qual é o tamanho da fila? 
        a) Na classe Fila, crie o método com a seguinte assinatura: public int tamanho() e escreva o algoritmo para retornar o tamanho. 
        b) Na classe Principal, chame o método da seguinte forma:
        */
        
        System.out.println("Tamanho da fila: " + fila.tamanho());

    }
    
}
