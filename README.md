# Projeto Final de Laboratório I

Este projeto foi desenvolvido como parte do desafio final da disciplina de Laboratório I na faculdade. O objetivo era criar um sistema de gerenciamento de lojas e produtos, dividido em quatro etapas, cada uma adicionando novas funcionalidades e complexidade ao projeto.

## 📂 Estrutura do Projeto

O projeto está organizado em quatro diretórios principais, cada um correspondendo a uma etapa do desenvolvimento:

1. **Etapa1 - Criação de Classes**: Foram criadas as classes básicas (`Data`, `Endereco`, `Loja`, `Produto`) e um validador para testar a implementação.
2. **Etapa2 - Associação entre Classes**: As classes foram aprimoradas para incluir associações entre elas, como a loja ter um endereço e uma data de fundação, e o produto ter uma data de validade.
3. **Etapa3 - Herança e Polimorfismo**: Foram criadas subclasses de `Loja` (`Alimentacao`, `Bijuteria`, `Cosmetico`, `Informatica`, `Vestuario`) para representar diferentes tipos de lojas, utilizando herança e polimorfismo.
4. **Etapa4 - Arrays**: Introduziu o uso de arrays para gerenciar estoques de produtos em lojas e a criação de uma classe `Shopping` que gerencia um conjunto de lojas.

## 🚀 Como Executar o Projeto

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/FranciscoGoyaAMC/EstudosJava.git
   ```
2. **Navegue até o diretório da etapa desejada**:
   ```bash
   cd nome-do-repositorio/Etapa-1.-Criacao-de-Classes
   ```
3. **Compile e execute o código**:
   ```bash
   javac *.java
   java ValidadorEtapa1
   ```
4. **Repita os passos 2 e 3 para as outras etapas**, substituindo `Etapa-1.Criacao-de-Classes` e `ValidadorEtapa1` pelos nomes correspondentes.

## 📌 Classes Principais

- **`Data`**: Representa uma data com dia, mês e ano, incluindo validação de datas e verificação de ano bissexto.
- **`Endereco`**: Representa um endereço completo, incluindo rua, cidade, estado, país, CEP, número e complemento.
- **`Loja`**: Representa uma loja com nome, quantidade de funcionários, salário base, endereço, data de fundação e estoque de produtos.
- **`Produto`**: Representa um produto com nome, preço e data de validade.
- **`Shopping`**: Gerencia um conjunto de lojas, permitindo adicionar, remover e consultar lojas por tipo.

## ✅ Validação

Cada etapa possui um validador (`ValidadorEtapaX.java`) que testa a implementação das classes e métodos desenvolvidos. O validador verifica se todas as funcionalidades estão funcionando conforme o esperado.

## 🤝 Contribuições

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, sinta-se à vontade para abrir uma *issue* ou enviar um *pull request*.

---

📌 Desenvolvido por **[Francisco Goya]** como parte do curso de **[Análise e Desenvolvimento de Sistemas]** na **[UNISINOS]**.
