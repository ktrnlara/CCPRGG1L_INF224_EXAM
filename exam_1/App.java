public class App {
    public static void main(String[] args) throws Exception {
        
        // Create a Student Class

        // Properties

        // object
        // surname
        // firstName
        // middleInitial
        // dateOfBirth
        // studentNumber
        // studentEmailAddress
        // iAmAwesome 

        // object - Katrina
        // surname - Lara
        // firstName - Ma. Katrina
        // middleInitial - P
        // dateOfBirth - 12/09/2003
        // studentNumber - 2022104801
        // studentEmailAddress - laramp@students.national-u.edu.ph
        // iAmAwesome - true

        Student Katrina = new Student();
        Katrina.surname = "Lara";
        Katrina.firstname = "Ma. Katrina";
        Katrina.middleInitial = 'P';
        Katrina.dateOfBirth = "12/09/2003";
        Katrina.studentNumber = 2022104801;
        Katrina.studentEmailAddress = "laramp@students.national-u.edu.ph";
        Katrina.iAmAwesome = true;
        Katrina.sayMyStudentNumber();
        Katrina.sayMystudentEmailAddress();
        Katrina.sayMystudentiamAwesome();

        
    }
}
