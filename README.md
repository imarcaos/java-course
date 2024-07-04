# Curso Java - Programação Orientada a Objetos

 Estes são apontamentos pessoais de um Curso de Java que serve para minha revisão, visto o último contato que tive com Java ter sido em 2006. Aproveito todos os códigos e update do Readme para praticar o uso do Git.
 
 Logs: 
 2024-06-22 - Estou reorganizando meu Readme e códigos e aproveitando para testar o IntelliJ, depois de uma longa data de uso o Eclipse e um pouco de Netbeans na faculdade e em uma formação no IEFP.

 Os exercícios e explicações serão comentados no próprio código.

 - Seção 01 - Introdução
    - A1 - Introdução e Visão Geral do Curso
    - A2 - Mapa de Estudos da Carreira Java

- Seção 02 - Conceitos de Programação
    - A03 - Visão Geral do capítulo
    - A04 - Material de Apoio
    - A05 - Algoritmo, Automação, Programa de Computador
    - A06 - O que é preciso para fazer um programa de computador
    - A07 - Linguagem de programação léxica e sintática.
    - A08 - IDE - Ambiente Integrado de Desenvolvimento
    - A09 - Compilação, interpretação, código fonte, código objeto, máquina virtual

- Seção 03 - Introdução a Linguagem Java
    - A10 - Visão geral do capítulo
    - A11 - Material de apoio
    - A12 - Entendendo as versões do Java
    - A13 - Histórico e edições do Java
    - A14 - JDK/JVM - Máquina virtual do Java
    - A15 - Estrutura de uma aplicação Java
    - A16 - Instalando o Java JDK 
    - A17 - Instalando o Eclipse
    - A18 - Primeiro programa em Java

- Seção 04 - Estrutura Sequencial
    - A19 - Visão Geral do capítulo
    - A20 - Material de Apoio
    - A21 - Expressões Aritméticas
    - A22 - Variáveis e tipos básicos em Java
    - A23 - As três operações básicas da programação
    - A24 - Saída de dados em Java
    - A25 - Processamento de dados em Java, Casting
    - A26 - Entrada de dados em Java, Pt1
    - A27 - Entrada de dados em Java, Pt2
    - A28 - Funções Matemática em Java
    - A29 - Exercícios para iniciantes Pt1 - Explicação
    - A30 - Execícios para iniciantes PT2 - Recursos

- Seção 05 - Estrutura Condicional
    - A31 - Visão geral do capítulo
    - A32 - Material de apoio
    - A33 - Expressões comparativas (>, <, >=, <=, ==, !=)
    - A34 - Expressões Lógicas (&&, ||, !)
    - A35 - Estrutura condicional (if-else)
    - A36 - Exercícios para iniciantes Pt2 - Explicação
    - A37 - Exercícios para iniciantes Pt2 - Recursos
    - A38 - Sintaxe Opcional - operadores de atribuição cumulativa (+=, -=, *=, /=, %=)
    - A39 - Sintaxe Opcional - switch-case
    - A40 - Expressão condicional ternária
        - ex: `(condição) ? valor_se_verdadeiro : valor_se_falso`
    - A41 - Escopo e Inicialização
        - se a variável é global ou local e inicialização antes da sua chamada.

- Seção 06 - Estrutura Repetitivas
    - A42 - Visão Geral do capítulo
    - A43 - Material de apoio
    - A44 - Como utilizar o Debug no Eclipse (execução passo a passo)
    - A45 - Estrutura repetitiva while
    - A46 - Teste de mesa com estrutura repetitiva while (manual no papel)
    - A47 - Exercícios de teste de mesa com while
    - A48 - Exercícios para iniciantes Pt3 - explicação
    - A49 - Exercícios para iniciantes Pt3 - recursos
    - A50 - Estrutura repetitiva for
    - A51 - Teste de mesa para estrutura repetitiva for
    - A52 - Exercícios de testes de mesa com for
    - A53 - Exercícios para iniciantes Pt4 - explicação
    - A54 - Exercícios para iniciantes Pt4 - recursos
    - A55 - Estrutura repetitiva do-while

- Seção 07 - Outros Tópicos Básicos sobre Java
    - A56 - Material de apoio
    - A57 - Restrições e convenções para nomes
    - A58 - Operadores bitwise
    - A59 - Funções interessantes para String
    - A60 - Comentários em Java (básico)
    - A61 - Funções (sintaxe)

- Seção 08 - Introdução a Programação Orientação a Objetos
    - A62 - Visão geral do capítulo
    - A63 - Material de Apoio
    - A64 - Resolvendo um problemas sem Orientação a Objetos
    - A65 - Classe com três atributos para o Triângulo
    - A66 - Métodos para aproveitar código e delegar responsabilidades
    - A67 - Resolvendo um segundo problema - Estoque de produto
    - A68 - Object e toString
        - Por exemplo, podemos sobrepor o método toString da Classe Object do Java, reescrevendo da forma que necessitamos:
    ``` .java
    public String toString() {
            return name
                    + ", $ "
                    + String.format("%.2f", price)
                    + ", "
                    + quantity
                    + " units, Total: $ "
                    + String.format("%.2f", totalValueInStock());
    }
    ```
    - A69 - Finalizando o programa
    - A70 - Exercícios de Fixação
        - ex1: Calcular o Área, Perímetro e Diagonal de um Retângulo.
        - ex2: Calcular o Salário de um funcionário.
        - ex3: Verificar se o Aluno foi validado (média das notas)
    - A71 - Membros estáticos Pt1
        - Instanciar membros de uma classe estática de outra classe não estática
    - A72 - Membros estáticos Pt2
        - Instanciar membros de uma classe estática de outra classe estática
    - A73 - Exercícios de fixação        
        - ex4: Conversão de moedas com taxa estática

- Seção 09 - Construtores, this, sobrecarga e encapsulamento.
    - A74 - Visão Geral do Capítulo
    - A75 - Material de Apoio
    - A76 - Construtores
    - A77 - Palavra this
    - A78 - Sobrecarga
    - A79 - Encapsulamento
    - A80 - Gerando automaticamente construtores, getters e setters (Eclipse)
    - A81 - Modificadores de Acesso
    - A82 - Exercícios de fixação - Bank Account
    - A83 - Correção do exercício de fixação Pt1
    - A84 - Correção do exercício de fixação Pt2

- Seção 10 - Comportamento de memória, arrays e listas.
    - A85 - Visão Geral do Capítulo
    - A86 - Material de Apoio
    - A87 - Tipos referência vs tipo valor
    - A88 - Deslocações de memória - garbage collector e escopo local
    - A89 - Vetores Pt1
    - A90 - Vetores Pt2
    - A91 - Exercícios de Fixação sobre vetores - a91_ex1_boarding_house
    - A92 - Correção do exercício Negativos
    - A93 - Correção do exercício Alturas
    - A94 - Desafio sobre o Pensionato (Boarding House)
    - A95 - Correção sobre vetores Pensionato (Boarding House)
    - A96 - Boxing, unboxing e wrapper classes
    - A97 - Laço for each
    - A98 - Listas Pt1
    - A99 - Listas Pt2
    - A100 - Exercício proposto
    - A101 - Correção em vídeo do exercício proposto.
    - A102 - Matrizes
    - A103 - Exercício resolvido
    - A104 - Exercício proposto - Criar um Matriz M x N - a104_ex1_Matrizes_MxN


 - Seção 11 - Trabalhando com 'Date' (SimpleDateFormat, Calendar)
 - Seção 12 - Aula sobre Git, principais comandos (status, add, commit, push, gitignore, ...)
 - Seção 13 - Enumerações e Composição
 - Seção 14 - Herança e Polimorfismo
 - Seção 15 - Tratamento de Exceções
 - Seção 16 - Jogo de Xadres - aplicando tudo que foi estudado até a seção 15
 - Seção 17 - Trabalhando com Arquivos
 - Seção 18 - Interfaces
 - Seção 19 - Generics, Set, Map
 - Seção 20 - Expressão Funcional e expressões Lambda
 - Seção 21 - Acesso a Banco de Dados com JDBC
 - - Instalação do MySQL e do MySQL WorkBench
 - Seção 22 - Java EE - Mapeando objeto-relacional com JPA / Hibernate
 - - <a href="https://www.youtube.com/watch?v=gBZ9kh3r2Lg">Instalação da IDE STS no Linux (Ubuntu e derivados)<a>
 - - <a href="https://www.youtube.com/watch?v=CoEZ53Qim8E">Instalação do PostMan (Ubuntu e derivados)<a>
 - - Instalação do Xammp para usar MySqlDB e PhpMyAdmin
 - Seção 23 - Projeto: Web Services com Spring Boot e JPA/Hibernate
 - - Instalação do PostgreSQL e Utilização do Heroku (versão gratuita do Heroku não está mais disponível - não utilizei)
 - Seção 24 - JProject API Restful with Spring Boot and MongoDB (WebServices + NoSQL)
 - - Instalação do MongoDB e MongoDB Compass
 - Seção 25 - Interface Gráfica com JavaFX
 - - Instalação do Scene Builder
 - - Preparação do Eclipse - configuração do caminho SceneBuilder executable no Linux (/opt/scenebuilder/bin/SceneBuilder)
 - Fim do Curso

 
