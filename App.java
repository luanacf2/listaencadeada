package unidade04.src;

public class App {   


    public static void main(String[] args) throws Exception{

        Lista l = new Lista();

        System.out.println("\n_______________________________________");
        //verificando se existe Nó na lista
        System.out.println("A Lista está vazia: " + l.vazia());          
        
        //Insere o Nó em primeira posição
        l.inserePrimeiro(1); 
        l.inserePrimeiro(22);
        l.inserePrimeiro(333); 
        l.mostrar();

        //Insere o Nó em ultima posição
        l.insereUltimo(4444);
        l.insereUltimo(55555);        
        l.insereUltimo(666666);               
        l.mostrar();

        //Remove o primeiro Nó da Lista
        l.removePrimeiro();
        l.mostrar();
        
        //Remove o ultimo Nó da Lista
        l.removeUltimo();
        l.mostrar();

        //Insere um Nó depois do indice informado
        l.insereDepois(2, 7777777);
        l.mostrar();

        //Remove um Nó em qualquer posição informada
        l.remove(1);
        l.mostrar();

        System.out.println("\n_______________________________________");
        //Verifica se existe Nó na Lista
        System.out.println("A Lista está vazia: " + l.vazia());
                        
      }
}
