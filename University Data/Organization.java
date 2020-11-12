
public class Organization {

    String name;
    String president;
    int yearFound;
    
    public Organization() {}
    
    public void setName(String name) {
        this.name = name;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public void setYearFound(int yearFound) {
        this.yearFound = yearFound;
    }

    public String getName() {
        return this.name;
    }

    public String getPresident() {
        return this.president;
    }

    public int getYearFound() {
        return this.yearFound;
    }

    public void display() {
    }
}
