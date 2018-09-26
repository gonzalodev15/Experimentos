Feature: Gestionar Videoteca
	Como usuario necesito actualizar mi videoteca
	
Scenario: Registrar Playlist
	Given despues de iniciar sesion en la aplicacion
	When hago click en el enlace de Gestionar Videoteca
	And luego hago click en el boton de Nueva Playlist
	And en la nueva pantalla escribo en el campo Nombre Producto el valor de "Playlist 1234"
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

	