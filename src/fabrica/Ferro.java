
package fabrica;


public class Ferro extends Produto {
    
    @Override
    public String VerificaVolt(){
        if(this.voltagem != 110 && this.voltagem != 120 && this.voltagem != 5){
           return "Digite um valor de voltagem valido!";
       }else{
            return "Voltagem válida";
        }
    }
    public float CalcDesconto(String mes){
       float d;
       if ("Maio".equals(mes)){
           d = (this.preço*15)/100;
           return d;
       }
        return 0;
   }
}
