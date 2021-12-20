import java.util.Scanner;



public class App {

  
    public static void main(String[] args) throws Exception {
        
      int Array[] = {1,2,3,4,5};
      for(int i=0;i<Array.length;i++)
      {
          System.out.println(Array[i]);
      }
    
        int exercicio;

        System.out.println("insira o nome do exercicio");
        Scanner numeroexercicio= new Scanner(System.in);
        exercicio = numeroexercicio.nextInt();


        switch (exercicio) {
            case 1:
              exercicio1();
              break;
            case 2:
              exercicio2();
              break;
            case 3:
              exercicio3();
              break;
            case 4:
              exercicio4();
              break;
            case 5:
              exercicio5();
            break;
        }
        }
       public static void exercicio1 ()
       {
        int numero,Resultado= 0;

        Scanner numeropedido= new Scanner(System.in);
        System.out.print("Digite o numero ");
        numero = numeropedido.nextInt();
        for (int i = 0; i < numero; i++) {
            if(i %2 == 0)
        {
            Resultado = Resultado + 1;
        }
          }
          System.out.println("quantidade de pares é "+Resultado);
        }
        public static void exercicio2()
       {

        int numero,Resultado= 0,valores, contador=0;
        Scanner numeromultiplos= new Scanner(System.in);
        System.out.print("Digite  o numero de multiplos");
        numero = numeromultiplos.nextInt();
        System.out.print("Digite os valores");
        Scanner valoresn= new Scanner(System.in);
        valores= valoresn.nextInt();
        for (int i = 0; i < valores; i++) {
            if(i %valores == 0)
        {
          contador = contador++;
          if(contador == 3)
          {
            Resultado = i;
            System.out.print(+Resultado+",");
          }
          else
          {

          } 
        } 
      }       
        }
        public static void exercicio3()
        {
          int numero;
          int resultado=1;
          Scanner numeropedido= new Scanner(System.in);
          System.out.print("Digite o numero ");
          numero = numeropedido.nextInt();
          for (int i = 2; i <= numero / 2; i++)
          if(numero % i == 0){
          
            resultado++;
          }
          if (resultado ==0)
          {
            System.out.println(" é primo");
          }

          else
          {
            System.out.println("n é primo");
          }
        }
        public static void exercicio4()
        {
          int numero;
          Scanner numeropedido= new Scanner(System.in);
          System.out.print("Digite o numero ");
          numero = numeropedido.nextInt();
          Scanner numeropedido2= new Scanner(System.in);
          System.out.print("Digite o numero ");
          numero = numeropedido2.nextInt();
          for(int i=1;i<=1000;i++){
            int contador=0;
            for(int j=1;j<=i;j++){
              if(i%j==0){
                contador++;
              }
            }
            if(contador==2)
            {

              System.out.println(i);
            }
      }
      
    }
    public static void exercicio5()
            {
              int contador =0;
              char temp;
              int numero,digitos,d,k=0;
              String resultado;
          Scanner  numeropedido = new Scanner(System.in);
          System.out.print("Digite o numero ");
          numero = numeropedido.nextInt();
          Scanner  numerodigitos = new Scanner(System.in);
          System.out.print("Digite o digitos ");
          digitos = numerodigitos.nextInt();
          Scanner  numerovalor = new Scanner(System.in);
          System.out.print("Digite o digitos ");
          d = numerovalor.nextInt();
          int length = (int)(Math.log10(numero)+1);
          
          
          for (int i = 0; k <= numero; i++)
          {
            int length2 = (int)(Math.log10(i)+1);
            
            if(length2 <= d)
          {  
            int ultimonumero = i%10; 
            if(ultimonumero  == d)
           
                System.out.println(""+i);
            
               if(k ==numero)
               {
                 k++;
               }
      
            }
        {

        }
            }
}
}
        
  
        

          
    
    
