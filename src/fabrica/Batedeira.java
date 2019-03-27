
package fabrica;


public class Batedeira extends Produto implements Helicoidal{
    private int totalHelice;
    private int quant;

    public Batedeira(String marca, float preço, int voltagem) {
        super(marca, preço, voltagem);
    }
    public Batedeira(float preço, int voltagem) {
        super(preço, voltagem);
    }

    
    @Override
    public int Qmedia (){
        int q;
        q =(this.quant/(this.quant/1))*this.totalHelice;
        return q;
    }

  
    @Override
   public float CalcDesconto(String mes){
       float d;
        if("Dezembro".equals(mes)){
            d = (this.preço*20)/100;
            return d;
        }
        return 0;
   }
    public int getTotalHelice() {
        return totalHelice;
    }

    public void setTotalHelice(int totalHelice) {
        this.totalHelice = totalHelice;
    }
     public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
    
}
