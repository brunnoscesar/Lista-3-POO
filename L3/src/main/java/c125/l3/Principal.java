package c125.l3;

public class Principal {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Josué", 123, 2);

        Endereco end1 = new Endereco("Rua do Pé", "Bairro da mão", 666);
        Endereco end2 = new Endereco("Rua do Bairro", "Bairro da Cidade", 0);
        Endereco end3 = new Endereco("Rua Xuvarula", "Bairro da Trusmeia", 10244);

        p1.addEndereco(end1);
        p1.addEndereco(end2);
       // p1.addEndereco(end3);

        p1.mostraInfo();
    }
}
