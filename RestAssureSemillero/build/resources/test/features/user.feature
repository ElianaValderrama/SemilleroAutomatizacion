#language: en
Feature: Prueba de servicios en bloque User

  Scenario: Creacion, consulta y eliminacion de User

    When creo y consulto un User
    Then luego la elimino el User