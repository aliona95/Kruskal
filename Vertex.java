
public class Vertex {
    private String label;
    private String name;

    public Vertex(String label) {
        this.label = label;
        this.name = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString(){
    	return name;
    }
}
