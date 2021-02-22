package co.com.hospital.certificacion.autoHospitalConDataDrive.runners;

import co.com.hospital.certificacion.autoHospitalConDataDrive.utils.excel.BeforeSuite;
import co.com.hospital.certificacion.autoHospitalConDataDrive.utils.excel.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import co.com.hospital.certificacion.autoHospitalConDataDrive.runners.excel.RunnerPersonalizado;

import java.io.IOException;

@RunWith(RunnerPersonalizado.class)
//@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/registro_doctor.feature"},
        glue = {"co.com.hospital.certificacion.autoHospitalConDataDrive.stepDefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class RegistroDoctor {

    private RegistroDoctor() {

    }
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/registro_doctor.feature");
    }
}
