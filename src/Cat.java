import java.util.Comparator;

public class Cat implements Comparator {
    private String name;
    private Integer age;



    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat" +
                "\n name = " + name +
                "\n age = " + age ;
    }
    public static Comparator<Cat> comparator =new Comparator<Cat>() {
        @Override
        public int compare(Cat o1, Cat o2) {
                String name1 = o1.getName();
                String name2 = o2.getName();

            return name1.compareTo(name2);
        }
    }

    }

