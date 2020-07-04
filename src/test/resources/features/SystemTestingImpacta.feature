Feature: System Testing Impacta QA

  Background:
    Given the user is on Agapito server page
    And the user clicks Process menu in left side

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

  @ignore
  Scenario: Create an user IGNORE
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

  Scenario: create and read an user
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

    And the user is on Agapito server page
    And the user clicks Process menu in left side
    And the user clicks on show button
    Then the user should see numero processo with value equal "43243"

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

    And the user is on Agapito server page
    And the user clicks Process menu in left side
    And the user clicks on editar button
    And the user fills the Partes input "Cassio x Amanda x Diego"
    And the user fills the numero processo input "4324389080"
    And the user clicks on Register new Processo
    And the user should see "Processo atualizado com sucesso." message
    And the user is on Agapito server page
    And the user clicks Process menu in left side
    And the user clicks on show button
    Then the user should see numero processo with value equal "4324389080"

  Scenario: create and delete an user
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

    And the user is on Agapito server page
    And the user clicks Process menu in left side
    And the user clicks on delete button
    And the user confirms delete
    Then the user should not see last process code

  Scenario Outline: try to create process with invalid input #<descricao>
    And the user clicks on Novo Processo Button
    And the user fills the vara input "<vara>"
    And the user fills the numero processo input "<numeroProcesso>"
    And the user fills the Natureza input "<natureza>"
    And the user fills the Partes input "<partes>"
    And the user fills the Select input "<urgente>"
    And the user fiils the Radio input "<arbitragem>"
    And the user fills the assistente social input "<assistenteSocial>"
    And the user fills the data entrada input "<dataEntrada>"
    And the user fills the data saida input "<dataSaida>"
    And the user fills the data agendamento input "<dataAgendamento>"
    And the user fills the status input "<status>"
    And the user fills the observacao input "<observacao>"
    And the user clicks on Salvar new Processo
    Then the user should see in the same page "<tipoMensagem>" message

    Examples:
      | descricao | vara    | numeroProcesso | natureza | partes          | urgente | arbitragem | assistenteSocial | dataEntrada | dataSaida  | dataAgendamento | status    | observacao      | tipoMensagem                                |
      | sem vara  |         | 11223          | Divorcio | Cassio X Amanda | S       | S          | John Dee         | 25/12/2019  | 01/01/2020 | 01/05/2019      | Concluido | nada a declarar | Vara não pode ser deixado em branco         |
      | sem data  | crianca | 11223          | Divorcio | Cassio X Amanda | S       | S          | John Dee         |             | 01/01/2020 | 01/05/2019      | Concluido | nada a declarar | Data entrada não pode ser deixado em branco |

