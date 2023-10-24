import java.util.Scanner;

public class App {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculo da media aritmetica:");
        System.out.print("Nota 1#: ");
        int grade1 = sc.nextInt();
        System.out.print("Nota 2#: ");
        int grade2 = sc.nextInt();
        System.out.print("Nota 3#: ");
        int grade3 = sc.nextInt();
        System.out.print("Nota 4#: ");
        int grade4 = sc.nextInt();

        double average = (grade1 + grade2 + grade3 + grade4) / 4; 


        if(average > 70) {
            System.out.println("Aluno Aprovado!");
        }
        else if((average >= 40 )&&(average <= 70)) {
            System.out.println("Aluno em exame!");

            System.out.print("Nota do Exame: ");
            int exam = sc.nextInt();

            average = (average + exam) / 2;

            if(average >= 50){
                System.out.println("Aluno aprovado");
            }
            else{
                System.out.println("Aluno reprovado!");
            }
        }
        else{
           System.out.println("Aluno reprovado!");
        } 

        sc.close();
    }
}
