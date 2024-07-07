import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studenti = new ArrayList<>(List.of(
                new Student("Fabio", 34),
                new Student("Dario", 25),
                new Student("Luca", 37),
                new Student("Mario", 24),
                new Student("Mara", 22),
                new Student("Giulia", 20),
                new Student("Pio", 34),
                new Student("Carlo", 25),
                new Student("Paolo", 37),
                new Student("Elisa", 24),
                new Student("Valeria", 22),
                new Student("Noemi", 20)
        ));

        // Stampo la lista studenti. In unica riga per fare + facilmente i confronti delle stampe
        System.out.println("Lista degli studenti:");
        for (Student studentiaggiunti : studenti) {
            System.out.print(studentiaggiunti.getName() + ", anni " + studentiaggiunti.getAge() + " | ");
        }

        //Ordino per nome, ignorando se scritto con maiuscola o minuscola, altrimenti avrei potuto omettere: String.CASE_INSENSITIVE_ORDER
        studenti.sort(Comparator.comparing(Student::getName, String.CASE_INSENSITIVE_ORDER));

        // Stampo in ordine alfabetico
        System.out.println("\nLista degli studenti in ordine alfabetico:");
        for (Student studentiaggiunti : studenti) {
            System.out.print(studentiaggiunti.getName() + ", anni " + studentiaggiunti.getAge() + " | ");
        }

        //Ordino per età
        studenti.sort(Comparator.comparing(Student::getAge));

        // Stampo per età
        System.out.println("\nLista degli studenti per età crescente:");
        for (Student studentiaggiunti : studenti) {
            System.out.print(studentiaggiunti.getName() + ", anni " + studentiaggiunti.getAge() + " | ");
        }
    }
}
