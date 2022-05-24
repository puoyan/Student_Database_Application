package studentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "" ;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private  static int id = 1000;




    //constructor: prompt user to enter student's name and year

   public Student(){
       Scanner in = new Scanner(System.in);
       System.out.println("Enter student first name: ");
       this.firstName = in.nextLine();

       System.out.println("Enter Student Last name: ");
       this.lastName = in.nextLine();

       System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Student Class level: ");
       this.gradeYear = in.nextInt();

       setStudentID();

//       System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);





       
   }
    //Generate an ID
    private  void setStudentID(){
       //Grade Level + ID
        id++;
        this.studentID = gradeYear + "" + id;


    }

    //Enroll and courses
    public void enroll(){
        //Get insife a loop, user hit 0
        do{
            System.out.print("Enter course(Math or Physic or German or...) to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if( !course.equals("Q")) {
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {

                break;
            }
        } while (1 != 0);
//            System.out.println("ENROLLS IN: " + courses);
//            System.out.println("TUITION BALANCE: " + tuitionBalance);
        }

    //View Balance
    public void viewBalance(){
        System.out.println("your balance is: $" + tuitionBalance);
    }


    //pay  Tuition
    public void payTuition(){
       viewBalance();
        System.out.print("Enter your Payment: $");
       Scanner in = new Scanner(System.in);
       int payment = in.nextInt();
       tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    //Show status
    public String toString(){
       return "Name: " + firstName + " " + lastName +
               "\nGrade Level: "  + gradeYear +
               "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }

 }