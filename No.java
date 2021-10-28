package unidade04.src;

public class No {
     private int informacao;
     private No anterior, proximo;
 
     public No(){
         informacao = 0;
         proximo = null;
         anterior = null;
     }
 
     public No(int informacao, No anterior, No proximo) {
         this.informacao = informacao;
         this.anterior = anterior;
         this.proximo = proximo;
     }
 
     public int getInf() {
         return informacao;
     }
 
     public void setInf(int informacao) {
         this.informacao = informacao;
     }
 
     public No getAnt() {
         return anterior;
     }
 
     public void setAnt(No anterior) {
         this.anterior = anterior;
     }
 
     public No getProx() {
         return proximo;
     }
 
     public void setProx(No proximo) {
         this.proximo = proximo;
     }   
 
}
 