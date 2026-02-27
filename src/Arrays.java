class Student{
    int id;
    String name;
    int marks;

}

public class Arrays {
    public static void main(String[] args) {
        //int[] nums = {3,7,2,4};
        //nums[1]=6;

        //Jagged Array
//        int nums[][] = new int[3][];
//        nums[0] = new int[3];
//        nums[1] = new int[4];
//        nums[2] = new int[2];

        Student s1 = new Student();
        s1.id=1;
        s1.name="John";
        s1.marks=88;

        Student s2 = new Student();
        s2.id=2;
        s2.name="Maria";
        s2.marks=46;

        Student s3 = new Student();
        s3.id=3;
        s3.name="Mark";
        s3.marks=97;

        Student[] students = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;


/*        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                nums[i][j]= (int) (Math.random()*10);
            }
        }*/


//        for (int i = 0; i < 3; i++){
//            //System.out.println(nums[i]);
//            for (int j = 0; j < 4; j++){
//                System.out.print(nums[i][j]+" ");
//            }
//            System.out.println();
//        }
        for (Student s : students){

                System.out.println(s.id+" : "+s.name+" : "+s.marks);

        }


    }
}
