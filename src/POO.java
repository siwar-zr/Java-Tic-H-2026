class Calculator{
    int num = 5;

    public int add(int n1, int n2){
        System.out.println(num);
        return n1 + n2;
    }
    //Surcharge des méthodes
//    public int add(int n1, int n2, int n3){
//        System.out.println("in add");
//        return n1 + n2 + n3;
//    }
//    public double add(double n1, int n2){
//        return n1 + n2;
//    }
//    public double add(int n1, int n2){
//        return n1 + n2;
//    }
}
//class Computer{
//    public void playMusic(){
//        System.out.println("Playing Music ..");
//    }
//    public String getMeSmthg(int cost){
//        if(cost >= 5)
//            return "Something";
//        return "Nothing";
//
//    }
//}

public class POO {
    public static void main(String[] args) {

        int data = 10;

        Calculator calc = new Calculator();
        Calculator calc1 = new Calculator();
        System.out.println(calc);
        //int result = calc.add(3,4);
        calc1.num = 8;
        System.out.println(calc.num);
        System.out.println(calc1.num);


        //System.out.println(result);


//        Computer c1 = new Computer();
//        c1.playMusic();
//        String str = c1.getMeSmthg(2);
//        System.out.println(str);
    }
}
