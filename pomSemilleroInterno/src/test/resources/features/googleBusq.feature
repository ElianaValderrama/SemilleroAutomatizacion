#language: en
  Feature: Busqueda exitosa con datos extraidos de un xlsx

    Scenario: Seleccionar productos en linio

      Given que me encuentro en el buscador de google
      When llamo datos de mi archivo xlsx
      Then hace la busqueda y me muestra resultados