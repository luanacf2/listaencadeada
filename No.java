package unidade04.src;

public class No {
     private int informacao;
     private No anterior, proximo;
 
     public No(){
         informacao = 0;
         proximo = null; //proximo e anterior servem para receber o endereço dos outros objetos//
         anterior = null; //proximo e anterior servem para receber o endereço dos outros objetos//
     }
     
     //Getter e setter
     public int getInf() {
         return informacao;
     }

     public No getAnt() {
          return anterior;
     }
 
     public No getProx() {
          return proximo;
     }
     
     public void setInf(int informacao) {
          this.informacao = informacao;
      }

     public void setAnt(No anterior) {
         this.anterior = anterior;
     }
     
     public void setProx(No proximo) {
         this.proximo = proximo;
     }   
      
}
 