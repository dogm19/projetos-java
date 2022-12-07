package questao19;

public class Questao19 {
    public static void main(String[] args) throws Exception {
        String nomeMarca = "Toyota";
        int nModelosMarca = 4;
        int anoLancamentoModelo = 1978;
        int codigoIdentificador = 19781981;
        String cor = "branco";
        int chassi = 45823;
        String bairroProprietario = "Centro";
        String ruaProprietario = "Av. Getulio vargas";
        int nCasaProprietario = 234;
        int velocidadeMaxima = 250;
        int velocidadeAtual = 100;
        int nDePortas = 2;
        boolean tetoSolar = false;
        int nMarchas = 5;
        boolean cambioAutomatico = true;
        double volumeCombustivel = 52;
        Carro ca = new Carro (nomeMarca, nModelosMarca, anoLancamentoModelo, codigoIdentificador, ruaProprietario, bairroProprietario, nCasaProprietario, cor, chassi, velocidadeMaxima,  velocidadeAtual, nDePortas, tetoSolar,  cambioAutomatico, volumeCombustivel, nMarchas);
        System.out.println( ca.imprimir());
        System.out.println( "Acelerando");
        ca.aceleraCarro();
        System.out.println( "Velocidade atual: " + ca.getVelocidadeAtual());
        System.out.println( "Freiando");
        ca.freiaCarro();
        System.out.println( "Velocidade atual: " + ca.getVelocidadeAtual());
        ca.trocaMarcha();
        System.out.println( "Trocou de marcha!!");
        System.out.println( "Marcha atual: " + ca.getMarcha());
        ca.reduzMarcha();
        System.out.println( "Reduziu a marcha!!");
        System.out.println( "Marcha atual: " + ca.getMarcha());
        ca.marchaRé();
        System.out.println( "Dando marcha ré");
        System.out.println( "Marcha atual: " + ca.getMarcha());
        
    }
}