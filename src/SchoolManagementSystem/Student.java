package SchoolManagementSystem;

public class Student {
    /**
     *Created by Mohammed Dauda Yahaya on 29th December, 2017
     * This class is responsible for keeping tracks of students
     *id,name, grade,fees paid and total amount each student paid
     */
    private int id;
    private String name;
    private int grade;
    private double feesPaid;
    private double feesTotal;

    /**
     *This constructor creates new student every it is  initiallize
     * @param id of student
     * @param name of student
     * @param grade the student is in
     *  fees for each student is $30,000
     *  total fees is initiallized to 0
     */

    public Student(int id, String name, int grade){

        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 30000;
        this.feesTotal =0;
    }


    /**
     * This method keeps track of students grade as students are promoted
     * to next grade every year
     * @param grade
     */
    public void setGrade(int grade){
        this.grade = grade;

    }


    /**
     * This Method updates the feePaid variable by adding fees to it
     * @param fees that students pay
     */
    public void updateFees(double fees){

        this.feesPaid += fees;
    }



    public int getId (){

        return id;
    }


    public String getName (){

        return name;
    }



    public int grade (){

        return grade;
    }


}
