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
  "duration": 185919600,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_enlace_de_Gestionar_Videoteca()"
});
formatter.result({
  "duration": 76699,
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
  "duration": 1511501,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_boton_de_Mover_Playlist()"
});
formatter.result({
  "duration": 79099,
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
  "duration": 480700,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.el_sistema_actualiza_la_lista_con_el_orden_especificado_exitosamente()"
});
formatter.result({
  "duration": 100999,
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
  "duration": 284201,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_enlace_de_Gestionar_Videoteca()"
});
formatter.result({
  "duration": 63700,
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
  "duration": 117699,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_boton_de_Mover_Playlist()"
});
formatter.result({
  "duration": 117500,
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
  "duration": 104800,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.el_sistema_no_actualiza_la_lista_con_el_orden_especificado()"
});
formatter.result({
  "duration": 95900,
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
  "duration": 596201,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_enlace_de_Gestionar_Videoteca()"
});
formatter.result({
  "duration": 101400,
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
  "duration": 137201,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_boton_de_Mover_Playlist()"
});
formatter.result({
  "duration": 66001,
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
  "duration": 52700,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.el_sistema_no_actualiza_la_lista_con_el_orden_especificado()"
});
formatter.result({
  "duration": 79600,
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
  "duration": 273601,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_enlace_de_Gestionar_Videoteca()"
});
formatter.result({
  "duration": 64099,
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
  "duration": 115701,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_boton_de_Eliminar_Playlist()"
});
formatter.result({
  "duration": 244793600,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_boton_de_Esta_seguro()"
});
formatter.result({
  "duration": 94900,
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
  "duration": 799,
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
  "duration": 395800,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_enlace_de_Gestionar_Videoteca()"
});
formatter.result({
  "duration": 52399,
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
  "duration": 148000,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_boton_de_Eliminar_Playlist()"
});
formatter.result({
  "duration": 3438100,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_boton_Cancelar_Eliminacion()"
});
formatter.result({
  "duration": 105100,
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
  "duration": 48600,
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
  "duration": 515901,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_enlace_de_Gestionar_Videoteca()"
});
formatter.result({
  "duration": 61901,
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
  "duration": 178400,
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
  "duration": 64899,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.el_sistema_no_me_mostrara_ningun_mensaje_con_respecto_a_la_Playlist()"
});
formatter.result({
  "duration": 11600,
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
  "duration": 546400,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_enlace_de_Gestionar_Videoteca()"
});
formatter.result({
  "duration": 87600,
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
  "duration": 111300,
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
  "duration": 6074199,
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
  "duration": 44699,
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
  "duration": 238599,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_enlace_de_Gestionar_Videoteca()"
});
formatter.result({
  "duration": 50600,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.luego_hago_click_en_el_boton_de_Registrar_Playlist()"
});
formatter.result({
  "duration": 47100,
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
  "duration": 44100,
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
  "duration": 31299,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.presiono_el_boton_de_Guardar_Playlist()"
});
formatter.result({
  "duration": 9059200,
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
  "duration": 40801,
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
  "duration": 425199,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_enlace_de_Gestionar_Videoteca()"
});
formatter.result({
  "duration": 62600,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.luego_hago_click_en_el_boton_de_Registrar_Playlist()"
});
formatter.result({
  "duration": 72800,
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
  "duration": 51600,
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
  "duration": 47100,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.presiono_el_boton_de_Guardar_Playlist_B()"
});
formatter.result({
  "duration": 20800,
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
  "duration": 54800,
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
  "duration": 255500,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_enlace_de_Gestionar_Videoteca()"
});
formatter.result({
  "duration": 45301,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.luego_hago_click_en_el_boton_de_Registrar_Playlist()"
});
formatter.result({
  "duration": 97300,
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
  "duration": 40900,
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
  "duration": 52500,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.presiono_el_boton_de_Guardar_Playlist()"
});
formatter.result({
  "duration": 18089700,
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
  "duration": 44099,
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
  "duration": 280299,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.hago_click_en_el_enlace_de_Gestionar_Videoteca()"
});
formatter.result({
  "duration": 50299,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.luego_hago_click_en_el_boton_de_Registrar_Playlist()"
});
formatter.result({
  "duration": 52500,
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
  "duration": 36400,
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
  "duration": 28500,
  "status": "passed"
});
formatter.match({
  "location": "PlalylistIntegrationTest.presiono_el_boton_de_Guardar_Playlist()"
});
formatter.result({
  "duration": 13275600,
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
  "duration": 105799,
  "status": "passed"
});
});