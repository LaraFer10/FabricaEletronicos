
package fabrica;


public class Liquidificador extends Produto implements Helicoidal{
    private Tampa tampa;
    int quant;

    public Liquidificador(String marca, float preço, int voltagem) {
        super(marca, preço, voltagem);
    }
    public Liquidificador(float preço, int voltagem) {
        super( preço, voltagem);
    }
    
    @Override
    public float CalcDesconto(String mes){
       float d;
       if("Agosto".equals(mes)){
          d = (this.preço*10)/100;
            return d;
        }
        return 0;
   }
    
    
    @Override
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

    
    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
   
}
