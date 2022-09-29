public class Carro {
    private Integer diametrodopneu;
    private String motor;
    private String porta;
    private String busina;
    private String farol;
    private boolean chave;
    private boolean acelerador;

    public Integer getDiametrodopneu() {
        return diametrodopneu;
    }

    public void setDiametrodopneu(Integer diametrodopneu) {
        this.diametrodopneu = diametrodopneu;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getBusina() {
        return busina;
    }

    public void setBusina(String busina) {
        this.busina = busina;
    }

    public String getFarol() {
        return farol;
    }

    public void setFarol(String farol) {
        this.farol = farol;
    }

    public boolean setChave() {
        return chave;
    }

    public void getChave(boolean chave) {
        this.chave = chave;
    }

    public boolean setAcelerador() {
        return acelerador;
    }

    public void getAcelerador(boolean acelerador) {
        this.acelerador = acelerador;
    }

    public static boolean ligarcarro(Boolean chavedocarro) {

        if (chavedocarro != null && chavedocarro) {
            System.out.println("ligando carro");
            acelererarcarro(chavedocarro, true);
        } else {
            System.out.println("estou sem as chaves do carro");
            acelererarcarro(chavedocarro, true);
        }
        return chavedocarro;
    }
    public static boolean desligarcarro(Boolean chave) {
        System.out.println("carro desligado");
        return chave;
    }

    public static boolean acelererarcarro(Boolean chavedocarro, Boolean acelerador) {
        if (chavedocarro != null && chavedocarro) {
            System.out.println("Acelerar carro");
            desligarcarro(true);
        } else {
            System.out.println("impossivel de acelerar o carro, não tem chave");
        }
        return acelerador;
    }

    public static void main(String[] args) {
        ligarcarro(true);
    }

}
