public class Bijuteria extends Loja 
{
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao, double metaVendas)
    {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas()
    {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas)
    {
        this.metaVendas = metaVendas;
    }

    public String toString()
    {
        super.toString();
        return "Meta de Vendas: " + metaVendas;
    }
}
