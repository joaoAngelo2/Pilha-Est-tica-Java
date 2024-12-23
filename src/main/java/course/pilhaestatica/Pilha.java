package course.pilhaestatica;

public class Pilha {
    
    private int tam;
    private int topo;
    private int[] valores;
    
    public Pilha(int tam){
        this.tam = tam;
        topo = -1;
        valores = new int[tam];
    }
    
    public boolean isFull(){
        return (topo == tam - 1);
    }
    public boolean isEmpty(){
        return (topo == -1);
    }
    
    public void push(int valor){
        if(!isFull())
        valores[++topo] = valor;
        else
        System.out.println("pilha cheia");
    }
    public int pop(){
        if(!isEmpty())
        return valores[topo--];
        else
        return -1;
    }
    
    
}
