Feature: Gestionar Videoteca
	Como usuario necesito actualizar mi videoteca
	
Scenario: Registrar Playlist
	Given despues de iniciar sesion en la aplicacion
	When hago click en el enlace de Gestionar Videoteca
	And luego hago click en el boton de Nueva Playlist
	And en la nueva pantalla escribo en el campo Nombre Playlist el valor de "Playlist 1234"
	And en la nueva pantalla escribo en el campo Descripcion Producto el valor de "mi descripcion 1234"
	And en la nueva pantalla clickeo en el boton de Producto Favorito para agregarlo como favorito
	And presiono el boton de Guardar Playlist
	Then el sistema me mostrara el mensaje Playlist de "Se guardo correctamente la Playlist"
	
Scenario: Actualizar Playlist 
	Given despues de iniciar sesion en la aplicacion
	When hago click en el enlace de Gestionar Videoteca
	And busco el producto "Playlist 1234" para seleccionarla de la tabla de Playlist
	And hago click en el boton de Editar Playlist
	And en la nueva pantalla escribo la descripcion del Producto como "mi nueva descripcion 1234"
	And presiono el boton de Guardar Playlist
	Then el sistema me mostrara el mensaje Playlist de "Se actualizo correctamente la Playlist"

Scenario: Eliminar Playlist
	Given despues de iniciar sesion en la aplicacion
	When hago click en el enlace de Gestionar Videoteca
	And busco el producto "Playlist 1234" para seleccionarla de la tabla de Playlist
	And hago click en el boton de Eliminar Playlist
	Then el sistema me mostrara el mensaje Playlist de "Se elimino correctamente la Playlist"
	
#Se evaluará como el sistema responde ante la situación de que el usuario modifique el orden de un ítem Playlist que no se encuentra en las posiciones limites de la lista.
Scenario: Mover Playlist A
	Given despues de iniciar sesion en la aplicacion
	When hago click en el enlace de Gestionar Videoteca
	And busco el producto "Playlist 1234" para seleccionarla de la tabla de Playlist
	And hago click en el boton de Mover Playlist 
	And coloco el indice del item Playlist que quiero mover como "2"
  Then el sistema actualiza la lista con el orden especificado exitosamente
	
#Se evaluará como el sistema responde ante la situación de que el usuario modifique el orden de un item Playlist que se ecuentre en la primera posición de la lista
Scenario: Mover Playlist B
	Given despues de iniciar sesion en la aplicacion
	When hago click en el enlace de Gestionar Videoteca
	And busco el producto "Playlist 1234" para seleccionarla de la tabla de Playlist
	And hago click en el boton de Mover Playlist 
	And coloco el indice del item Playlist que quiero mover como "-1"
  Then el sistema no actualiza la lista con el orden especificado
  
#Se evaluará como el sistema responde ante la situación de que el usuario modifique el orden de un item Playlist que se ecuentre en la ultima posición de la lista
Scenario: Mover Playlist C
	Given despues de iniciar sesion en la aplicacion
	When hago click en el enlace de Gestionar Videoteca
	And busco el producto "Playlist 1234" para seleccionarla de la tabla de Playlist
	And hago click en el boton de Mover Playlist 
	And coloco el indice del item Playlist que quiero mover como "4"
  Then el sistema no actualiza la lista con el orden especificado
  
#
Scenario: Mover Playlist B
	Given despues de iniciar sesion en la aplicacion
	When hago click en el enlace de Gestionar Videoteca
	And busco el producto "Playlist 1234" para seleccionarla de la tabla de Playlist
	And hago click en el boton de Mover Playlist 
	And coloco el indice del item Playlist que quiero mover como "4"
  Then el sistema no actualiza la lista con el orden especificado
  