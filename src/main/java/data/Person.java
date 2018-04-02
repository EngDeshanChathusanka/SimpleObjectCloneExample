package data;

/**
 * Created by deshanchathusanka on 4/2/18.
 */
public class Person implements Cloneable {
    private String name;
    private String job;
    private int age;

    public Person(String name, String job,int age)
    {
        this.name=name;
        this.age=age;
        this.job=job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {

        return (Person) super.clone();

    }
}
