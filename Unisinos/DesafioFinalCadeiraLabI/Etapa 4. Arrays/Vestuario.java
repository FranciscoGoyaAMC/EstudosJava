public class Vestuario extends Loja
{
    private boolean produtosImportados;
    
    public Vestuario(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao, boolean produtosImportados, int estoque)
    {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao, estoque);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados()
    {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados)
    {
        this.produtosImportados = produtosImportados;
    }

    public String toString()
    {
        super.toString();
        return "Produtos importados: " + produtosImportados;
    }
}
