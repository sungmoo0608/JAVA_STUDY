import java.util.ArrayList;

/**
 * GenericTraining
 */
class Avg<Person,Student> {
    private Person name;
    private Person age;
    private Person add;

    public void setValue(Person name,Person age,Person add){
        this.name = name;
        this.age = age;
        this.add = add;
    }

    public Person getValue(){
        return this.name;
    }
    public Person getValue2(){
        return this.age;
    }

    public Person getValue3(){
        return this.add;
    }

    private Student school;
    private Student department;
    private Student number;

    public void setValue2(Student school,Student department,Student number){  
        this.school = school;
        this.department = department;
        this.number = number;
    }

    public Student getValue4(){
        return this.school;
    }
    public Student getValue5(){
        return this.department;
    }

    public Student getValue6(){
        return this.number;
    }

}

public class Generics2 {
    
    public static void main(String[] args) {
        Avg<String,String> AVG = new Avg<>();
        

    }

}
