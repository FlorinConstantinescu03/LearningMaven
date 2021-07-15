public class Dog {
    private String name;
    private String type;
    private int age;
    private String scream;
    public Dog () {
    }
    public Dog (String name, String type, int age, String scream) {
        this.name = name;
        this.type = type;
        this.age = age;
    }
    public String getScream() {
        return scream;
    }
    public void setScream(String scream) {
        this.scream = scream;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}