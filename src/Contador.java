import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();
        
        try {
            
            contar(parametroUm, parametroDois);
            
        }catch (ParametroInvalidoException e) {
            System.err.println("O primeiro parâmetro deve ser maior que o primeiro!!");
        }
        
        
        
    }
    
    private static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoException {
        if (parametroDois<parametroUm) {
            throw new ParametroInvalidoException();
        }
        
        int contagem = parametroDois - parametroUm;
        
        for (int i = 0 ; i < contagem ; i++) {
            System.out.println("\nImprimindo o número " + (i+1));
        }
    } 
}

