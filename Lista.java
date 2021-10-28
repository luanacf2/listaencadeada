package unidade04.src;

public class Lista{

    private No inicio;
    
    public Lista(){
        inicio = null;
    }
    
    public boolean vazia(){
        return inicio == null;
    }
    
    public void inserePrimeiro(int info){
        No auxiliar = new No();
        auxiliar.setInf(info);
        auxiliar.setProx(inicio);
        inicio = auxiliar;
        
    }

    public void insereDepois(int indice, int info){
        if(indice <= 0){
            inserePrimeiro(info);
        }else{
            No local = inicio;
            for(int i = 0; i <= indice -1; i ++){
                local = local.getProx();
            }
            No no = new No();
            no.setInf(info);
            local.setProx(no);
            
        }
    }
    
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

    public No removePrimeiro(){
        if(vazia() == true){
            return null;
        }
        int info = inicio.getInf();
        inicio = inicio.getProx();
        return null;
    }

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

    /*public No remove(int no){
        if(no < 0 || no >= tamanho || inicio == null ){

        }
    }*/


    public void mostrar(){
        No auxiliar = inicio;
        System.out.println("------ LISTA --------\n");
        while(auxiliar != null){
            
            System.out.print(auxiliar.getInf() + "\n");
            auxiliar = auxiliar.getProx();
        }
    }
}
