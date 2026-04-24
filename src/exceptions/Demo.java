package exceptions;

//Error :
//1) Compile time error
//2) Runtime error -> Exception Handling
//3) Logical error

//Unchecked : je peux traiter l'exception
//Checked : je dois traiter l'exception

import static java.lang.Class.forName;

class MyException extends Exception {
    public MyException(String msg){
        super(msg);
    }
}

class A {
    public void show() throws ClassNotFoundException{

        Class.forName("Demo");
    }
}
public class Demo {
    public static void main(String[] args) {

        A obj = new A();
        try{
            obj.show();
        }
        catch (ClassNotFoundException e){
            System.out.println("Not able to find class");
        }




        //System.out.Println(5); //Compile time
        //System.out.println(2+2);

        int i = 20;
        int j = 0;

        int nums[] = new int[5];

        String str = null;

        try{
            j = 18/i; //ligne critique
            /*System.out.println(str.length());
            System.out.println(nums[1]);  //0
            System.out.println(nums[5]);*/
            if (j == 0)
                throw new MyException("I dont want to print zero");
        }
        catch(MyException e){
            j = 18/1;
            System.out.println("This is the default output " + e);
        }
        /*catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in ur limit");
        }*/
        catch(Exception e){
            System.out.println("Something went wrong : " + e);
        }


        System.out.println(j);

    }
}
