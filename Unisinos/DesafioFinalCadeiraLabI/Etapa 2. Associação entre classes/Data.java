public class Data 
{
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
        if (this.mes >= 1 && this.mes <= 12)
        {
            this.mes = mes;
        }
        else
        {
            System.out.println("Erro! Data inválida");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }

        if (this.mes == 2)
        {
            if (verificaAnoBissexto())
            {
                if (this.dia >= 1 && this.dia <= 29)
                {
                    this.dia = dia;
                }
                else
                {
                    System.out.println("Erro! Data inválida");
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 2000;
                }
        
            }
            else
            {
                if (this.dia <= 28)
                {
                    this.dia = dia;
                }
                else
                {
                    System.out.println("Erro! Data inválida");
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 2000;
                }
            }
        }
        else
        {
            if (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11)
            {
                if (this.dia <= 30)
                {
                    this.dia = dia;
                }
                else
                {
                    System.out.println("Erro! Data inválida");
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 2000;
                }
            }
            else
            {
                if (this.dia <= 31)
                {
                    this.dia = dia;
                }
                else
                {
                    System.out.println("Erro! Data inválida");
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 2000;
                }
            }
        }

    }
    
    public boolean verificaAnoBissexto()
    {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int getDia() 
    {
        return dia;
    }

    public void setDia(int dia) 
    {
        this.dia = dia;
    }

    public int getMes() 
    {
        return mes;
    }

    public void setMes(int mes) 
    {
        this.mes = mes;
    }

    public int getAno() 
    {
        return ano;
    }

    public void setAno(int ano) 
    {
        this.ano = ano;
    }

    public String toString() 
    {
        return "Data: Dia: " + dia + ", Mês: " + mes + ", Ano: " + ano;
    }

    
}   