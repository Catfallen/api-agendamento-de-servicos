# Importação do projeto

Editor de codigo: Eclipse

1 - abrir área de trabalho do spring boot

2 - No campo arquivo clique em importar

3 - Na pasta Maven selecione "Existing Maven Projects"

4 - Clique em next

5 - Em diretório raiz clique em pesquisar

6 - selecione o projeto do git


# Importação banco de dados

Banco de dados: Postgres

Gerenciador: pgadmin

1. Criar um novo banco de dados chamado web
2. Importar query usando o arquivo estrutura.sql do repositório


# Configurar banco de dados na API

1. Abrir arquivo DatabaseConfig.java no seguinte diretorio: api-agendamento-de-servicos/apiAgendamento/src/main/java/com/api/agendamento/DatabaseConfig.java

2.  dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:sua porta/nome do banco"); ex: jdbc:postgresql://localhost:5432/web
        dataSource.setUsername("postgres"); // "seu usuario"
        dataSource.setPassword("senha do banco")


# Teste de conexão
1. Abrir arquivo TestDatabaseConnection.java: api-agendamento-de-servicos/apiAgendamento/src/main/java/com/api/agendamento/TestDatabaseConnection.java

2. String url = "jdbc:postgresql://localhost:5432/web"; // URL do banco de dados
        String user = "postgres"; // Nome de usuário
        String password = ""; // Senha do banco

3. Executar arquivo


# Executar aplicação
1. Executar arquivo api-agendamento-de-servicos/apiAgendamento/src/main/java/com/api/agendamento/ApiAgendamentoApplication.java


# Documentação da api agendamentos
https://www.postman.com/catfallen/workspace/api-agendamento/collection/39101470-f2e90053-c0ba-4f9b-b121-9576aae516e7?action=share&creator=39101470

