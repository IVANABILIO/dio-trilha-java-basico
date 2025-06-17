import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------Para Criar a Conta------------------");
        System.out.println("-- Por favor, digite o número da Agência----------");
        String agencia = scanner.next();
        System.out.println("--Por favor, digite o número da Conta-------------");
        Integer conta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("--Por favor, digite o Nome Completo---------------");
        String nome = scanner.nextLine();
        System.out.println("--Por favor, digite o valor do primeiro deposito--");
        BigDecimal saldo = scanner.nextBigDecimal();
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo de R$%s já está disponível para saque", nome, agencia, conta, saldo);
        
    }
}
