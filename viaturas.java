package pkg0816;


public class Viaturas {
    private String marca, modelo, matricula, combustivel;
    private int kilometrosAtuais;
    private float preco;
    
public Viaturas (String marca, String modelo, String matriucla,
        String combustivel,int kilometrosAtuais, float Preco){
    this.marca=marca;
    this.modelo=modelo;
    this.matricula=matricula;
    this.combustivel=combustivel;
    this.kilometrosAtuais=kilometrosAtuais;
    this.preco=preco;
}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getKilometrosAtuais() {
        return kilometrosAtuais;
    }

    public void setKilometrosAtuais(int kilometrosAtuais) {
        this.kilometrosAtuais = kilometrosAtuais;
    }

    public float getPreco() {
        return preco;
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }

}
