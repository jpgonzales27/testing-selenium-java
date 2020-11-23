Feature:Categoria Comics
  Como usuario quiero leer chistes de testers

  Scenario: Ingresar a la categoria comics desde el home
    Given El usuario se encuentra el pagina de home
    When Cuando el usuario hace click en  THE LITTLE TESTER COMICS
    Then Se debe redirigir a la pantalla comics