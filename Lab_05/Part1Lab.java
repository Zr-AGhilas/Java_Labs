
public class Part1Lab {

    // Base Class
    static class Person {

        protected String name , address, phoneNumber, emailAddress;

        public Person() {
            this.name = "Default Name";
            this.address = "Default Address";
            this.phoneNumber = "Default Phone";
            this.emailAddress = "Default Email";
            System.out.println("Person Constructor");
        }

        public Person(Person other) {
            if (other == null) {
                this.name = new String("Default Name");
                this.address = new String("Default Address");
                this.phoneNumber = new String("Default Phone");
                this.emailAddress = new String("Default Email");
            } else {
                this.name = new String(other.name);
                this.address = new String(other.address);
                this.phoneNumber = new String(other.phoneNumber);
                this.emailAddress = new String(other.emailAddress);
            }
        }

        public String toString() {
            return "Person: " + name;
        }

        public boolean equals(Person other) {
            if (other == null) {
                return false;
            }
            return this.name.equals(other.name)
                    && this.address.equals(other.address)
                    && this.phoneNumber.equals(other.phoneNumber)
                    && this.emailAddress.equals(other.emailAddress);
        }

        public void work() {
            System.out.println("Person is working.");
        }
    }

    // Subclass: Student
    static class Student extends Person {

        public static final String STATUS = "Freshman";

        public Student() {
            super();
            System.out.println("Student Constructor");
        }

        public Student(Student other) {
            super(other);
        }

        @Override
        public String toString() {
            return "Student: " + name;
        }

        @Override
        public void work() {
            System.out.println("Student is studying.");
        }
    }

    // Subclass: Employee
    static class Employee extends Person {

        protected String office;
        protected double salary;
        protected String hiringDate;

        public Employee() {
            super();
            System.out.println("Employee Constructor");
        }

        public Employee(Employee other) {
            super(other);
        }

        @Override
        public String toString() {
            return "Employee: " + name;
        }

        @Override
        public void work() {
            System.out.println("Employee is working.");
        }
    }

    // Subclass: Faculty
    static class Faculty extends Employee {

        private String department;
        private String officeHours;
        private String rank;

        public Faculty() {
            super();
            System.out.println("Faculty Constructor");
        }

        public Faculty(Faculty other) {
            super(other);
        }

        @Override
        public String toString() {
            return "Faculty: " + name;
        }

        @Override
        public void work() {
            System.out.println("Faculty is teaching.");
        }
    }

    // Subclass: Staff
    static class Staff extends Employee {

        private String title;

        public Staff() {
            super();
            System.out.println("Staff Constructor");
        }

        public Staff(Staff other) {
            super(other);
        }

        @Override
        public String toString() {
            return "Staff: " + name;
        }

        @Override
        public void work() {
            System.out.println("Staff is supporting.");
        }
    }


    public static void main(String[] args) {
System.err.println("fgfgdbdkkkkkk");    }
}
