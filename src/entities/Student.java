package entities;
import java.util.Objects;
import java.util.Random;
public class Student {
    //TODO LISTA ATTRIBUTI
   public int id;
    public  String name;
    public String surname;

    //TODO COSTRUTTORE
    public Student(String name, String surname){
        Random rndm= new Random();
        this.name= name;
        this.surname= surname;
        this.id= rndm.nextInt(100,104);
    }

    //TODO LISTA METODI

    public void sayHello() {
        System.out.println("Ciao sono "+ this.name+ " "+ "\n ID:" + this.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return this.id == student.id && Objects.equals(this.name, student.name) && Objects.equals(this.surname, student.surname);
    }


}
