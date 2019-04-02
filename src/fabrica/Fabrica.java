
package fabrica;

import java.util.ArrayList;
import java.util.Scanner;




public class Fabrica {

    public static void main(String[] args) {
       Liquidificador l = new Liquidificador("Phillips", 50, 120);
       Tampa tampa = new Tampa();
       Ferro f = new Ferro("Blue", 60, 5);
       Batedeira b = new Batedeira("Tramontina", 100, 120);
       l.setTampa(tampa);
       l.getTampa().setCor("rosa");
       Scanner input = new Scanner(System.in);
       
        System.out.println("Produtos cadastrados[1]\nCAdastrar produtos[2]");
        int n;
        n = input.nextInt();
        
        
        if (n==1){
            System.out.println("Liquidificadores:\n[1]"+l.getMarca()+"\nPreço: "+l.getPreço()+"\nVolt: "+l.getVoltagem());
            System.out.println("Liquidificadores:\n[1]"+f.getMarca()+"\nPreço: "+f.getPreço()+"\nVolt: "+f.getVoltagem());
            System.out.println("Liquidificadores:\n[1]"+b.getMarca()+"\nPreço: "+b.getPreço()+"\nVolt: "+b.getVoltagem());
        }
        /*if (n==2){
            ArrayList<Liquidificador> l2  = new ArrayList();
            ArrayList<Tampa> t2  = new ArrayList();
            ArrayList<Ferro> f2  = new ArrayList();
            ArrayList<Batedeira> b2  = new ArrayList();
            int cont =0;
            int i = 0;
            while (cont ==0){
                System.out.println("Digite marca do produto: ");
                String m = input.next();
                l2.get(i).setMarca(m);
                System.out.println("Digite Preço: ");
                int p = input.nextInt();
                l2.get(i).setPreço(p);
                System.out.println("Digite voltagem: ");
                int v = input.nextInt();
                l2.get(i).setVoltagem(v);
                System.out.println("Cor da tampa: ");
                String t = input.next();
                t2.get(i).setCor(t);
                
                i++;
            }
        }*/
    }
}
