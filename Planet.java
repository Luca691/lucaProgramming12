public class Planet {
    private String designation;
    private double massKg;
    private double orbitEarthYears;
    private PlanetType type;

    public Planet(String designation, PlanetType type){
        this.designation = designation;
        this.type = type;
    }

    public Planet(String designation, double massKg, double orbitEarthYears, PlanetType type) {
        this.designation = designation;
        this.massKg = massKg;
        this.orbitEarthYears = orbitEarthYears;
        this.type = type;
    }

    @Override
    public int hashCode() {
       return designation;
    }

    @Override
   
    public boolean equals(Object obj) {
        if(obj2 instanceof designation ){
            designation other = (designation) obj;
            if (this.designation = other.designation){

            } return true;
        }
        return false;
    }
    public String toString(){
        return "Type:" + type + "Designation " + designation;
    } 
}