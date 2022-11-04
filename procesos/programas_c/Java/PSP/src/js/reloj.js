"use strict";
/**
 * @returns {void}
 */
function reloj() {
    setTimeout(() => {
        let hora = new Date();
        let el = document.getElementById("reloj");
        let segundos = (hora.getSeconds().toString().length > 1) ? hora.getSeconds() : `0${hora.getSeconds()}`;
        let minutos = (hora.getMinutes().toString().length > 1) ? hora.getMinutes() : `0${hora.getMinutes()}`;
        let horas = (hora.getHours().toString().length > 1) ?
            hora.getHours()
            :
                `0${hora.getHours()}`;
        el.innerHTML = `${horas}:${minutos}:${segundos}`;
        reloj();
    }, 1000);
}
// * Llamamos a la funcion reloj y comienza el proceso
reloj();
