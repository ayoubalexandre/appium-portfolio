Feature: Testar operação de soma calculadora

  Scenario Outline: Somar dois numeros inteiros positivos
    Given a calculadora está aberta
    When eu digitar o primeiro "<numero1>"
    And clicar no sinal de soma
    And digitar o segundo "<numero2>"
    And clicar no sinal de igual
    Then o sistema deve retornar a soma dos numeros como "<resultado>"
    Examples:
      | numero1 | numero2 | resultado |
      | 1       | 2       | 3         |
      | 1000    | 500     | 1500      |

  Scenario Outline: Somar dois numeros inteiros um positivo e um negativo
    Given a calculadora está aberta
    When eu clicar no sinal de subtração
    And eu digitar o primeiro "<numero1>"
    And clicar no sinal de soma
    And digitar o segundo "<numero2>"
    And clicar no sinal de igual
    Then o sistema deve retornar a diferença dos numeros como "<resultado>"
    Examples:
      | numero1 | numero2 | resultado |
      | 5       | 6       | 1         |
      | 10      | 5       | -5        |