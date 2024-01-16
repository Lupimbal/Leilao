Sistema de Leilões

Este é o repositório do Sistema de Casa de Leilões, um software informatizado desenvolvido para modernizar e otimizar as rotinas de uma casa de leilões renomada.

## Processo de Versionamento Utilizando o GitHub

Aqui detalhamos o processo de versionamento do projeto utilizando o Git e o GitHub, conforme as práticas de segurança e qualidade de software exigidas pela empresa.

### 1. Iniciação do Repositório Local

Um repositório local foi criado utilizando o Git Bash com o seguinte comando:

```bash```

git init
Este comando inicializou um novo repositório Git na pasta local do projeto.


 Todos os arquivos do projeto foram adicionados ao registro de commit com o comando:
 git add .
 O primeiro commit foi feito com a descrição "Projeto inicial", marcando o início oficial do versionamento do projeto:
 Foi criado um repositório no GitHub através da interface web do GitHub, que será usado para armazenar a versão remota do nosso projeto.
 O repositório local foi vinculado ao remoto com o comando:
 git remote add origin https://github.com/Lupimbal/Leil-o.git
 Os arquivos foram enviados (push) para o GitHub com o seguinte comando:
 git push -u origin main

Tecnologias Utilizadas
Java: Linguagem de programação escolhida para o desenvolvimento do sistema
MySQL: Sistema de gerenciamento de banco de dados utilizado para armazenar os dados dos leilões e usuários.
Git: Ferramenta de controle de versão adotada para gerenciamento das mudanças no código-fonte do projeto.