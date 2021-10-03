package c125.l3;

public class Endereco {

    private String rua;
    private String bairro;
    private int num;

    public Endereco(String rua, String bairro, int num) {
        this.rua = rua;
        this.bairro = bairro;
        this.num = num;
    }

    //Getters e Setters
    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public int getNum() {
        return num;
    }
}
