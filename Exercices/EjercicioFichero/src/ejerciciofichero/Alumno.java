package ejerciciofichero;

public class Alumno {

    public String dni;
    public String nombre;
    public String sexo;
    public String fecha_nacimiento;

    public Alumno(String dni, String nombre, String sexo, String fecha_nacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.sexo = sexo;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        String cadena = "\t <ALUMNO> \n\t\t";
        cadena += "<DNI>" + this.dni + "</DNI>\n\t\t";
        cadena += "<NOMBRE>" + this.nombre + "</NOMBRE>\n\t\t";
        cadena += "<SEXO>" + this.sexo + "</SEXO>\n\t\t";
        cadena += "<FECHA_NACIMIENTO>" + this.fecha_nacimiento + "</FECHA_NACIMIENTO>\n\t\t";
        cadena += "</ALUMNO>\n</ALUMNADO>";
        return cadena;
    }

}
