import java.util.Locale;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class Usuario {
    public static void main(String[] args) throws Exception {
        /*
         * // argumentos para login da SmartTV
         * 
         * String usuario = args[0];
         * String senha = args[1];
         * String codigoAcesso = args[2]; // codigo para controle parental
         * 
         * System.out.println("Olá " + usuario + ". Bem vindo. A senha " + senha
         * +
         * " foi digitada corretamente. O controle parental está desativado pelo código "
         * + codigoAcesso);
         */
        SmartTv smartTv = new SmartTv();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu login: ");
        String login = scanner.next();

        System.out.println("Digite sua senha: ");
        String senha = scanner.next();
        int contadorSenha = 1;
        while (!senha.equals("shelbygt500") && contadorSenha <= 2) {
            System.out.println("SENHA INCORRETA.\nTENTE NOVAMENTE.");
            System.out.println("Restam " + (3 - contadorSenha) + " tentativas. Digite sua senha: ");
            contadorSenha++;
            senha = scanner.next();
        }
        if (senha.equals("shelbygt500")) {
            System.out.println("SENHA CORRETA.");
        } else {
            System.out.println("ACESSO BLOQUEADO");
            scanner.close();
        }

        System.out.println("Deseja desativar o Controle parental? (y/n)");
        String respostaCodigo = scanner.next();
        if (respostaCodigo.equals("y")) {
            System.out.println("Digite o código de acesso: ");
            String codigoAcesso = scanner.next();
            int contadorCodigo = 1;

            while (!codigoAcesso.equals("391550") && contadorCodigo <= 2) {
                System.out.println("CÓDIGO INCORRETO.\nRestam " + (3 - contadorCodigo) + " tentativas.");
                System.out.println("Digite o código de acesso: ");
                contadorCodigo++;
                codigoAcesso = scanner.next();
            }
            if (codigoAcesso.equals("391550")) {
                System.out.println("CÓDIGO DE ACESSO CORRETO.\nCONTROLE PARENTAL DESATIVADO.");
                smartTv.desativarControleParental();
            } else {
                System.out.println("TENTATIVAS EXCEDIDAS. CONTROLE PARENTAL ATIVADO.");
            }
        } else if (respostaCodigo.equals("n")) {
            System.out.println("CONTROLE PARENTAL ATIVADO.");
        } else {

        }
        System.out.println("TV está ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("Controle parental está ativado?" + smartTv.controleParental);

        smartTv.ligar();
        System.out.println("NOVO STATUS ---> TV está ligada? " + smartTv.ligada);

        System.out.println("Canal: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal: " + smartTv.canal);
        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.descerCanal();
        System.out.println("Canal: " + smartTv.canal);

    }
}
