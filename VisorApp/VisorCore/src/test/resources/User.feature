Feature: Gestion de Usuario
	Como Usuario necesito gestionar una mi cuenta
	
Scenario: Registrar User
	Given despues de iniciar la aplicacion
	When hago click en el enlace de Registrar
	And en la nueva pantalla escribo en el campo Firstname Registrar el valor de "Daniel"
	And en la nueva pantalla escribo en el campo LastName Registrar el valor de "Aragon"
	And en la nueva pantalla escribo en el campo Email Registrar el valor de "Daniel_Dedios@yupanqui.rivas.pe"
	And en la nueva pantalla escribo en el campo Password Registrar el valor de "danielaragon"
	And hago click en el boton de Finalizar Registrar
	Then el sistema me mostrara el mensaje Regisrar de "Usted se registro exitosamente"
	
Scenario: Actualizar User 
	Given despues de iniciar sesion en la aplicacion
	When hago click en el enlace de Configuracion de User
	And busco el Firstname Registrar y escribo el valor de "Eduardo" 
	And hago click en el boton de Guardar cambios Registrar
	Then el sistema me mostrara el mensaje Registrar de "Se actualizo correctamente los valores de registro"
	
