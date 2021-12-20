
import java.util.stream.IntStream;

import javax.lang.model.util.ElementScanner6;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Exercicio5{
    public static void main(String[] args) throws Exception {
    
    List l0  = new ArrayList();
    List l2= new ArrayList();
    List l3  = new ArrayList();
    List l4  = new ArrayList();
    List l5  = new ArrayList();
    List l6  = new ArrayList();
    List l7 = new ArrayList();
    List l8  = new ArrayList();
    List l9  = new ArrayList();
    int maior = 0;
    ArrayList<String> aulas = new ArrayList<>();
    int [] inteiros ={3,673, 106, 45, 2, 23};
    String[] stringarray=Arrays.toString(inteiros).split("[\\[\\]]")[1].split(", "); 
   
      for (int i = 0; i < stringarray.length; i++) 
      {
      if(stringarray[i].length()>=maior)
      {
          maior = stringarray[i].length();
         
      }
      else
      {
        continue;
      }
      }
    for (int i = 0; i < stringarray.length; i++) 
    {
      if(stringarray[i].length()>=maior)
      {
      stringarray[i] = ""+stringarray[i];
    
      }
      else
      {
        stringarray[i] = "0"+stringarray[i];
      
      }
    }
    for (int i = 0; i <=stringarray[i].length(); i++) 
      {
     for(i=0;i <=maior;i++)
     {
      stringarray[i] = ""+stringarray[i].charAt(maior);
     }


    }
  }
}
