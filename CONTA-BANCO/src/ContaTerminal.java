import java.util.Scanner;

public class ContaTerminal {
static Scanner scan = new Scanner(System.in);
  
    
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
    Menu();
    int op= scan.nextInt();

    while (op != 3){
     
    if(op == 1){
        cliente.cadastro();
    }else if(op ==2){
        cliente.exibirDados();
    }else {
        System.out.println("Opção inexistente, tente de novo:\n");
    }

    Menu();
    op = scan.nextInt();
}
System.out.println("*****FINALIZANDO PROGRAMA*****");

    }

   
    public static void Menu(){
    System.out.println("\nEscolha a opção desejada: \n1)Cadastrar usuário \n2)Exibir mensagem \n3)Sair\n");
    }

}
