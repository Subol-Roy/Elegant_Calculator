package branch;

public class branch {
    String name, id;
    float cgpa;
    int tmp;
    branch(String name, String id,float cgpa, int tmp){
        this.name=name;
        this.id=id;
        this.cgpa=cgpa;
        this.tnp=tmp;
    }

    public void setTmp(int tmp) {
        this.tmp = tmp;
    }

    public int getTmp() {
        return tmp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public float getCgpa() {
        return cgpa;
    }
}
