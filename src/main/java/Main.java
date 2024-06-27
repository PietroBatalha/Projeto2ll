import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("seu login");
        String login = sc.next();
if (login.equals("admin")) { 
  System.out.println("digite sua senha"); 
  int senha = sc.nextInt();
            if (senha == 1243) {
                System.out.println("Bem vindo, admin");

            } else {
     System.out.println("Senha errada");          
            }
        } else if (login.equals("financeiro")) {
            System.out.println("digite sua senha"); 
  int senha = sc.nextInt();
            if (senha == 1234) {             System.out.println("Bem vindo, financeiro");

            } else {                System.out.println("senha errada");
            }
        } else if (login.equals("usuário")) {          System.out.println("digite sua senha"); 
                                             int senha = sc.nextInt();
if (senha == 3333) {              System.out.println("Bem vindo, usuário");
            } else {
                System.out.println("senha errada");
}
                                            } else {     System.out.println("usuario não encontrado");
        }
        sc.close();
    }
}