public class Persona {
    String nombre;
    String apellidos;
    String numeroDocumentoIdentidad;
    int anioNacimiento;
    String nacionalidad;
    char genero;


    Persona(String nombre, String apellidos, String numeroDocumentoIdentidad, int anioNacimiento, String nacionalidad,char genero) { //Constructor de los objetos en base a la clase Persona
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.anioNacimiento = anioNacimiento;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
    }

    void imprimir() { //Metodo que imprime la info(atributos) de los objetos
    System.out.println("Nombre =" + nombre);
        System.out.println("Apellidos = " + apellidos);
        System.out.println("Numero de documento de identidad= " + numeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + anioNacimiento);
        System.out.println("La nachionalidad es = " + nacionalidad);
        System.out.println("El genero de la persona es= "+genero);
        System.out.println();
    }

    public static void main(String args[]) {  //Main que crea ambos objetos
        Persona p1 = new Persona("Pedro","Pérez","1053121010",1998,"Argentina", 'H');
        Persona p2 = new Persona("Luis","León","1053223344",2001,"Mexicana",'H');
        p1.imprimir();
        p2.imprimir();
    }


}
