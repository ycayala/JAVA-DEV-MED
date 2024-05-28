import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class test {
    public static void main(String[] args) {
        //Crear un Predicate que verifique si un número es par.
        System.out.println("***** Crear un Predicate que verifique si un número es par");
        Predicate<Integer> predicate = numero -> numero%2 == 0;
        System.out.println(predicate.test(10));

        //Usar un Consumer para imprimir los nombres de una lista.
        System.out.println("***** Usar un Consumer para imprimir los nombres de una lista");
        Consumer<String> stringConsumer= nombre -> System.out.print(nombre+ "\t");
        List<String> listNombres = new ArrayList<String>();
        listNombres.add("Maria");
        listNombres.add("juan");
        listNombres.add("luisa");
        listNombres.add("Francisco");
        listNombres.add("roberto");
        listNombres.add("cecilia");
        for (String nombre: listNombres){
            stringConsumer.accept(nombre);
        }
        System.out.println();
        //Transformar una lista de números a sus cuadrados usando Function.
        System.out.println("***** Transformar una lista de números a sus cuadrados usando Function");
        Function<Integer, Integer> function = numero -> numero * numero;
        List<Integer> listNumeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            listNumeros.add(i);
        }
        for(int numero: listNumeros){
            System.out.print(function.apply(numero) + "\t");
        }
        System.out.println();
        //Generar una lista de números aleatorios usando Supplier.
        System.out.println("***** Generar una lista de números aleatorios usando Supplier.");
        Supplier<Integer> supplier = () -> (int)((Math.random() * 100)+1);
        List<Integer> listAleatorios = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listAleatorios.add(supplier.get());
        }
        System.out.println(listAleatorios);
        //Convertir una lista de cadenas a mayúsculas usando UnaryOperator.
        System.out.println("***** Convertir una lista de cadenas a mayúsculas usando UnaryOperator.");
        UnaryOperator<String> unaryOperator = (texto) -> texto.toUpperCase();

        for (String texto: listNombres){
            System.out.print(unaryOperator.apply(texto) + "\t");
        }

    }
}
