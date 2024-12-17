

public class Student {

    file vFile = new file();
    

    public long id;
    public String name;
    public String major;
    public String department;
    public String[] courses;


    public Student(long id, String name, String major, String department, String[] courses) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.department = department;
        this.courses = courses;
        System.out.println("Constructor with 5 parameters called");
    }

    public Student(long id, String name, String major, String department) {
       

        this(id, name, major, department, new String[0]); 
        System.out.println("Constructor with 4 parameters called");
    }


    public Student(long id, String name, String major) {
        this(id, name, major, "und"); 
        System.out.println("Constructor with 3 parameters called");
    }

    
    public Student(long id, String name) {
        this(id, name, "und"); 
        System.out.println("Constructor with 2 parameters called");
    }
  
   
    public static void main(String[] args) {
    
         Student s1 = new Student(1L, "Alice");
        //  Student s2 = new Student(2L, "Bob", "Computer Science");
        //  Student s3 = new Student(3L, "Charlie", "Mathematics", "Science");
        //  Student s4 = new Student(4L, "Diana", "Physics", "Science", new String[]{"Physics 101", "Math 101"});

        
    }
}
