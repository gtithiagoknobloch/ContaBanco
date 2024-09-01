import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, seja muito bem vindo! :-)");
        System.out.println("Iremos te guiar para criar a sua conta no MyB@nk Digital");
        System.out.println("Antes de começar, precisamos de algumas informações.");
        System.out.println("Me informe o seu nome:");
        String nome = scanner.next();
        
        System.out.println("Muito bem "+nome);
        
        System.out.println("Agora me informe o seu sobrenome:");
        String sobrenome = scanner.next();
        
        System.out.println("OK, então seu nome completo é "+nome.concat(" "+sobrenome));
        
        System.out.println("Agora para continuarmos, informe o número da agência onde deseja abrir a conta:");
        int agencia = scanner.nextInt();
        
        System.out.println("Muito bem, a agencia escolhida foi a "+agencia);
        
        System.out.println("Agora nos informe o número da conta:");
        String conta = scanner.next();
        System.out.println("OK, número da conta é "+conta);
        
        System.out.println("E para finalizar, quanto deseja depositar na abertura da sua conta? Precisa pelo menos ser acima de R$0");
        double saldo = scanner.nextDouble();

        while(saldo == 0){
            System.out.println("Poxa, precisamos de um Saldo positivo, podemos tentar novamente com um valor acima de R$0?");
            saldo = scanner.nextDouble();
        }
       
        System.out.println("Então é isso "+nome+", seja Bem Vindo ao MyB@nk, muito obrigado por criar uma conta em nosso banco. Sua agência é a de número "+agencia+", o Número da conta "+conta+" e o seu saldo de R$"+saldo+ " já está disponível para saque.");


        
    }
}
