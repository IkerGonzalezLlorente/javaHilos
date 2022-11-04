/**
 * @returns {void}
 */
function reloj(): void{
    setTimeout(() => {
        let hora: Date = new Date();
        let el: HTMLElement | null = document.getElementById("reloj");
        let segundos: number | string = (hora.getSeconds().toString().length > 1) ? hora.getSeconds() : `0${hora.getSeconds()}`;
        let minutos: number | string = (hora.getMinutes().toString().length > 1) ? hora.getMinutes() : `0${hora.getMinutes()}`;
        let horas: number | string = (hora.getHours().toString().length > 1) ?
            hora.getHours()
        : 
            `0${hora.getHours()}`;
        (el as HTMLElement).innerHTML = `${horas}:${minutos}:${segundos}`;
        reloj();
    },1000);
}

// * Llamamos a la funcion reloj y comienza el proceso

reloj();