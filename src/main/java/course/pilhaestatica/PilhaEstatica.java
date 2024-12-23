package course.pilhaestatica;

import java.awt.BorderLayout;

public class PilhaEstatica {

    public static void main(String[] args) {
        Pilha p = new Pilha(3);
       
        p.push(1);
        p.push(2);
        p.push(3);
        
        
        System.out.printf("valor removido %d\n", p.pop());
        System.out.printf("valor removido %d\n",p.pop());
        
        
        System.out.println(p.isFull() ? "sim": "nao"); 
     
    }
}
