
package fabrica;


public class Liquidificador extends Produto {
    private Tampa tampa;
    int quant;
    
    
    public float CalcDesconto(String mes){
       float d;
       if("Agosto".equals(mes)){
          d = (this.preço*10)/100;
            return d;
        }
        return 0;
   }
    public Liquidificador(String marca, float preço, int voltagem){
       this.marca = marca;
       this.preço = preço;
       this.voltagem = voltagem;
       
   }
   public Liquidificador(float preço, int voltagem){
       this.preço = preço;
       this.voltagem = voltagem;
   }
    
    public int Qmedia (){
        int q;
        q = this.quant/(this.quant/1);
        return q;
    }
    public Tampa getTampa() {
        return tampa;
    }

    public void setTampa(Tampa tampa) {
        this.tampa = tampa;
    }

    /**
     * @return the quant
     */
    public int getQuant() {
        return quant;
    }

    /**
     * @param quant the quant to set
     */
    public void setQuant(int quant) {
        this.quant = quant;
    }
   
}
