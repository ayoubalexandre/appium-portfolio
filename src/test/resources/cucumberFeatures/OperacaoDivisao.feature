Feature: Testar operação de divisão calculadora

  Scenario Outline: Dividir dois números inteiros positivos
    Given que a calculadora está aberta
    When eu digitar o primeiro "<numero1>"
    And clicar no sinal de divisão
    And digitar o segundo "<numero2>"
    And clicar no sinal de igual
    Then o sistema deve retornar a divisão dos números como "<resultado>"
    Examples:
      | numero1 | numero2 | resultado                       |
      | 100     | 5       | 20                              |
      | 2       | 10      | 0.2                             |
      | 50      | 0       | Não é possível dividir por zero |

  Scenario Outline: Dividir dois números sendo um inteiro e um decimal
    Given que a calculadora está aberta
    When eu digitar o primeiro "<numero1>"
    And clicar no sinal de divisão
    And digitar o segundo "<numero2>"
    And clicar no sinal de igual
    Then o sistema deve retornar a divisão dos números como "<resultado>"
    Examples:
      | numero1 | numero2 | resultado |
      | 10      | 0.2     | 50        |
      | 0.3     | 100     | 0.003     |