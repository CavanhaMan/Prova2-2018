package professorangoti.com.interaocomousuario.produtos;

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


/*
   {"produto":"Voce pediu um donut.","valor":"10"},
   {"produto":"Voce pediu um sanduiche de sorvete.","valor":"20"},
   {"produto":"Voce pediu um FroYo.","valor":"30"} 
*/