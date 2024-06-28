package ocp_training.day2;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Etudiant> etudiants = List.of(
                new Etudiant("Achref", 55, 10.0),
                new Etudiant("Ahmed", 77, 11.0),
                new Etudiant("Ahmed", 35, 19.5),
                new Etudiant("Achref", 25, 12.0));
        
        System.out.println("Les étudiants:");
        System.out.println(etudiants);
        
        
        Stream<Etudiant> etudiant_stream = etudiants.stream();
        
        /*List<Etudiant> sorted_list1 = etudiant_stream
                .filter(etudiant -> etudiant.moyenne >=  10.0)
                .sorted((ed1, ed2) -> Character.compare(ed1.nom.charAt(0), ed2.nom.charAt(0)))
                .toList();*/
        
        
        //System.out.println("Sorted list 1:");
        //System.out.println(sorted_list1);
        /*Stream<Etudiant> etudiant_stream2 = etudiants.stream();
        List<Etudiant> sorted_list2 = etudiant_stream2
                .filter(etudiant -> etudiant.moyenne >=  10.0)
                .sorted((ed1,ed2) -> (int) (ed1.moyenne - ed2.moyenne))
                .toList();
        System.out.println("Sorted list 2:");
        System.out.println(sorted_list2);*/
        
        Stream<Etudiant> etudiant_stream3 = etudiants.stream();
       Map<String, Set<Etudiant>> sorted_list3 = etudiant_stream3
                //.filter(etudiant -> etudiant.moyenne >=  10.0)
                //.sorted((ed1, ed2) -> ed1.nom.compareTo(ed2.nom))
                //.sorted((ed1,ed2) -> (int) (100*(ed2.moyenne - ed1.moyenne)))
                .collect(Collectors.groupingBy(Etudiant::getNom, Collectors.toSet()));
        System.out.println("Sorted list 3:");
        System.out.println(sorted_list3);
    }
}
