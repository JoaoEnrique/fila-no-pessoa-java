<!-- ![image](https://github.com/JoaoEnrique13/FilaPessoaJava/assets/99426704/8ad0c5eb-1334-4580-b677-710c94d895ae)

-->

# Saida
```java
Fila vazia: true

Nome: Joao - Idade: 18
Nome: Enrique - Idade: 17
Nome: Amanda - Idade: 15
Nome: Adelson - Idade: 52

Removido: Nome: Joao - Idade: 18

Nome: Enrique - Idade: 17
Nome: Amanda - Idade: 15
Nome: Adelson - Idade: 52
Nome: Enrique - Idade: 17
Nome: Amanda - Idade: 15
Nome: Adelson - Idade: 52
Nome: Elaine Idade: 51

Tamanho da fila: 4
```

# Classe Fila
```java
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
```

# Classe Pessoa
```java
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
```




# Classe Principal
```java
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
