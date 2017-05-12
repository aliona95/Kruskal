
import java.util.LinkedList;
import java.util.List;

public class Graph {
    private List<Vertex> vertices = new LinkedList<Vertex>();
    private List<Edge> edges = new LinkedList<Edge>();

    public void addVertex(Vertex v) {
        this.vertices.add(v);
    }

    public void addEdge(Edge e) {
        this.edges.add(e);
    }

    public void setVertices(List<Vertex> vertices) {
        this.vertices = vertices;
    }
/*
    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }
*/
    public List<Vertex> getVertices() {
        return vertices;
    }
    
    public List<Edge> getEdges() {
        return edges;
    }

    @Override
    public String toString() {
        String vertexes = "Vertexes: {";
        String edges = "Edges: {";

        for (Vertex v :this.vertices) {
            vertexes += v.getLabel() + ", ";
        }
        vertexes += "}";

        for (Edge e :this.edges) {
            edges += "{" + e.getFrom().getLabel() + ", " + e.getTo().getLabel() + "}, ";
        }
        edges += "}";

        return vertexes + "\n" + edges;
    }
}
