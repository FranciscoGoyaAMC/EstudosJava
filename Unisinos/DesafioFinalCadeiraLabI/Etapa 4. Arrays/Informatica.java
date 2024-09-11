public class Informatica extends Loja 
{
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao, double seguroEletronicos, int estoque)
    {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao, estoque);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos()
    {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos)
    {
        this.seguroEletronicos = seguroEletronicos;
    }

    public String toString()
    {
        super.toString();
        return "Seguro Eletronicos: " + seguroEletronicos;
    }
}
