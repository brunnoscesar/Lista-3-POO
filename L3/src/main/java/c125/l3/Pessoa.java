package c125.l3;

public class Pessoa {

    private String nome;
    private int cpf;
    private int qtdEnd;
    private Endereco[] enderecos = new Endereco[5];

    public Pessoa(String nome, int cpf, int qtdEnd){
        this.nome = nome;
        this.cpf = cpf;
        this.qtdEnd = qtdEnd;
    }

    public static int countEnd = 0;
    public void addEndereco(Endereco end){
        if(countEnd < qtdEnd){
            enderecos[countEnd] = end;
            countEnd++;
        }else{
            System.out.println("Não foi possível adicionar mais endereços");
        }
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        for(int i = 0; i< qtdEnd; i++){
            int j = i + 1;
            System.out.println("Endereco " + j + ": ");
            System.out.println(enderecos[i].getRua());
            System.out.println(enderecos[i].getBairro());
            System.out.println(enderecos[i].getNum());
            System.out.println(" ");

        }
    }

    //Getters e Setters
    public int getQtdEnd() {
        return qtdEnd;
    }
    public void setQtdEnd(int qtdEnd) {
        this.qtdEnd = qtdEnd;
    }
}
