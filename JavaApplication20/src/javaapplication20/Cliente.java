package javaapplication20;

public class Cliente {

    private String nome;
    private String tipoConta;
    private float saldo;
    private boolean statusConta;

    public Cliente(String nome, String tipoConta) {
        this.setNome(nome);
        this.setTipoConta(tipoConta);
        this.setStatusConta(false);
        this.setSaldo(0);
    }
    public void status(){
        System.out.println("----------------------");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Tipo: "+this.getTipoConta());
        System.out.println("Status: "+this.getStatusConta());
    }
    public void abrirConta() {
        if (this.getTipoConta() == "CC") {
            this.setSaldo(50);
        } else {
            this.setSaldo(150);
        }
        this.setStatusConta(true);
    }

    public void saque(int valor) {
        if (this.getStatusConta()) {
            if (this.getSaldo() > 0) {
                this.setSaldo(this.getSaldo() - valor);
            } else {
                System.out.println("Impossivel sacar saldo insuficiente");
            }
        }else{
            System.out.println("Conta inativa!");
        }

    }

    public void deposito(int valorDeposito) {
        this.setSaldo(this.getSaldo()+valorDeposito);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }

}
