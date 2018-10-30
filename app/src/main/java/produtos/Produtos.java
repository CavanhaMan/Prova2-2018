package produtos;

public class Produtos {
    String produto;
    int valor;


    public Produtos(String produto, int valor) {
        this.produto = produto;
        this.valor = valor;
    }

    public String getProduto() {return produto;}
    public int getValor() {return valor;}

    public void setProduto(String produto) {this.produto = produto;}
    public void setValor(int valor) {this.valor = valor;}
}
