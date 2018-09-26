Feature: Manteiemineto de Categoria
Como jefe de almacen necesito realizar la gestion de categorias

Scenario: Registrar Categoria
	Given despues de iniciar sesion e la aplicacion
	When hago click en el enclace de mantenimiento de categorias
	And luego hago clic en el boton de Nuevo
	And en la nueva pantalla escrio en el campo Nombre el valor de "Chocolates"
	And presiono el boton de Guardar
	Then el sistema me mostrara el emensaje de "Se guardo correctamente la Categoia"
	
Scenario: Actualizar Categoria
	Given despues de iniciar sesion en la aplicacion
	When hago clic e el enlace de Mantenimiento de Categoria
	And busco la categoria "Chocolates" para selecciona de la tabla de Categorias
	And hago clic en el boton Ediar
	And en la nueva pantalla escribo de nombre de "Lacteos"
	And presiono el boton de Actualizar
	Then el sistema me motrara el emensaje de "Se actualizo correctamente la Categoia"