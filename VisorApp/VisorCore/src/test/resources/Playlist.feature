Feature: Gestionar Playlist
	Como usuario necesito modificar mi videoteca gestionando mis playlists
	
Scenario: Registrar Producto
	Given despues de iniciar sesion en la aplicacion
	When hago click en el enlace de Mantenimiento de Producto
	And luego hago click en el boton de Nuevo Producto
	And en la nueva pantalla escribo en el campo Nombre Producto el valor de "Galleta"
	And en la nueva pantalla escribo en el campo Precio Producto el valor de "5"
	And en la nueva pantalla escribo en el campo Categoria Producto el valor de "Chocolates"
	And presiono el boton de Guardar Producto
	Then el sistema me mostrara el mensaje Producto de "Se guardo correctamente el Producto"
	
Scenario: Actualizar Producto 
	Given despues de iniciar sesion en la aplicacion
	When hago click en el enlace de Mantenimiento de Producto
	And busco el producto "Galleta" para seleccionarla de la tabla de Productos
	And hago click en el boton de Editar Producto
	And en la nueva pantalla escribo el precio Producto de "2"
	And presiono el boton de Guardar Producto
	Then el sistema me mostrara el mensaje Producto de "Se actualizo correctamente el Producto"
	
Scenario: Eliminar Producto
	Given despues de iniciar sesion en la aplicacion
	When hago click en el enlace de Mantenimiento de Producto
	And busco el producto "Galleta" para seleccionarla de la tabla de Productos
	And hago click en el boton de Eliminar Producto
	Then el sistema me mostrara el mensaje Producto de "Se elimino correctamente el Producto"
	