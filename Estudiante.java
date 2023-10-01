import java.time.LocalDate;
import java.time.Period;

public class Estudiante {
    private String nombre;          // Nombre del estudiante
    private LocalDate fechaNacimiento;  // Fecha de nacimiento del estudiante
    private double notaMateria1;    // Nota de la materia 1
    private double notaMateria2;    // Nota de la materia 2
    private double notaMateria3;    // Nota de la materia 3

    // Constructor que recibe nombre y fecha de nacimiento
    public Estudiante(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Método público para obtener el nombre del estudiante
    public String getNombre() {
        return nombre;
    }

    // Método público para establecer el nombre del estudiante
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método público para obtener la nota de la materia 1
    public double getNotaMateria1() {
        return notaMateria1;
    }

    // Método público para establecer la nota de la materia 1
    public void setNotaMateria1(double notaMateria1) {
        this.notaMateria1 = notaMateria1;
    }

    // Método público para obtener la nota de la materia 2
    public double getNotaMateria2() {
        return notaMateria2;
    }

    // Método público para establecer la nota de la materia 2
    public void setNotaMateria2(double notaMateria2) {
        this.notaMateria2 = notaMateria2;
    }

    // Método público para obtener la nota de la materia 3
    public double getNotaMateria3() {
        return notaMateria3;
    }

    // Método público para establecer la nota de la materia 3
    public void setNotaMateria3(double notaMateria3) {
        this.notaMateria3 = notaMateria3;
    }

    // Método para calcular la edad actual del estudiante en años
    public int getEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    // Método para calcular el promedio de notas
    public double getPromedio() {
        return (notaMateria1 + notaMateria2 + notaMateria3) / 3.0;
    }
}
