import java.util.*;

class Persona implements Comparable<Persona> {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Implementación de Comparable para ordenar por nombre
    @Override
    public int compareTo(Persona otraPersona) {
        return this.nombre.compareTo(otraPersona.nombre);
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }

    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Carlos", 25));
        personas.add(new Persona("Ana", 30));
        personas.add(new Persona("Bruno", 20));
        personas.add(new Persona("Kevin", 12));
        personas.add(new Persona("Juan", 32));
        personas.add(new Persona("Emmanuel", 18));
        personas.add(new Persona("Valeria", 21));
        personas.add(new Persona("Angel", 10));
        personas.add(new Persona("Miguel", 7));
        personas.add(new Persona("Gerardo", 24));


        // Ordenar usando Comparable (por nombre)
        Collections.sort(personas);
        System.out.println("Ordenado por nombre (Comparable):");
        System.out.println(personas);

        // Ordenar usando Comparator (por edad)
        personas.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return Integer.compare(p1.edad, p2.edad);
            }
        });

        System.out.println("Ordenado por edad (Comparator):");
        System.out.println(personas);
    }
}
