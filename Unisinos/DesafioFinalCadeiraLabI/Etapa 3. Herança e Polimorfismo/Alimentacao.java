public class Alimentacao extends Loja
{
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao, Data dataAlvara)
    {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara()
    {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara)
    {
        this.dataAlvara = dataAlvara;
    }

    public String toString()
    {
        super.toString();
        return "Data Alvara: " + dataAlvara;
    }
}
