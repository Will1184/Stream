import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Declarar Stream
        Stream<String> stream= Stream.of("Maria","Jose","Fernando");
        System.out.println(stream);
        List<String> listS= stream.collect(Collectors.toList());
        System.out.println("List usando stream.collect"+listS);

        //Declarar stream por medio  de una lista
        List<String> list1 = Arrays.asList("Maria","Jose","Fernando");
        System.out.println("List usando Arrays.aslist"+list1);
        //Creando stream por medio de una lista
        Stream<String> streamList =list1.stream();
        System.out.println("List usando list.(clase):");
        streamList.forEach(System.out::println);

        //Usando filter de stream para buscar entre todos los datos un valor
        Stream<String> stream2= Stream.of("Maria","Jose","Fernando")
                .filter(s -> s.contains("o"));
        List<String>list2 = stream2.collect(Collectors.toList());
        System.out.println("Stream usando filter Buscando la \"o\" "+list2);

        //Usando map de stream
        Stream<String> stream3= Stream.of("Maria","Jose","Fernando")
                .map(s -> s.toUpperCase());
        List<String>list3 = stream3.collect(Collectors.toList());
        System.out.println("Stream usando map y uppercase "+list3);

        //Usando count de stream para devolver cuantos datos hay
        long stream4= Stream.of("Maria","Jose","Fernando")
                .count();;
        System.out.println("Stream usando count para ver cuantos datos hay: "+stream4);

        //Busca si hay un dato que contenga un valor y devuelve true o false
        boolean stream5= Stream.of("Maria","Jose","Fernando")
                .anyMatch(s -> s.contains("W"));
        System.out.println("Busca si hay un dato que contenga \"W\" y devuelve un boolean : "+stream5);

        //Usando filter para buscar un dato que contenga un valor e inicie con un valor
        Stream<String> stream6= Stream.of("Maria","Jose","Fernando")
                .filter(s -> s.contains("a"))
                .filter(s -> s.startsWith("M"));
        List<String>list6 = stream6.collect(Collectors.toList());
        System.out.println("Stream usando filter para buscar datos con \"a\" y que empiecen con \"M\" "+list6);


    }
}
