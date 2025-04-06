import java.math.BigDecimal;
import java.util.Scanner;

public class Cliente {
 
    Scanner scan = new Scanner(System.in);
    private int numero;
    private String agencia;
    private String nome;
    private BigDecimal  saldo;
    
    
    //Setters e getters
        public String getAgencia() {
            return agencia;
        }
        public int getNumero() {
            return numero;
        }
        public BigDecimal getSaldo() {
            return saldo;
        }
        public String getNome() {
            return nome;
        }
        public void setAgencia(String agencia) {
            this.agencia = agencia;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setNumero(int numero) {
            this.numero = numero;
        }
        public void setSaldo(BigDecimal saldo) {
            this.saldo = saldo;
        }
    
        public void cadastro(){
        
            System.out.println("Digite o numero da conta:");  
            setNumero(scan.nextInt());
            scan.nextLine();

            System.out.println("Digite a agência:");
            setAgencia(scan.nextLine());

            System.out.println("Digite o nome:");
            setNome(scan.nextLine()); 

            System.out.println("Digite o saldo:");
            setSaldo(scan.nextBigDecimal());
        }
    
        public void exibirDados(){
    
            System.out.println("Olá "+ getNome() + " obrigado por criar uma conta em nosso banco, sua agência é " + getAgencia()+ ", conta "+ getNumero() +" e seu saldo " + getSaldo() + " já está disponível para saque");
        }
}
