import entities.Student;

public class Main {
    public static void main(String[] args) {


        Student aldo = new Student("Aldo", "Baglio");
        Student giovanni = new Student("Giovanni", "Storti");
        Student giacomo = new Student("Giacomo", "Poretti");


        System.out.println(aldo);
//        System.out.println(giovanni.name + "\n id: " + giovanni.id);
//        System.out.println(giacomo.name + "\n id: " + giacomo.id);
        giacomo=giovanni;
        aldo.sayHello();

        if(giacomo.equals(giovanni)){
            System.out.println("uguali");
        }
        else  {
            System.out.println("diversi");
        }
    }
}