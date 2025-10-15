import java.util.Scanner;
public class Main {
    public static void main(String[] arcs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                **************************************
                Dados iniciais do cliente:
                
                Nome:                Lucas
                Tipo Conta:          Corrente
                Saldo inicial:       R$ 2500,00
                
                **************************************
                """);
        int menu;
        double saldo = 2500.00;
        double receber;
        do{
         System.out.println("""
                 Operações:
                 
                 1- Consultar Saldos
                 2- Receber Valor
                 3- Transferir Valor
                 4- Sair
                 
                 Digite a opção desejada:
                 """);
         menu = scanner.nextInt();
         switch (menu){
             case 1:
                 System.out.printf("O saldo atual e R$%.2f\n",saldo);
                 break;
             case 2:
                 System.out.println("Informe o valor a receber:");
                 receber = scanner.nextDouble();
                 saldo += receber;
                 break;
         }

        }while ( menu != 4);

    }
}