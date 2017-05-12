import java.util.ArrayList;
import java.util.List;

public class GraphArr {
	private Vertex[] vertices = new Vertex[Main.n];
	private List<Edge> edges = new ArrayList<Edge>();
	
	
	public void addVertex(int index, Vertex vertex){
		vertices[index] = vertex;
	}
	
	public void addVertexes(Vertex[] vertexes){
		vertices = vertexes;
	}
	
	public void setVertices(Vertex[] vertices){
		this.vertices = vertices;
	}
	
	public Vertex[] getVertices(){
		return vertices;
	}
	
	public void addEdge(Edge e) {
		//System.out.println(e.toString());
        this.edges.add(e);
    }
	
	/*public void addEdges(List<Edge> edges){
		this.edges = edges;
	}*/
	public List<Edge> getEdges() {
        return edges;
    }
	
	public String toString(int index){
		return vertices[index].toString();
	}
	
	@Override
    public String toString() {
        String vertexes = "Vertexes: {";
        String edges = "Edges: {";
/*
        for (Vertex v :this.vertices) {
            vertexes += v.getLabel() + ", ";
        }
 */
        for(int i = 0; i < vertices.length; i++){
        	vertexes += Integer.toString(i + 1) + ", ";
        }
        vertexes += "}";

        for (Edge e :this.edges) {
            edges += "{" + e.getFrom().getName() + ", " + e.getTo().getName() + "}, ";
        }
        edges += "}";

        return vertexes + "\n" + edges;
    }
	
	
}
