package questao19;

public class Proprietario {
    private String bairro;
    private String rua;
    private String nCasa;
    private Endereço endereco;

    public Proprietario(String bairro, String rua, int nCasa){
        Endereco endr = new Endereco();
        endr.setBairro(bairro);
        endr.setRua(rua);
        endr.setnCasa(nCasa);
        endereco = endr;
    }

    public String getBairro() {
        return endereco.getBairro();
    }

    public String getRua() {
        return endereco.getRua();
    }

    public int getnCasa() {
        return endereco.getnCasa();
    }
}