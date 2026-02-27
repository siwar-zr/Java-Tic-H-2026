public class Chaine {

    public static void main(String[] args) {
//        String name = "John";
//        name = name + " Doe";
//        System.out.println("Hello "+name);
//
//        String s1 = "john";
//        String s2 = "john";
//
//        System.out.println(s1 == s2);
//        System.out.println(name.charAt(2));
//        System.out.println(name.concat(" Doe"));

        StringBuffer sb = new StringBuffer("John");
        sb.append(" Doe");
        //sb.deleteCharAt(4);

        //sb.insert(0,"Hello ");
        sb.setLength(50);
        System.out.println(sb);
        System.out.println(sb.capacity());

        String str = sb.toString();
    }
}
