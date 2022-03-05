#language: en
  Feature: Prueba de servicios en bloque Order

    Scenario: Creacion, consulta y eliminacion de order

      When creo y consulto una orden
      Then luego la elimino