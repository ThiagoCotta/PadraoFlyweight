public class Sorvete {

    private String sabor;
    private Adicional adicionalEscolhido;

    public Sorvete(String sabor, Adicional adicionalEscolhido) {
        this.sabor = sabor;
        this.adicionalEscolhido = adicionalEscolhido;
    }

    public String obterSorvete() {
        return "Sorvete{" +
                "sabor='" + this.sabor + '\'' +
                ", adicional='" + adicionalEscolhido.getAdicional() + '\'' +
                ", calda='" + adicionalEscolhido.getCalda() + '\'' +
                '}';
    }
}
