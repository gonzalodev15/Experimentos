$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Playlist.feature");
formatter.feature({
  "line": 1,
  "name": "Gestionar Videoteca",
  "description": "Como usuario necesito actualizar mi videoteca",
  "id": "gestionar-videoteca",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#Actualizar Videoteca"
    },
    {
      "line": 5,
      "value": "#criterio 1"
    }
  ],
  "line": 6,
  "name": "Mover Playlist",
  "description": "",
  "id": "gestionar-videoteca;mover-playlist",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "hago click en el enlace de Gestionar Videoteca",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "busco el producto \"Playlist 1234\" para seleccionarla de la tabla de Playlist",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "hago click en el boton de Mover Playlist",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "coloco el indice del item Playlist que quiero mover como 2",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "el sistema actualiza la lista con el orden especificado exitosamente",
  "keyword": "Then "
});
formatter.match({
  "location": "PlalylistIntegrationTest.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 208770400,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_enlace_de_Gestionar_Videoteca()"
});
formatter.result({
  "duration": 115400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Playlist 1234",
      "offset": 19
    }
  ],
  "location": "PlalylistIntegrationTest.busco_el_producto_para_seleccionarla_de_la_tabla_de_Playlist(String)"
});
formatter.result({
  "duration": 2122300,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_boton_de_Mover_Playlist()"
});
formatter.result({
  "duration": 97100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 57
    }
  ],
  "location": "PlalylistIntegrationTest.coloco_el_indice_del_item_Playlist_que_quiero_mover_como(int)"
});
formatter.result({
  "duration": 492400,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.el_sistema_actualiza_la_lista_con_el_orden_especificado_exitosamente()"
});
formatter.result({
  "duration": 95700,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 14,
      "value": "#criterio 2"
    }
  ],
  "line": 15,
  "name": "Mover Playlist",
  "description": "",
  "id": "gestionar-videoteca;mover-playlist",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "hago click en el enlace de Gestionar Videoteca",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "busco el producto \"Playlist 1234\" para seleccionarla de la tabla de Playlist",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "hago click en el boton de Mover Playlist",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "coloco el indice del item Playlist que quiero mover como menos 1",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "el sistema no actualiza la lista con el orden especificado",
  "keyword": "Then "
});
formatter.match({
  "location": "PlalylistIntegrationTest.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 465600,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_enlace_de_Gestionar_Videoteca()"
});
formatter.result({
  "duration": 74000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Playlist 1234",
      "offset": 19
    }
  ],
  "location": "PlalylistIntegrationTest.busco_el_producto_para_seleccionarla_de_la_tabla_de_Playlist(String)"
});
formatter.result({
  "duration": 168400,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_boton_de_Mover_Playlist()"
});
formatter.result({
  "duration": 117900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 63
    }
  ],
  "location": "PlalylistIntegrationTest.coloco_el_indice_del_item_Playlist_que_quiero_mover_como_menos(int)"
});
formatter.result({
  "duration": 83200,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.el_sistema_no_actualiza_la_lista_con_el_orden_especificado()"
});
formatter.result({
  "duration": 93600,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 23,
      "value": "#criterio 3"
    }
  ],
  "line": 24,
  "name": "Mover Playlist",
  "description": "",
  "id": "gestionar-videoteca;mover-playlist",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "hago click en el enlace de Gestionar Videoteca",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "busco el producto \"Playlist 1234\" para seleccionarla de la tabla de Playlist",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "hago click en el boton de Mover Playlist",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "coloco el indice del item Playlist que quiero mover como 4",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "el sistema no actualiza la lista con el orden especificado",
  "keyword": "Then "
});
formatter.match({
  "location": "PlalylistIntegrationTest.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 574400,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_enlace_de_Gestionar_Videoteca()"
});
formatter.result({
  "duration": 75400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Playlist 1234",
      "offset": 19
    }
  ],
  "location": "PlalylistIntegrationTest.busco_el_producto_para_seleccionarla_de_la_tabla_de_Playlist(String)"
});
formatter.result({
  "duration": 83200,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_boton_de_Mover_Playlist()"
});
formatter.result({
  "duration": 106400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 57
    }
  ],
  "location": "PlalylistIntegrationTest.coloco_el_indice_del_item_Playlist_que_quiero_mover_como(int)"
});
formatter.result({
  "duration": 51800,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.el_sistema_no_actualiza_la_lista_con_el_orden_especificado()"
});
formatter.result({
  "duration": 67300,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 32,
      "value": "#criterio 4"
    }
  ],
  "line": 33,
  "name": "Eliminar Playlist",
  "description": "",
  "id": "gestionar-videoteca;eliminar-playlist",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 34,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "hago click en el enlace de Gestionar Videoteca",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "busco el producto \"name 1\" para seleccionarla de la tabla de Playlist",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "hago click en el boton de Eliminar Playlist",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "hago click en el boton de Esta seguro",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "el sistema me mostrara el mensaje Playlist de \"Se elimino correctamente la Playlist\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PlalylistIntegrationTest.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 276100,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_enlace_de_Gestionar_Videoteca()"
});
formatter.result({
  "duration": 60700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name 1",
      "offset": 19
    }
  ],
  "location": "PlalylistIntegrationTest.busco_el_producto_para_seleccionarla_de_la_tabla_de_Playlist(String)"
});
formatter.result({
  "duration": 98600,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_boton_de_Eliminar_Playlist()"
});
formatter.result({
  "duration": 224965900,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_boton_de_Esta_seguro()"
});
formatter.result({
  "duration": 122900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Se elimino correctamente la Playlist",
      "offset": 47
    }
  ],
  "location": "PlalylistIntegrationTest.el_sistema_me_mostrara_el_mensaje_Playlist_de(String)"
});
formatter.result({
  "duration": 55200,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 41,
      "value": "#criterio 5"
    }
  ],
  "line": 42,
  "name": "Eliminar Playlist",
  "description": "",
  "id": "gestionar-videoteca;eliminar-playlist",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 43,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "hago click en el enlace de Gestionar Videoteca",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "busco el producto \"Playlist 1234\" para seleccionarla de la tabla de Playlist",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "hago click en el boton de Eliminar Playlist",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "hago click en el boton Cancelar Eliminacion",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "el sistema me mostrara el mensaje Playlist de \"Se elimino correctamente la Playlist\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PlalylistIntegrationTest.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 247800,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_enlace_de_Gestionar_Videoteca()"
});
formatter.result({
  "duration": 57400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Playlist 1234",
      "offset": 19
    }
  ],
  "location": "PlalylistIntegrationTest.busco_el_producto_para_seleccionarla_de_la_tabla_de_Playlist(String)"
});
formatter.result({
  "duration": 152400,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_boton_de_Eliminar_Playlist()"
});
formatter.result({
  "duration": 6819700,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_boton_Cancelar_Eliminacion()"
});
formatter.result({
  "duration": 127200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Se elimino correctamente la Playlist",
      "offset": 47
    }
  ],
  "location": "PlalylistIntegrationTest.el_sistema_me_mostrara_el_mensaje_Playlist_de(String)"
});
formatter.result({
  "duration": 44300,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 50,
      "value": "#Marcar como favorito"
    },
    {
      "line": 51,
      "value": "#criterio 1"
    }
  ],
  "line": 52,
  "name": "Marcar como favorito",
  "description": "",
  "id": "gestionar-videoteca;marcar-como-favorito",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 53,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 54,
  "name": "hago click en el enlace de Gestionar Videoteca",
  "keyword": "When "
});
formatter.step({
  "line": 55,
  "name": "busco el producto \"Playlist 1234\" para seleccionarla de la tabla de Playlist",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "hago click en el icono Marcar como favorito durante 1 segundo",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "el sistema no me mostrara ningun mensaje con respecto a la Playlist",
  "keyword": "Then "
});
formatter.match({
  "location": "PlalylistIntegrationTest.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 299100,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_enlace_de_Gestionar_Videoteca()"
});
formatter.result({
  "duration": 65100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Playlist 1234",
      "offset": 19
    }
  ],
  "location": "PlalylistIntegrationTest.busco_el_producto_para_seleccionarla_de_la_tabla_de_Playlist(String)"
});
formatter.result({
  "duration": 148100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 52
    }
  ],
  "location": "PlalylistIntegrationTest.hago_click_en_el_icono_Marcar_como_favorito_durante_segundo(int)"
});
formatter.result({
  "duration": 55100,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.el_sistema_no_me_mostrara_ningun_mensaje_con_respecto_a_la_Playlist()"
});
formatter.result({
  "duration": 17600,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 59,
      "value": "#criterio 2"
    }
  ],
  "line": 60,
  "name": "Marcar como favorito",
  "description": "",
  "id": "gestionar-videoteca;marcar-como-favorito",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 61,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 62,
  "name": "hago click en el enlace de Gestionar Videoteca",
  "keyword": "When "
});
formatter.step({
  "line": 63,
  "name": "busco el producto \"Playlist 1234\" para seleccionarla de la tabla de Playlist",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "hago click en el icono Marcar como favorito durante 1.5 segundos",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "el sistema me mostrara el mensaje Playlist de \"Se marco como favorito la Playlist\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PlalylistIntegrationTest.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 429100,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_enlace_de_Gestionar_Videoteca()"
});
formatter.result({
  "duration": 89100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Playlist 1234",
      "offset": 19
    }
  ],
  "location": "PlalylistIntegrationTest.busco_el_producto_para_seleccionarla_de_la_tabla_de_Playlist(String)"
});
formatter.result({
  "duration": 253700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 52
    },
    {
      "val": "5",
      "offset": 54
    }
  ],
  "location": "PlalylistIntegrationTest.hago_click_en_el_icono_Marcar_como_favorito_durante_segundos(int,int)"
});
formatter.result({
  "duration": 30391400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Se marco como favorito la Playlist",
      "offset": 47
    }
  ],
  "location": "PlalylistIntegrationTest.el_sistema_me_mostrara_el_mensaje_Playlist_de(String)"
});
formatter.result({
  "duration": 92100,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 67,
      "value": "#Registrar playlist"
    },
    {
      "line": 68,
      "value": "#criterio 1"
    }
  ],
  "line": 69,
  "name": "Registrar Playlist",
  "description": "",
  "id": "gestionar-videoteca;registrar-playlist",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 70,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 71,
  "name": "hago click en el enlace de Gestionar Videoteca",
  "keyword": "When "
});
formatter.step({
  "line": 72,
  "name": "luego hago click en el boton de Registrar Playlist",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "en la nueva pantalla escribo en el campo Nombre Playlist con el valor de \"\"",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "en la nueva pantalla escribo en el campo Descripcion Producto el valor de \"mi descripcion 1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "presiono el boton de Guardar Playlist",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "el sistema me mostrara el mensaje Playlist de \"Se guardo correctamente la Playlist\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PlalylistIntegrationTest.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 586500,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_enlace_de_Gestionar_Videoteca()"
});
formatter.result({
  "duration": 145400,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.luego_hago_click_en_el_boton_de_Registrar_Playlist()"
});
formatter.result({
  "duration": 99500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 74
    }
  ],
  "location": "PlalylistIntegrationTest.en_la_nueva_pantalla_escribo_en_el_campo_Nombre_Playlist_con_el_valor_de(String)"
});
formatter.result({
  "duration": 85500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mi descripcion 1234",
      "offset": 75
    }
  ],
  "location": "PlalylistIntegrationTest.en_la_nueva_pantalla_escribo_en_el_campo_Descripcion_Producto_el_valor_de(String)"
});
formatter.result({
  "duration": 63800,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.presiono_el_boton_de_Guardar_Playlist()"
});
formatter.result({
  "duration": 35341400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Se guardo correctamente la Playlist",
      "offset": 47
    }
  ],
  "location": "PlalylistIntegrationTest.el_sistema_me_mostrara_el_mensaje_Playlist_de(String)"
});
formatter.result({
  "duration": 49700,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 78,
      "value": "#criterio 2"
    }
  ],
  "line": 79,
  "name": "Registrar Playlist",
  "description": "",
  "id": "gestionar-videoteca;registrar-playlist",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 80,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 81,
  "name": "hago click en el enlace de Gestionar Videoteca",
  "keyword": "When "
});
formatter.step({
  "line": 82,
  "name": "luego hago click en el boton de Registrar Playlist",
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "en la nueva pantalla escribo en el campo Nombre Playlist con el valor de \" name\"",
  "keyword": "And "
});
formatter.step({
  "line": 84,
  "name": "en la nueva pantalla escribo en el campo Descripcion Producto el valor de \"mi descripcion 1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "presiono el boton de Guardar Playlist B",
  "keyword": "And "
});
formatter.step({
  "line": 86,
  "name": "el sistema me mostrara el mensaje Playlist de \"Se debe insertar un nombre que comience con un caracter\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PlalylistIntegrationTest.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 727200,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_enlace_de_Gestionar_Videoteca()"
});
formatter.result({
  "duration": 75600,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.luego_hago_click_en_el_boton_de_Registrar_Playlist()"
});
formatter.result({
  "duration": 53900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " name",
      "offset": 74
    }
  ],
  "location": "PlalylistIntegrationTest.en_la_nueva_pantalla_escribo_en_el_campo_Nombre_Playlist_con_el_valor_de(String)"
});
formatter.result({
  "duration": 45600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mi descripcion 1234",
      "offset": 75
    }
  ],
  "location": "PlalylistIntegrationTest.en_la_nueva_pantalla_escribo_en_el_campo_Descripcion_Producto_el_valor_de(String)"
});
formatter.result({
  "duration": 32100,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.presiono_el_boton_de_Guardar_Playlist_B()"
});
formatter.result({
  "duration": 20400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Se debe insertar un nombre que comience con un caracter",
      "offset": 47
    }
  ],
  "location": "PlalylistIntegrationTest.el_sistema_me_mostrara_el_mensaje_Playlist_de(String)"
});
formatter.result({
  "duration": 33200,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 88,
      "value": "#criterio 3"
    }
  ],
  "line": 89,
  "name": "Registrar Playlist",
  "description": "",
  "id": "gestionar-videoteca;registrar-playlist",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 90,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 91,
  "name": "hago click en el enlace de Gestionar Videoteca",
  "keyword": "When "
});
formatter.step({
  "line": 92,
  "name": "luego hago click en el boton de Registrar Playlist",
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "en la nueva pantalla escribo en el campo Nombre Playlist con el valor de \"name \"",
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "en la nueva pantalla escribo en el campo Descripcion Producto el valor de \"mi descripcion 1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "presiono el boton de Guardar Playlist",
  "keyword": "And "
});
formatter.step({
  "line": 96,
  "name": "el sistema me mostrara el mensaje Playlist de \"Se guardo correctamente la Playlist\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PlalylistIntegrationTest.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 630000,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_enlace_de_Gestionar_Videoteca()"
});
formatter.result({
  "duration": 125300,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.luego_hago_click_en_el_boton_de_Registrar_Playlist()"
});
formatter.result({
  "duration": 158800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name ",
      "offset": 74
    }
  ],
  "location": "PlalylistIntegrationTest.en_la_nueva_pantalla_escribo_en_el_campo_Nombre_Playlist_con_el_valor_de(String)"
});
formatter.result({
  "duration": 59500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mi descripcion 1234",
      "offset": 75
    }
  ],
  "location": "PlalylistIntegrationTest.en_la_nueva_pantalla_escribo_en_el_campo_Descripcion_Producto_el_valor_de(String)"
});
formatter.result({
  "duration": 36500,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.presiono_el_boton_de_Guardar_Playlist()"
});
formatter.result({
  "duration": 23045800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Se guardo correctamente la Playlist",
      "offset": 47
    }
  ],
  "location": "PlalylistIntegrationTest.el_sistema_me_mostrara_el_mensaje_Playlist_de(String)"
});
formatter.result({
  "duration": 45400,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 98,
      "value": "#criterio 4"
    }
  ],
  "line": 99,
  "name": "Registrar Playlist",
  "description": "",
  "id": "gestionar-videoteca;registrar-playlist",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 100,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 101,
  "name": "hago click en el enlace de Gestionar Videoteca",
  "keyword": "When "
});
formatter.step({
  "line": 102,
  "name": "luego hago click en el boton de Registrar Playlist",
  "keyword": "And "
});
formatter.step({
  "line": 103,
  "name": "en la nueva pantalla escribo en el campo Nombre Playlist con el valor de \"name\"",
  "keyword": "And "
});
formatter.step({
  "line": 104,
  "name": "en la nueva pantalla escribo en el campo Descripcion Producto el valor de \"mi descripcion 1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 105,
  "name": "presiono el boton de Guardar Playlist",
  "keyword": "And "
});
formatter.step({
  "line": 106,
  "name": "el sistema me mostrara el mensaje Playlist de \"Se guardo correctamente la Playlist\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PlalylistIntegrationTest.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 333500,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_enlace_de_Gestionar_Videoteca()"
});
formatter.result({
  "duration": 138700,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.luego_hago_click_en_el_boton_de_Registrar_Playlist()"
});
formatter.result({
  "duration": 50700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name",
      "offset": 74
    }
  ],
  "location": "PlalylistIntegrationTest.en_la_nueva_pantalla_escribo_en_el_campo_Nombre_Playlist_con_el_valor_de(String)"
});
formatter.result({
  "duration": 36600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mi descripcion 1234",
      "offset": 75
    }
  ],
  "location": "PlalylistIntegrationTest.en_la_nueva_pantalla_escribo_en_el_campo_Descripcion_Producto_el_valor_de(String)"
});
formatter.result({
  "duration": 32800,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.presiono_el_boton_de_Guardar_Playlist()"
});
formatter.result({
  "duration": 17295400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Se guardo correctamente la Playlist",
      "offset": 47
    }
  ],
  "location": "PlalylistIntegrationTest.el_sistema_me_mostrara_el_mensaje_Playlist_de(String)"
});
formatter.result({
  "duration": 99800,
  "status": "passed"
});
});