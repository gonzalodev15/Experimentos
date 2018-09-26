Feature: Gestion de Usuario
	Como Usuario necesito gestionar una mi cuenta
	
Scenario: Iniciar_Sesion Usario
	Given despues de iniciar la aplicacion
	When se muestra la pantalla de Login
	And en la nueva pantalla escribo en el campo Email el valor de "Daniel_Dedios@yupanqui.rivas.pe"
	And en la nueva pantalla escribo en el campo Password el valor incorrecto de "danielaragon"
	And hago click en el boton de Inicar Sesión Registrar usuario
	Then el sistema me mostrara el mensaje de "Correo o contraseña incorrecta"
	
Scenario: Iniciar_Sesion Usario_2
	Given despues de iniciar la aplicacion
	When se muestra la pantalla de Login
	And en la nueva pantalla escribo en el campo Email valor incorrecto de"Danie_Dedios@yupanqui.rivas.pe"
	And en la nueva pantalla escribo en el campo Password  valor de "Danielaragon"
	And hago click en el boton de Inicar Sesión Registrar usuario
	Then el sistema me mostrara el mensaje de "Correo o contraseña incorrecta"
	
Scenario: Iniciar_Sesion Usario_3
	Given despues de iniciar la aplicacion
	When se muestra la pantalla de Login
	And en la nueva pantalla escribo en el campo Email valor de"Daniel_Dedios@yupanqui.rivas.pe"
	And en la nueva pantalla escribo en el campo Password valor de "Danielaragon"
	And hago click en el boton de Inicar Sesión Registrar usuario
	Then el sistema me mostrara la vista de Videoteca

Scenario: Registrar User_4
	Given despues de iniciar la aplicacion
	When hago click en el enlace de Registrar usuario
	And en la nueva pantalla escribo en el campo Email el valor de "Luis_Gonzalo_Olivera@upc.edu.pe"
	And en la nueva pantalla escribo en el campo Password el valor de "HolaMundo"
	And en la nueva pantalla escribo en el campo Confirm_Password el valor de "HolaMundo"
	And en la nueva pantalla escribo en el campo Firstname el valor de "Luis"
	And hago click en el boton de Terminar
	Then el sistema me mostrara el mensaje Regisrar usuario de "Correo electrónico ya en uso"
	
	
Scenario: Registrar User_5
		Given despues de iniciar la aplicacion
	When hago click en el enlace de Registrar usuario
	And en la nueva pantalla escribo en el campo Email el valor de "Luis_Gonzalo_Oliveira@upc.edu.pe"
	And en la nueva pantalla escribo en el campo Password el valor de "ab12"
	Then el sistema inserta el siguente mensaje debajo del campo "Contraseña - Debil"
	And en la nueva pantalla escribo en el campo Confirm_Password el valor de "ab12"
	And en la nueva pantalla escribo en el campo Firstname el valor de "Luis"
	And hago click en el boton de Terminar
	Then el sistema me mostrara el mensaje Regisrar usuario de "Algunos campos son invalidos"
	
Scenario: Registrar User_6
		Given despues de iniciar la aplicacion
	When hago click en el enlace de Registrar usuario
	And en la nueva pantalla escribo en el campo Email el valor de "Luis_Gonzalo_Oliveira@upc.edu.pe"
	And en la nueva pantalla escribo en el campo Password el valor de "THgf174G82"
	And en la nueva pantalla escribo en el campo Confirm_Password el valor de "THfgksdjs"
	Then el sistema inserta el siguente mensaje debajo del campo "Las contraseñas no coinciden"
	And en la nueva pantalla escribo en el campo Firstname el valor de "Luis"
	And hago click en el boton de Terminar
	Then el sistema me mostrara el mensaje Regisrar usuario de "Algunos campos son invalidos"

	
	
	