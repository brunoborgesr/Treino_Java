package exerciciosS7;

public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int empates;
    private int derrotas;

    //Metodods
    public void apresentar(){
        System.out.println("----------------------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome() + "!");
        System.out.println("Diretamente de " + this.getNacionalidade() + "!");
        System.out.println("Com " + this.getIdade() + " anos de idade e " + this.getAltura() + " metros!");
        System.out.println("Pesando " + this.peso + "Kg!");
        System.out.println("- " + this.getVitorias() + " Vitórias");
        System.out.println("- " + this.getEmpates() + " Empates");
        System.out.println("- " + this.getDerrotas() + " Derrotas");
    }
    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria() + "!");
        System.out.println("Ganhou " + this.getVitorias() + " vez(es)!");
        System.out.println("Empatou " + this.getEmpates() + " vez(es)!");
        System.out.println("Perdeu " + this.getDerrotas() + " vez(es)!");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    //Metodos Especiais

    public Lutador(String no, String na, int id, double al, double pe, int vi, int en, int de){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.empates = en;
        this.derrotas = de;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double isPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso >= 52.2 && this.peso <= 120.2){
            if(peso <= 70.3){
                this.categoria = "Leve";
            }else if (peso <= 83.9){
                this.categoria = "Médio";
            }else if (peso >=120.2){
                this.categoria = "Pesado";
            }
        }else{
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
}
