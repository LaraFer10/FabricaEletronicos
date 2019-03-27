
package fabrica;

public abstract class Produto {
    protected String marca;
    protected float preço;
    protected int voltagem;

   public String VerificaVolt(){
       if(this.voltagem != 110 && this.voltagem != 120){
           return "Digite um valor de voltagem valido!";
       }else{
           return "Voltagem válida!";
       }
        
   }
    public Produto(String marca, float preço, int voltagem){
       this.marca = marca;
       this.preço = preço;
       this.voltagem = voltagem;
       
   }
   public Produto(float preço, int voltagem){
       this.preço = preço;
       this.voltagem = voltagem;
   }
   public abstract float CalcDesconto (String mes);
   
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }

   
    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    
}
