import java.util.Scanner;

public class Conta {
    private String tipoOperacao;
    private Float valorSaque;
    private Boolean transferencia;
    private Float saldo;
    private Float valorTransferencia;
    private String tipoTransferencia;
    private String extrato;
    public String getTipoOperacao() {
        return tipoOperacao;
    }
    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }
    public Float getValorSaque() {
        return valorSaque;
    }
    public void setValorSaque(Float valorSaque) {
        this.valorSaque = valorSaque;
    }
    public Boolean getTransferencia() {
        return transferencia;
    }
    public void setTransferencia(Boolean transferencia) {
        this.transferencia = transferencia;
    }
    public Float getSaldo() {
        return saldo;
    }
    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }
    public Float getValorTransferencia() {
        return valorTransferencia;
    }
    public void setValorTransferencia(Float valorTransferencia) {
        this.valorTransferencia = valorTransferencia;
    }
    public String getTipoTransferencia() {
        return tipoTransferencia;
    }
    public void setTipoTransferencia(String tipoTransferencia) {
        this.tipoTransferencia = tipoTransferencia;
    }
    public String getEstrato() {
        return extrato;
    }
    public void setEstrato(String estrato) {
        this.extrato = estrato;
    }

    public static Conta saque(Conta conta) {
        if (conta.getSaldo() !=null && conta.getSaldo() > 0) {
            System.out.println("Saque realizado no valor de " + conta.getSaldo());

        }
        return conta;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Conta conta = new Conta();
        System.out.println("Informer o tipo de operação que deseja fazer! ");
        String tipoOperacaoDigitada = input.next();
        conta.setTipoOperacao(tipoOperacaoDigitada);
        if (conta.getTipoOperacao().equals("Saque")) {
            System.out.println("A opção escolhida foi de saque ");
            System.out.println("Informe o valor do saque ");
            Float valorSaque = input.nextFloat();
            conta.setValorSaque(valorSaque);
            saque(conta);
        }
    }
}
