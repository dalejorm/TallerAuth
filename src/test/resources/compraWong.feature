Feature: Navegar al sitio y visualizaremos el home.

  Scenario: Navegacion a home de wong
    Given que el usuario ingresa al home
    When el visualiza el menu superior
    Then el deberia visualizar la barra de busqueda

  Scenario Outline: Buscar un producto en wong
    Given que el usuario ingresa al home
    When el visualiza el menu superior
    Then el deberia visualizar la barra de busqueda
    And buscar un <product> en la tienda <test>
    Examples:
      |product|test|
      |"Pan de yuca"|"valor de prueba"|
