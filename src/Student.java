public class Student {
    String student;
    int admissionNumber;
    float fees;

    //referring to current class instance variable

    public Student(String student, int admissionNumber, float fees){

        this.student = student;
        this.admissionNumber = admissionNumber;
        this.fees = fees;
    }
    public void displayDetails(){
        System.out.println("Student name: "+student +"\n"+ "Admission number: "+admissionNumber +"\n"+"Tuition fee: "+fees);
    }


}
