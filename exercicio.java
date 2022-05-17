import java.util.Scanner;
import java.util.*;

class maior{
    int num = 0, maior = 0, menor = 999999, media = 0, soma = 0, primo = 0, cont15 = 0, cont2 = 0;
    int contMaior = 0, contMenor = 0, i = 0;
    boolean ehprimo = true;
    
}
public class exercicio {
    public static void main(String[] args){
        
        Scanner ent = new Scanner(System.in);
        int num = 0, maior = 0, menor = 999999, media = 0, soma = 0, primo = 0, cont15 = 0, cont2 = 0;
        int contMaior = 0, contMenor = 0, i = 0;
        boolean ehprimo = true;
        
        Integer[] intArray = {10,20,30,40,50,60,70,80};
    
        System.out.println("Digite um número ou -1 para sair");
        num = ent.nextInt();
        
        while(num != -1){
            // armazena os nº digitados
            soma = soma + num;
    
            // armazena o maior nº
            if(num > maior){
                maior = num;
                contMaior++;
            }
    
    
            for(int h = 2; h <= num; h++) {
                ehprimo = true;        
                for(int j = 2; j < h; j++) {            
                    if(h % j == 0) {
                        ehprimo = false;
                    }
                }
            }
            
            if (num % 15 == 0){
                cont15++;
            }
            if (num % 2 == 0){
                cont2++;
            }
            
            if(ehprimo) {
                primo++;
            }            
                
            // armazena o menor nº
            if(num < menor){
                menor = num;
                contMenor++;
            }   
            System.out.println("Digite um número ou -1 para sair");
            num = ent.nextInt();
            i += 1;
        }
       
        System.out.println("O maior nº digitado foi " + maior);
        System.out.println("O menor nº digitado foi " + menor);
        System.out.println("A média foi " + (media = soma / i));
        System.out.println("Quantidade de primos " + primo);
        System.out.println("Quantidade de divisiveis por 5 e 3 eh: " + cont15);
        System.out.println("Quantidade de divisiveis por 2 eh: " + cont2);
        
        
    }
}
