package ATVpoo;

public class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int numero){
        this.numConta = numero;
    }


    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String c) {
        this.tipo = c;
    }


    public String getDono(){
        return this.dono;
    }
    public void setDono(String nome){
        this.dono = nome;
    }


    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float dinheiro){
        this.saldo = dinheiro;
    }


    public void depositar(){
        this.saldo = saldo;
    }



}
