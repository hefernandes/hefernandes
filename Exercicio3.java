public class App {
    public static void main(String[] args) throws Exception {
    double empresax,empresaxlucro,empresay,empresaylucro;
    int ano=21;
    empresax =1.13;
    empresay =18.4;

    for  (int i = 0; empresax < empresay; i++)
    {

      ano = ano + i;
      empresaxlucro= (empresax/100)*134;
      empresax =  empresaxlucro+empresax;
      empresaylucro= (empresay/100)*34;
      empresay =  empresaylucro+empresay;
      empresax = Math.round(empresax * 100);
      empresax = empresax/100;
      empresay= Math.round(empresay * 100);
      empresay = empresay/100;
      System.out.println(empresax);
    }
    System.out.println("01/01/"+ano+"- Valor da empresa:"+empresax+"m" );
    System.out.println("01/01/"+ano+"- Valor da empresa:"+empresay+"m" );

    
    }
}
