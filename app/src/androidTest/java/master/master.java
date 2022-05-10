package master;

public class master {
    int roll;
    String name;
    master(String s,int r){
        this.roll=r;
        this.name=s;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
