import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String palavra= scanner.next();
        char[] palavraInv = new char[palavra.length()];

        int j=0;
        
        
        for(int i=palavra.length()-1;i>=0; i--){
            
            palavraInv[j]=palavra.charAt(i);
            j++;
        }

       
        System.out.println(palavraInv);
    
    }
    
    
   
}