public class deposito {
    private Boolean andar;
    private Boolean cartao;
    private Boolean valor;
    private Boolean retirar;

    public Boolean getAndar() {
        return andar;
    }

    public void setAndar(Boolean andar) {
        this.andar = andar;
    }

    public Boolean getCartao() {
        return cartao;
    }

    public void setCartao(Boolean cartao) {
        this.cartao = cartao;
    }

    public Boolean getValor() {
        return valor;
    }

    public void setValor(Boolean valor) {
        this.valor = valor;
    }

    public Boolean getRetirar() {
        return retirar;
    }

    public void setRetirar(Boolean retirar) {
        this.retirar = retirar;
    }

    public static boolean iraobanco(Boolean andar) {
        if (andar != null && andar) {
            System.out.println("vamos ao banco");
            andar(true);
        }
    }
}

