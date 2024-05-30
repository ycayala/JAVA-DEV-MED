package steams;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*
        Filtrar y Mostrar:
        Crea un stream de personas y utiliza filter() para mostrar solo las personas mayores de 25 años.
                Usa forEach() para imprimir los nombres de estas personas.
        Transformación y Agregación:
        Utiliza map() para obtener los nombres de todas las personas en el stream, pero convertidos a mayúsculas.
        Recolecta estos nombres en una lista usando collect().
        Ordenación y Depuración:
        Ordena una lista de personas por edad utilizando sorted() y muestra cada paso del proceso con peek().
        Búsqueda Condicional:
        Dada una lista de personas, utiliza findAny() para encontrar cualquier persona que sea de "CDMX" y tenga más de 30 años.
        Agrupación y Partición:
        Usa collect() con groupingBy() para agrupar personas por ciudad de origen.
                Utiliza partitioningBy() para separar personas en dos grupos: aquellos con edad menor de 30 y los de 30 o más.
        Operaciones Combinadas:
        Pide a los estudiantes que creen un stream que filtre, transforme y ordene datos de una lista de personas, utilizando filter(), map(), y sorted() respectivamente, y luego recolecten el resultado en una lista.
        */
        /*se declara la lista*/
        List<Persona> lista= new ArrayList<>();
        /*se agregan objetos a la lista*/
        lista.add(new Persona("Zaira", 27, "EDOMEX", 'F'));
        lista.add(new Persona("Carolina", 18, "EDOMEX", 'F'));
        lista.add(new Persona("Victor", 30, "CDMX", 'M'));
        lista.add(new Persona("Javier", 32, "CDMX", 'M'));
        lista.add(new Persona("Edgar", 28, "NL", 'M'));
        lista.add(new Persona("Daniela", 36, "SON", 'F'));
        lista.add(new Persona("Luz", 25, "PUE", 'F'));
        lista.add(new Persona("Ernesto", 13, "OAX", 'M'));
        lista.add(new Persona("Alicia", 29, "QRO", 'F'));
        lista.add(new Persona("Jorge", 41, "VER", 'M'));

        /*
        Filtrar y Mostrar:
        Crea un stream de personas y utiliza filter() para mostrar solo las personas mayores de 25 años.
                Usa forEach() para imprimir los nombres de estas personas.
         */
        System.out.println("***** Filtrar y Mostrar");
        lista.stream()
                .filter(t->t.getEdad()>25)
                .forEach(t-> System.out.println(t.getNombre()));
        /*
        Transformación y Agregación:
        Utiliza map() para obtener los nombres de todas las personas en el stream, pero convertidos a mayúsculas.
        Recolecta estos nombres en una lista usando collect().
         */
        System.out.println("***** Transformación y Agregación");
        List<String> nombres = lista.stream()
                .map(t->t.getNombre().toUpperCase())
                .collect(Collectors.toList());
        System.out.println(nombres);

        /*
        Ordenación y Depuración:
        Ordena una lista de personas por edad utilizando sorted() y muestra cada paso del proceso con peek().
         */
        System.out.println("***** Ordenación y Depuración");
        List<Persona> personas= new ArrayList<>();
        lista.stream()
                .sorted((t, s)->((Integer)t.getEdad()).compareTo(s.getEdad()))
                .peek(System.out::println)
                .forEach(personas::add);
        /*
        Búsqueda Condicional:
        Dada una lista de personas, utiliza findAny() para encontrar cualquier persona que sea de "CDMX" y tenga más de 30 años.
         */
        System.out.println("***** Búsqueda Condicional");
        Optional<Persona> persona = lista.stream()
                .filter(t->t.getCiudadOrigen().equals("CDMX"))
                .filter(t->t.getEdad()>30)
                .findAny();
        System.out.println(persona);
        /*
        Agrupación y Partición:
        Usa collect() con groupingBy() para agrupar personas por ciudad de origen.
                Utiliza partitioningBy() para separar personas en dos grupos: aquellos con edad menor de 30 y los de 30 o más.

         */
        System.out.println("***** Agrupación y Partición");
        Map<Boolean, List<Persona>> mPersonas=lista.stream()
                .collect(Collectors
                        .partitioningBy(t->t.getEdad()<30));
        mPersonas.forEach((p1,p2)-> System.out.println("Menores de 30: "+ p1 +" --> "+p2) );
        /*
        Operaciones Combinadas:
        Pide a los estudiantes que creen un stream que filtre, transforme y ordene datos de una lista de personas, utilizando filter(), map(), y sorted() respectivamente, y luego recolecten el resultado en una lista.
        */
        System.out.println("***** Operaciones Combinadas");
        List<String> personaList = new ArrayList<>();
        lista.stream()
                .filter(t->t.getEdad() > 20)
                .sorted()
                .map(t->personaList.add(t.getNombre()))
                .forEach(t-> System.out.print(""));
        System.out.println(personaList);


    }
}
