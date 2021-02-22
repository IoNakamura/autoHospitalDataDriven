#language:en
Feature:
  yo como administrador del hospital
  deseo registrar un doctor al sistema
  para ver un doctor en el sistema

  Scenario Outline: Registrar un doctor en el sistema de administracion del hospital
    Given que Christian esta en la pagina del hospital
    When el intenta registrar el doctor
      | Nombre   | Apellido   | Telefono   | documentoID   |
      | <Nombre> | <Apellido> | <Telefono> | <documentoID> |
    Then el vera el mensaje Datos guardados correctamente.

    Examples:
      | IdCaso | Nombre | Apellido | Telefono | documentoID |
##@externaldata@./src/test/resources/datadriven/Administracion_Hospital.xlsx@DataDoctor@3
      | 3      | Dina   | Franco   | 1111011  | 11103330    |
