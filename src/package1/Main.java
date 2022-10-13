package package1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in) ;

        /*               Declaration of variables and arrys               */

        int Teacherid , studentid , fees  ;
        String Teachername , studentname ;
        int Teachersalary , studentgrade ;
        List<Teacher> teacherList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();


        /*               For adding  teachers               */

        System.out.println("Enter number of Teachers that you want to add:  ");
        int n = input.nextInt();
        for (int i=0 ; i<n ; i++){
            System.out.println("Enter the id of a Teacher :  ");
             Teacherid = input.nextInt();
            input.nextLine();
            System.out.println("Enter name of a Teacher :  ");
             Teachername = input.nextLine();
            System.out.println("Enter salary of a Teacher :  ");
             Teachersalary = input.nextInt();
            Teacher T1 = new Teacher( Teacherid ,Teachername,Teachersalary);
            teacherList.add(T1);

        }

        /*               For adding  Students               */

        System.out.println("Enter number of Students that you want to add:  ");
        int m = input.nextInt();
        for (int i=0 ; i<m ; i++){
            System.out.println("Enter the id of a student :  ");
            studentid = input.nextInt();
            input.nextLine();
            System.out.println("Enter name of a student :  ");
            studentname = input.nextLine();
            System.out.println("Enter grade of a student :  ");
            studentgrade = input.nextInt();
            Student St = new Student(studentid,studentname,studentgrade);
            studentList.add(St);

        }
        input.nextLine();

         /*               For School               */

        School SadatSchool = new School(teacherList,studentList);


         /*               if you want to add new teachers in school               */

        System.out.println("Do you want to add new Teacher ?! (true or false)");
        boolean x=input.nextBoolean();
        while (x==true){
            System.out.println("Enter the id of a new Teacher :  ");
            Teacherid = input.nextInt();
            input.nextLine();
            System.out.println("Enter the name of a new Teacher :  ");
            Teachername = input.nextLine();
            System.out.println("Enter the salary of a new Teacher :  ");
            Teachersalary = input.nextInt();
            Teacher newteacher = new Teacher(Teacherid ,Teachername, Teachersalary);
            SadatSchool.addTeacher(newteacher);
            System.out.println("Do you want to add new other Teacher ?! (true or false)");
            x=input.nextBoolean();
        }


        /*              Feeses that students will pay                */

        for (Student ob : studentList) {
            System.out.println("Enter fees that the student " +ob.getName() + " pay : ");
            fees=input.nextInt();


            /*                   Exception                     */
           try{
               if (fees<0){
                   System.out.println("Error");
               }
           } catch (Exception e) {
               System.out.println(e.getMessage());
               e.printStackTrace();
            }
            ob.payFees(fees);
        }
        System.out.println("SadatSchool has earned $"+ SadatSchool.getTotalMoneyEarned());



        System.out.println("------Making SCHOOL PAY SALARY----");
        for (Teacher ob : teacherList){
            ob.receiveSalary( ob.getSalary());
            System.out.println("SadatSchool has spent for salary to " +  ob.getName()
                    +" and now has $" + SadatSchool.getTotalMoneyEarned());
        }



        /*             print the main information about each student in school                */

        System.out.println(" Print the main information about each student in school : ");
        for (Student ob : studentList)   System.out.println(ob);



        /*             print the main information about each teacher in school                */

        System.out.println(" Print the main information about each teacher in school : ");
        for (Teacher ob : teacherList){
            ob.receiveSalary(ob.getSalary());
            System.out.println( ob);
        }
    }
}
