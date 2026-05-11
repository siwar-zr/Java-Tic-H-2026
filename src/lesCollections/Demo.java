package lesCollections;

//Collection API -> Concept
//Collection -> Interface
//Collections -> Classe

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        /*int num = 5;
        int[] nums = new int[5];*//*

        //Set n'accepte pas les doublons comme la liste
        //TreeSet tri les elements dans un ordre croissant
        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(61);
        nums.add(52);
        nums.add(83);
        nums.add(24);
        nums.add(65);

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext()){
            System.out.println(values.next());
        }


        *//*System.out.println(nums.get(0)); //6
        System.out.println(nums.indexOf(2)); //3*//*

        //Si on ne mentionne le type des données, par défaut ils sont considérés des objets
        for(Object n : nums){
            System.out.println(n);
        }*/

        Map<String,Integer> students = new HashMap<>();
        students.put("John", 53);
        students.put("Jane", 95);
        students.put("Mark", 72);
        students.put("Suzy", 34);
        students.put("John", 68);

        //System.out.println(students.get("Jane")); //95
        System.out.println(students);
        //Les clés d'un dictionnaire sont uniques
        //put peut soit ajouter soit modifier un elt du dict
        System.out.println(students.keySet());
        students.remove("John");
        for (String key : students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }



    }
}
