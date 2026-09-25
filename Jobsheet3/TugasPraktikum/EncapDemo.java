package Jobsheet3.TugasPraktikum;
public class EncapDemo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    // Modifikasi pengondisian umur minimal 18 dan maksimal 30
    public void setAge(int newAge) {
        if (newAge > 30) {
            this.age = 30;
        } else if (newAge < 18) {
            this.age = 18;
        } else {
            this.age = newAge;
        }
    }
}