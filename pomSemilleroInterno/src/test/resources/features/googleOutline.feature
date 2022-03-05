#language: en
Feature: Visualizar correo electronico

  Scenario Outline: <Escenario><busqueda><Url>
    Given que me encuentro en el buscador de google
    When quiero buscar animales<busqueda> y enviarlos
    Then hago login y los busco<validacion>

    Examples:
      | Escenario          | busqueda  | Url                                | correo                  | contra        | validacion         |
      | Ingresar al correo | Oso pardo | https://www.google.com/?gws_rd=ssl | pruebasqa2030@gmail.com | semillero2030 | Ursus arctos       |
      | Ingresar al correo | Tigrillos | https://www.google.com/?gws_rd=ssl | pruebasqa2030@gmail.com | semillero2030 | Leopardus tigrinus |