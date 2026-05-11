package comparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Pour trier une collection selon une logique spécifique :

//manière 1 : créer un Comparator / Implémenter la logique dans comparator / appeler Collections.sort(list, comparator)

//manière 2 : implémenter l'interface Comparable dans la classe des objets de la collection (si collection de student
// donc l'implémenter dans la classe Student) / faire un override de la méthode compareTo dans la classe selon la logique /
// appeler la methode Collections.sort(list) --> Sans Comparator

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "age = " + age + ", name = '" + name + '\'';
    }

    @Override
    public int compareTo(Student that) {
        return (this.age > that.age) ? -1 : 1;
    } // Tri selon age décroissant
}

public class Demo {
    public static void main(String[] args) {
        /*List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(29);
        nums.add(72);

        Comparator<Integer> com = (i,j) -> (i%10 > j%10) ? 1 : -1 ;



        Collections.sort(nums, com);
        //Collections.sort(nums, (i,j) -> (i%10 > j%10) ? 1 : -1);

        System.out.println(nums);*/

        List<Student> stds = new ArrayList<>();
        stds.add(new Student(21,"bbbb"));
        stds.add(new Student(29,"aaa"));
        stds.add(new Student(18,"c"));
        stds.add(new Student(24,"dd"));

        Comparator<Student> com1 = (s1,s2) -> (s1.age > s2.age) ? 1 : -1; // Tri selon age croissant

        Comparator<Student> com2 = (s1,s2) -> (s1.name.length() > s2.name.length()) ? 1 : -1; // Tri selon longueur nom croissant

        Comparator<Student> com3 = (s1,s2) -> (s1.name.compareTo(s2.name) > 0) ? 1 : -1; // Tri selon l'ordre alphabétique du nom croissant


        Collections.sort(stds, com1);
        System.out.println(stds);

        Collections.sort(stds, com2);
        System.out.println(stds);

        Collections.sort(stds, com3);
        System.out.println(stds);

        Collections.sort(stds);
        System.out.println(stds);

/*        String str = "apple";
        String str2 = "kiwi";
        System.out.println(str2.compareTo(str));
        Pour comparer l'égalité de deux chaines str1 et str2 : str1.compareTo(str2) == 0
        */





    }
}
