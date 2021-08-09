package src;

public class Person {
    private String name;
    private int age;
    private int identityCard;

    public Person(String name, int age, int identityCard) {
        this.name = name;
        this.age = age;
        this.identityCard = identityCard;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    @Override
    public String toString() {
        return "name is: " + name + " age is: " + age + " Identity card is: " + identityCard;
    }
}
