import java.util.Scanner;

public class Human {
    String Name;
    int age;
    int salary;
    boolean isMarried;
    static long population;

    Scanner sc = new Scanner(System.in);

    Human() {
        this("Denim", 45, 4500000, true);
    }

    Human(String Name, int age, int salary, boolean isMarried) {
        this.Name = Name;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
        Human.population += 1;
    }

    static void fun() {
        greeting();
        System.out.println("Are you having fun?");
        Scanner sc = new Scanner(System.in);
        boolean answer = sc.nextBoolean();
        System.out.println(answer);
        sc.close();
    }

    static void greeting() {
        System.out.println("Good Morning");
    }

    public static void main(String[] args) {
        Human kunal = new Human("Kunal", 5, 0101101010, false);
        System.out.println(kunal.isMarried);
        fun();
        greeting();
    }
}
