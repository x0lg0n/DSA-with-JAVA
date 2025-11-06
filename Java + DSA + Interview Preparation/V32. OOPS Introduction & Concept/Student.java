
public class Student {
    String name;
    int rollNo;
    int age;

    // Constructor
    Student() {
        this.name = "Rahul";
        this.rollNo = 87;
        this.age = 45;
    }

    // Paramatrized Constructor
    Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    // Student() {
    //     this ("Lan", 40, 4);
    // }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }


    public static void main(String[] args) {

        int a  =10;
        int b = 30;
        swap(a, b);
        System.out.println(a + " " + b);
        Student student1 =  new Student();
        Student student = new Student("Barky", 4, 4);
        System.out.println(student.name);
        student1.name = "Drek";
        System.out.println(student1.name);
        
    }
}
