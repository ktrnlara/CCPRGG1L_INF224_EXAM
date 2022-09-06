public class Student {
    // Information Attributes
    String surname;
    String firstname;
    char middleInitial;
    String dateOfBirth;
    int studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;

    // Information Method
    
    public void sayMyStudentNumber() {
        System.out.println("My Student Number is: " + studentNumber);
    } 

    public void sayMystudentEmailAddress() {
        System.out.println("My Student Email Address is: " + studentEmailAddress);
    } 

    public void sayMystudentiamAwesome() {
        System.out.println("I am Awesome " + iAmAwesome);
    } 
}
