package co.com.hospital.certificacion.autoHospitalConDataDrive.model;

public class DatosDoctor {

    private String nombre;
    private String apellido;
    private String telefono;
    private String documentoID;

    public DatosDoctor(String nombre, String apellido, String telefono, String documentoID) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.documentoID = documentoID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDocumentoID() {
        return documentoID;
    }

    public void setDocumentoID(String documentoID) {
        this.documentoID = documentoID;
    }
}
