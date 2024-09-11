public class Principal {
    
    public static void main(String[] args) 
    {
        
        int menu = 0;
        Data dataAtual = new Data(20,10,2023);

        while (menu != 3)
        {
            System.out.println("(1) Criar uma loja ");
            System.out.println("(2) Criar um produto ");
            System.out.println("(3) Sair ");
            menu = Teclado.leInt("Digite a opção desejada: ");

            if (menu == 1)
            {
                Loja loja1 = new Loja();
                String nomeLoja = Teclado.leString("Digite o nome da loja: ");
                int quantidadeFuncionarios = Teclado.leInt("Digite o número de funcionários: ");
                int salarioBaseFuncionario = Teclado.leInt("Digite o salário base dos seus funcionarios: ");

                Endereco enderecoDaLoja = new Endereco();
                String nomeDaRua = Teclado.leString("Digite o nome da rua da loja: ");
                String cidade = Teclado.leString("Digite a cidade da loja: ");
                String estado = Teclado.leString("Digite o Estado da loja: ");
                String pais = Teclado.leString("Digite o país da loja: ");
                String cep = Teclado.leString("Digite o CEP da loja: ");
                String numero = Teclado.leString("Digite o numero da loja: ");
                String complemento = Teclado.leString("Digite o complemento da loja: ");
                enderecoDaLoja.setNomeDaRua(nomeDaRua);
                enderecoDaLoja.setCidade(cidade);
                enderecoDaLoja.setEstado(estado);
                enderecoDaLoja.setPais(pais);
                enderecoDaLoja.setCep(cep);
                enderecoDaLoja.setNumero(numero);
                enderecoDaLoja.setComplemento(complemento);

                Data dataFundacao = new Data();
                int ano = Teclado.leInt("Digite o ano de fundação da loja: ");
                int mes = Teclado.leInt("Digite o mês de fundação da loja: ");
                int dia = Teclado.leInt("Digite o dia de fundação da loja: ");
                dataFundacao.setDia(dia);
                dataFundacao.setMes(mes);
                dataFundacao.setAno(ano);

                loja1.setNome(nomeLoja);
                loja1.setQuantidadeFuncionarios(quantidadeFuncionarios);
                loja1.setSalarioBaseFuncionario(salarioBaseFuncionario);
                loja1.setEndereco(enderecoDaLoja);
                loja1.setDataFundacao(dataFundacao);
            }

            if (menu == 2)
            {
                Produto produto1 = new Produto();
                String nomeProduto = Teclado.leString("Digite o nome do produto: ");
                int preco = Teclado.leInt("Digite o preço do produto: ");

                Data dataProduto = new Data();
                int ano = Teclado.leInt("Digite o ano de validade do produto: ");
                int mes = Teclado.leInt("Digite o mes de validade do produto: ");
                int dia = Teclado.leInt("Digite o dia de validade do produto: ");
                dataProduto.setAno(ano);
                dataProduto.setMes(mes);
                dataProduto.setDia(dia);

                produto1.setNome(nomeProduto);
                produto1.setPreco(preco);
                produto1.setDataValidade(dataProduto);

                produto1.estaVencido(dataAtual);
                if (produto1.estaVencido(dataAtual) == true)
                {
                    System.out.println("Produto vencido!");
                }
                else
                {
                    System.out.println("Produto NÃO vencido!");
                }
            }

            if (menu == 3)
            {
                break;
            }
            
            if ((menu > 3) || (menu <= 0))
            {
                System.out.println("Opção inválidada! Tente novamente");
                menu = 0;
                System.out.println();
                System.out.println("(1) Criar uma loja ");
                System.out.println("(2) Criar um produto ");
                System.out.println("(3) Sair ");
                menu = Teclado.leInt("Digite a opção desejada: ");
            }
        }
    }
    
}
