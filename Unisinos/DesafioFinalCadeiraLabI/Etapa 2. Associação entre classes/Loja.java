public class Loja 
{
    private String nome;
    private int quantidadeFuncionarios;
    private int salarioBaseFuncionario;
    private Endereco enderecoLoja;
    private Data dataFundacao;

    public Loja(String nome, int quantidadeFuncionarios, Endereco enderecoLoja, Data dataFundacao)
    {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.enderecoLoja = enderecoLoja;
        this.dataFundacao = dataFundacao;
        this.salarioBaseFuncionario = -1;
    }

    public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao)
    {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.enderecoLoja = enderecoLoja;
        this.dataFundacao = dataFundacao;
    }

    public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario) 
    {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Loja(String nome, int quantidadeFuncionarios)
    {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() 
    {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) 
    {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getSalarioBaseFuncionario() 
    {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(int salarioBaseFuncionario) 
    {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public String toString() 
    {
        return "Loja: Nome: " + nome + ", Quantidade De Funcionarios: " + quantidadeFuncionarios + ", Salario Base Funcionario: "
                + salarioBaseFuncionario + ", Endereco Da Loja: " + enderecoLoja + ", Data De Fundacao: " + dataFundacao;
    }

    public Endereco getEndereco() 
    {
        return enderecoLoja;
    }

    public void setEndereco(Endereco enderecoLoja) 
    {
        this.enderecoLoja = enderecoLoja;
    }

    public Data getDataFundacao() 
    {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) 
    {
        this.dataFundacao = dataFundacao;
    }

    public int gastosComSalario()
    {
        if (salarioBaseFuncionario == -1)
        {
            return -1;
        }
        else
        {
            return quantidadeFuncionarios * salarioBaseFuncionario;
        }
    }
    
    public char tamanhoDaLoja()
    {
        if (quantidadeFuncionarios < 10)
        {
            return 'P';
        }
        
        else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30)
        {
            return 'M';
        }
       
        else
        {
            return 'G';
        }
    }

}
