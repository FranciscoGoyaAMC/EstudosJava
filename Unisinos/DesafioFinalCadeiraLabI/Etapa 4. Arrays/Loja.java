public class Loja 
{
    private String nome;
    private int quantidadeFuncionarios;
    private int salarioBaseFuncionario;
    private Endereco enderecoLoja;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, Endereco enderecoLoja, Data dataFundacao)
    {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.enderecoLoja = enderecoLoja;
        this.dataFundacao = dataFundacao;
        this.salarioBaseFuncionario = -1;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco enderecoLoja, Data dataFundacao, int estoque)
    {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.enderecoLoja = enderecoLoja;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[estoque];
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

    public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao, int estoque)
    {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.enderecoLoja = enderecoLoja;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto [estoque];
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
        return "Nome: " + nome + ", Quantidade de Funcionarios: " + quantidadeFuncionarios + ", Salario Base dos Funcionários: "
                + salarioBaseFuncionario + ", Endereço: " + enderecoLoja + ", Data de Fundação: " + dataFundacao + ", Estoque: " + estoqueProdutos;
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
        if (salarioBaseFuncionario == -1){
            return -1;
        }
        else{
            return quantidadeFuncionarios * salarioBaseFuncionario;
        }
    }
    
    public char tamanhoDaLoja()
    {
        if (quantidadeFuncionarios < 10){
            return 'P';
        }
        
        else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30)
        {
            return 'M';
        }
       
        else{
            return 'G';
        }
    }

    public Produto[] getEstoqueProdutos() 
    {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) 
    {
        this.estoqueProdutos = estoqueProdutos;
    }

    public void imprimeProdutos()
    {
        for(int i = 0; i < estoqueProdutos.length; i++)
        {
            if(estoqueProdutos[i] != null)
            {
                System.out.println(estoqueProdutos[i]);
            }
        }
    }
    
    public boolean insereProduto(Produto produto)
    {
        for(int i = 0; i < estoqueProdutos.length; i ++)
        {
            if(estoqueProdutos[i] == null)
            {
                estoqueProdutos[i] = produto;
                System.out.println("Produto " + produto + "adicionado com sucesso!");
                return true;
            }
        }
        System.out.println("Falha ao adicionar produto! Sem espaço no estoque.");
        return false;
    }

    public boolean removeProduto(String produto)
    {
        for(int i = 0; i < estoqueProdutos.length; i++)
        {
            if(estoqueProdutos[i] != null)
            {
                if(estoqueProdutos[i].getNome().equalsIgnoreCase(produto))
                {
                    estoqueProdutos[i] = null;
                    System.out.println("Produto " + produto + " removido com sucesso!");
                    return true;
                }
            }
        }
        System.out.println("Falha ao remover produto");
        return false;
    }

}
