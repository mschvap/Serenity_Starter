Feature: Verificar suscripcion enviada a correo

  Scenario: Realizar login y verificar suscipcion

    Given Juan ingresa a la pagina de yopmail
    When Juan ingresa "pruebaselectoriframe@yopmail.com" electronico
    Then verifica recepcion de correo electronico