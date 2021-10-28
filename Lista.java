package unidade04.src;

public class Lista{

    private No inicio;
    private int tamanho;
    
    public Lista(){
        inicio = null;
        tamanho = 0;
    }
    //Verifica se a Lista está vazia
    public boolean vazia(){
        return inicio == null;
    }
    
    //Insere um Nó no inicio da Lista
    public void inserePrimeiro(int info){
        No auxiliar = new No();
        auxiliar.setInf(info);
        auxiliar.setProx(inicio);
        inicio = auxiliar;
        
    }

    //Remove o Primeiro Nó
    public No removePrimeiro(){
        if(vazia() == true){
            return null;
        }
        int info = inicio.getInf();
        inicio = inicio.getProx();
        return null;
    }

    //Insere o Nó na ultima posição da Lista
    public void insereUltimo(int info){
        if(vazia() == true){
            inserePrimeiro(info);
        }
        else{
            No auxiliar = inicio;

            while(auxiliar != null && auxiliar.getProx() != null){
                auxiliar = auxiliar.getProx();
            }

            if(auxiliar.getProx() == null){
                No novo = new No();
                novo.setInf(info);
                auxiliar.setProx(novo);
            }
        }
        
    }

    //remove o Nó que esta na ultima posição
    public No removeUltimo(){
        if(vazia()== true){
            return null;
        }
        No local = inicio;
        while(local.getProx() != null){
            No aux = local;
            local = local.getProx();
            if(local.getProx() == null){
                aux.setProx(null);            
                return null;   
            }
        }
        inicio = null;
        return null;
    }

    //Acrescenta o Nó depois do indice escolhido levando o nó atual a se tornar o Nó proximo
    public void insereDepois(int indice, int info){
        if(indice <= 0){
            inserePrimeiro(info);
        
        }else{
            No local = inicio;
            for(int i = 0; i < indice; i ++){
                
                if(local.getProx() != null){
                    local = local.getProx();
                }
            }
            No no = new No();
            no.setInf(info);
            no.setAnt(local);
            no.setProx(local.getProx());
            local.setProx(no);
            
            tamanho++;
            
        }
    }

    //Remove o Nó no indice que informar
    public void remove(int indice) {
        if(indice >= 0) {
            No local = inicio;
            for (int i = 0; i < indice; i++) {
                if (local.getProx() != null) {
                    local = local.getProx();
                }
            }
            No proximo = local.getProx();
            local.setInf(proximo.getInf());
            local.setAnt(local.getAnt());
            local.setProx(proximo.getProx());
        }
    }

    //Mostra a Lista
    public void mostrar(){
        No auxiliar = inicio;
        System.out.println("------- LISTA DUPLAMENTE ENCADEADA --------\n");
        while(auxiliar != null){            
            System.out.print(auxiliar.getInf() + "\n");
            auxiliar = auxiliar.getProx();
        }
    }
}