public class Cosmetico extends Loja
{
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao, double taxaComercializacao)
    {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao()
    {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao)
    {
        this.taxaComercializacao = taxaComercializacao;
    }

    public String toString()
    {
        super.toString();
        return "Taxa de Comercialização: " + taxaComercializacao;
    }
}
