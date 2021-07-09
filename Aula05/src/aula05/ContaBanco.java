
package aula05;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //Metodos personalizados
    public void estadoAtual(){
        System.out.println("-------------------------");
        System.out.println("Conta "+this.getNumConta());
        System.out.println("tipo "+this.getTipo());
        System.out.println("Dono "+this.getDono());
        System.out.println("Saldo "+this.getSaldo());
        System.out.println("Status "+this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t == "CC"){
            this.setSaldo(50);
        } else {
            this.setSaldo(150);            
        }
            System.out.println("Conta conta aberta com sucesso");
    }
    
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        } else if(this.getSaldo() < 0){
            System.out.println("Conta em débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta conta fechada com sucesso");
        }
    }
    
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
                System.out.println("Deposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Não é possível depositar, conta fechada.");
        }
    }
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v ){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível sacar, conta fechada.");
        }
        
    }
    public void pagarMensal(){
        int v;
        if(this.getTipo() == "CC"){
            v = 12;
        } else {
            v = 20;
        }
        
        if (this.getStatus()){
            if(this.getSaldo()>v) {
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Mensalidade paga com sucesso por "+this.getDono());  
            } else {
                System.out.println("Saldo insuficiente");                
            }
        } else{
                System.out.println("Impossível pagar");
        }
        
    }
    
    
    
    
    //metodos Especiais
    
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
   
    
    
}
