Feature: System Testing Impacta QA

  Background:
    Given the user is on Agapito server page
    And the user clicks Process menu in left side

#    CREATE
  Scenario: Create an user
    And the user clicks on Novo Processo Button
    And the user fills the vara input "432"
    And the user fills the numero processo input "43243"
    And the user fills the Natureza input "Divorcio"
    And the user fills the Partes input "Cassio x Amanda"
    And the user fills the Select input "S"
    And the user fiils the Radio input "S"
    And the user fills the assistente social input "Diego"
    And the user fills the data entrada input "20/10/2020"
    And the user fills the data saida input ""
    And the user fills the data agendamento input ""
    And the user fills the status input "concluido"
    And the user fills the observacao input "nada a declarar"
    And the user clicks on Register new Processo
    Then the user should see "Processo foi criado com sucesso." message

  Scenario: create and update an user
    And the user clicks on Novo Processo Button
    And the user fills the vara input "432"
    And the user fills the numero processo input "43243"
    And the user fills the Natureza input "Divorcio"
    And the user fills the Partes input "Cassio x Amanda"
    And the user fills the Select input "S"
    And the user fiils the Radio input "S"
    And the user fills the assistente social input "Diego"
    And the user fills the data entrada input "20/10/2020"
    And the user fills the data saida input ""
    And the user fills the data agendamento input ""
    And the user fills the status input "concluido"
    And the user fills the observacao input "nada a declarar"
    And the user clicks on Register new Processo
    And the user should see "Processo foi criado com sucesso." message

    And the user clicks on editar button
    And the user fills the Partes input "Cassio x Amanda x Diego x Ronaldo"
    And the user should see "Processo atualizado com sucesso." message

