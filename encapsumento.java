public class Main {
    public static void main(String[] args) {
        Automovel moto = new Moto("Yamaha XPTO-100", new MecanismoDeAceleracaoDeMotos())
        Automovel carro = new Carro("Honda Fit", new MecanismoDeAceleracaoDeCarros())
        List<Automovel> listaAutomoveis = Arrays.asList(moto, carro);
        for (Automovel automovel : listaAutomoveis) {
            automovel.acelerar();
            automovel.acenderFarol();
        }
    }
}