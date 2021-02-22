package co.com.hospital.certificacion.autoHospitalConDataDrive.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.hospital.certificacion.autoHospitalConDataDrive.userInterface.PaginaInicial.BTN_AGREGAR_DOCTOR;

public class SeleccionarAgregarDoctor implements Task {



    public static SeleccionarAgregarDoctor enElSistemaDelHospital(){
        return Tasks.instrumented(SeleccionarAgregarDoctor.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_AGREGAR_DOCTOR));
    }
}
