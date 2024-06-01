import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Informe o Primeiro Parâmetro: ");
       int p1 = sc.nextInt();
       System.out.println("Informe o Segundo Parâmetro: ");
       int p2 = sc.nextInt();
      
        try{
            contar(p1, p2);
        }catch(ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        } finally{      
       sc.close();
        }
    }   
       static void  contar(int p1, int p2)throws ParametrosInvalidosException{
        
        if (p1 > p2) {  
            throw new ParametrosInvalidosException();  
           }
        int contagem = p2 - p1;
            for (int i = 1 ; i <= contagem; i++){
                System.out.println("imprimindo o número: "+  i);
            }
            
        }
}
       
   

