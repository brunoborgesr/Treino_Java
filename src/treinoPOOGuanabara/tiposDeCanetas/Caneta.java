package treinoPOOGuanabara.tiposDeCanetas;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Uma caneta "+ this.getCor());
        System.out.println("Ponta: " + this.getPonta());
    }

    void rabiscar(){
        if (tampada == true){
            System.out.println("ERRO! Não posso rabiscar pois a tampa está fechada");
        }else{
            System.out.println("Estou rabiscando");
        }

    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Float getPonta(){
        return this.ponta;
    }

    public void setPonta(Float ponta){
        this.ponta = ponta;
    }

    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public Caneta(String modelo, Float ponta, String cor) {
        setModelo(modelo);
        setPonta(ponta);
        setCor(cor);
        tampar();
    }
}
