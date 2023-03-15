public class Main {
    //programs to demonstrate the different uses of the this keyword

    public static void main(String[] args) {
        Student anonymous = new Student("Anonymous", 13243, 1000000f);
        Student anonymous2 = new Student("Code Influencor", 37003676, 12000f);

        //anonymous.displayDetails();
        //anonymous2.displayDetails();

        InvokeMethod method1 = new InvokeMethod();
        method1.myTeam();

    }
}