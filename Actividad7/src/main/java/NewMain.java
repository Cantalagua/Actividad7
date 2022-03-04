
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alexi
 */
class algoritmos{

    public ArrayList<Integer> primos(){
        
    int ct=0,n=0,i=1,j=1, reps =15;  
        ArrayList<Integer> primos = new ArrayList<Integer>();
        while(n<reps)  {  
            j=1;  
            ct=0;  
            while(j<=i) {  
                if(i%j==0)  
                ct++;  
                j++;   
                }  
            if(ct==2)  {  
                primos.add(i);
                
                n++;  
            }  
            i++;  
        }
    return primos;
    }
    
    public ArrayList<Integer> Fibo(){
        int numMax = 10;
        int numAnterior = 0;
	int numSiguiente = 1;
        ArrayList<Integer> fibo = new ArrayList<Integer>();
        fibo.add(0);
        
        for (int i = 1; i <= numMax; ++i)
        {            
            int sum = numAnterior + numSiguiente;
            numAnterior = numSiguiente;
            numSiguiente = sum;
            fibo.add(numAnterior);
            
	        }
	return fibo;
}   
    
}
    
    public class NewMain {
    public static void main(String[] args) {
        // TODO code application logic here
          
        algoritmos algo = new algoritmos();
        System.out.println("Números primos: \n" + algo.primos());
        System.out.println("Sucesión de Fibonacci: \n" + algo.Fibo());
        
    }  
}  
        
        



