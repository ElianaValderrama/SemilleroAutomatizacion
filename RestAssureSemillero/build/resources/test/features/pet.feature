#language: en
Feature: Prueba de servicios en bloque Pet

  Scenario: Creacion, consulta y eliminacion de Pet

    When creo y consulto un Pet
    Then luego la elimino el Pet