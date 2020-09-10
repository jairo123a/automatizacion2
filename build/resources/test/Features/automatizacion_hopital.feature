Feature: Realizar el registro en el sitio web hospital y verificar el registro

 @Caso1
  Scenario: realizar el registro de un doctor
    Given Ingresar a la pagina  del sistema de administracion de hospitales
    When  Ingresar al menu agregar doctor y crear un nuevo registro
     |Nombre|Apellido | Telefono |Tipo documento      | Numero de documento |
     | jairo|henao    |3013996019|Cédula de ciudadanía|37                 |
    Then  Verificar el mensaje de ingreso exitoso del registro "Datos guardados correctamente."

  @Caso2
  Scenario: realizar el registro de un paciente
    Given Ingresar a la pagina  del sistema de administracion de hospitales
    When  Ingresar al menu agregar paciente y crear un nuevo registro
      |Nombre|Apellido | Telefono |Tipo documento      | Numero de documento |
      | juan |perez    |3013996019|Cédula de ciudadanía|37                   |
    Then  Verificar el mensaje de ingreso exitoso del registro "Datos guardados correctamente."

  @Caso3
  Scenario: registrar un cita .
    Given Ingresar a la pagina  del sistema de administracion de hospitales
    When  Ingrese al menú AGENDAR CITA y crear un nuevo registro
      |Fecha cita |Documento paciente | Documento doctor|observacion          |
      | 10/09/2020|37                 |37               |una cita automatizada|
    Then  Verificar el mensaje de ingreso exitoso del registro "Datos guardados correctamente."