Feature: Testar operação de multiplicação da calculadora

  Scenario Outline: Multiplicar dois números inteiros
    Given que a calculadora está aberta
    When eu digitar o primeiro "<numero1>"
    And clicar no sinal de multiplicação
    And digitar o segundo "<numero2>"
    And clicar no sinal de igual
    Then o sistema deve retornar a multiplicação dos números como "<resultado>"
    Examples:
      | numero1 | numero2 | resultado |
      | 50      | 4       | 200       |
      | -5      | -1      | 5         |