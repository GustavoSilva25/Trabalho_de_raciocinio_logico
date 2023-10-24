import java.util.Scanner;

public class App {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("--------------------------------");
        System.out.println("| Maquina de saques automaticos |");
        System.out.println("--------------------------------");
        
        System.out.println("notas aceitas (R$ 20, R$ 50 e R$ 100)");

        System.out.print("Digite o valor de saque: ");
        double value = sc.nextDouble();
        double amount = value;

    
        if (value >= 100) {
            int note100 = (int) (value / 100);
            value -= note100 * 100;
            System.out.println(note100 + " nota de R$100");
        }
        if (value >= 50) {
            int note50 = (int) (value / 50);
            value -= note50 * 50;
            System.out.println(note50 + " nota de R$50");
        }
        if (value >= 20) {
            int note20 = (int) (value / 20);
            value -= note20 * 20;
            System.out.println(note20 + " nota de R$20");
        }
        System.out.printf("valor de RS %.2f não esta sendo entregue nem debitado da conta%n",value);
        System.out.printf("R$ %.2f estao sendo debitados",(amount - value));
        
    
    
        
        
        

    



        sc.close();
    }
}
