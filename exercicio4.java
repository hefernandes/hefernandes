import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        String [] Codigo = {"produto1","produto2","produto3"};
        String [] Produto = {"arroz","feijao","tomate"};
        double[] preco = {10.99,14,49,9,99};
        int[] quantidade ={2,1,5};
        for(int i=0;i<=Codigo.length;i++)
        {       
            System.out.println(Codigo[i]);
            System.out.println(Produto[i]);
            System.out.println(preco[i]);
            System.out.println(quantidade[i]);
        }
                
            
        }
        
    }

