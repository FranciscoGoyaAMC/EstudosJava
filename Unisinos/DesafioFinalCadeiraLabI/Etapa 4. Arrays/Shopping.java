public class Shopping 
{
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeLojas)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeLojas];
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Endereco getEndereco()
    {
        return endereco;
    }

    public void setEndereco(Endereco endereco)
    {
        this.endereco = endereco;
    }

    public Loja[] getLojas() 
    {
        return lojas;
    }

    public void setLojas(Loja[] lojas) 
    {
        this.lojas = lojas;
    }

    public String toString()
    {
        return "Shoping: Nome: " + nome + "Endereço : " + endereco + "Lojas: " + lojas;
    }
    
    public boolean insereLoja(Loja loja)
    {
        for(int i = 0; i < lojas.length; i++)
        {
            if(lojas[i] == null)
            {
                lojas[i] = loja;
                System.out.println("Loja " + loja + " adicionada com sucesso!");
                return true;
            }
        }
        System.out.println("Falha ao adicionar a loja.");
        return false;
    }

    public boolean removeLoja(String loja)
    {
        for(int i = 0; i < lojas.length; i++)
        {
            if(lojas[i] != null)
            {
                if(lojas[i].getNome().equalsIgnoreCase(loja))
                {
                    lojas[i] = null;
                    System.out.println("Loja " + loja + " removida com sucesso!");
                    return true;
                }
            }
        }
        System.out.println("Falha ao remover loja.");
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoDeLoja)
    {
        int quantidadeDeLojas = 0;

            for(int i = 0; i < lojas.length; i++)
            {
                if(tipoDeLoja.equalsIgnoreCase("Alimentação") || tipoDeLoja.equalsIgnoreCase("Alimentaçao)") || tipoDeLoja.equalsIgnoreCase("Alimentacão") || tipoDeLoja.equalsIgnoreCase("Alimentacao"))
                {
                    if(lojas[i] instanceof Alimentacao)
                    {
                        quantidadeDeLojas += 1;
                    }
                }
                else if(tipoDeLoja.equalsIgnoreCase("Bijuteria"))
                {
                    if(lojas[i] instanceof Bijuteria)
                    {
                        quantidadeDeLojas += 1;
                    }
                }
                else if(tipoDeLoja.equalsIgnoreCase("Cosmético") || tipoDeLoja.equalsIgnoreCase("Cosmetico"))
                {
                    if(lojas[i] instanceof Cosmetico)
                    {
                        quantidadeDeLojas += 1;
                    }
                }
                else if(tipoDeLoja.equalsIgnoreCase("Informática") || tipoDeLoja.equalsIgnoreCase("Informatica"))
                {
                    if(lojas[i] instanceof Informatica)
                    {
                        quantidadeDeLojas += 1;
                    }
                }
                else if(tipoDeLoja.equalsIgnoreCase("Vestuário") || tipoDeLoja.equalsIgnoreCase("Vestuario"))
                {
                    if(lojas[i] instanceof Vestuario)
                    {
                        quantidadeDeLojas += 1;
                    }
                }
            }
            if (quantidadeDeLojas == 0)
            {
                return -1;
            }
            else
            {
                return quantidadeDeLojas;
            }
    }

    public Informatica lojaSeguroMaisCaro()
    {
        Informatica lojaMaisCara = null;
        double maiorSeguro = 0;
        
        for(int i = 0; i < lojas.length; i++)
        {
            if(lojas[i] != null)
            {
                if (lojas[i] instanceof Informatica)
                {
                    Informatica informatica = (Informatica) lojas[i];
                    double seguro = informatica.getSeguroEletronicos();
                    if(seguro > maiorSeguro)
                    {
                        maiorSeguro = seguro;
                        lojaMaisCara = informatica;
                    }
                }
            }
        }
        return lojaMaisCara;
    }
}
