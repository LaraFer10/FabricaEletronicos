
package fabrica;


public class Batedeira extends Liquidificador{
    private int totalHelice;

    public Batedeira(String marca, float preço, int voltagem) {
        super(marca, preço, voltagem);
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
    
}
