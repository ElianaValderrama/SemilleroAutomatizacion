#language: en
  Feature: Busqueda exitosa con datos extraidos de un xls

    Scenario: Buscar en google

      Given que me encuentro en el buscador de google
      When llamo datos de mi archivo excel
      Then hace la busqueda y me muestra resultados