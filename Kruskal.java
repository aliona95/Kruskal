
import java.util.Collections;
public class Kruskal {
    
    public static Graph getMinimumumSpanningTree(Graph graph) {
        Graph result = new Graph();
        result.setVertices(graph.getVertices());
        //System.out.println(graph.getVertices());
    
        DisjointSet<Vertex> vertexDisjointSet = new DisjointSet<Vertex>();
        
        for (Vertex v: graph.getVertices()) {
            vertexDisjointSet.makeSet(v);
        }
        System.out.println("Nesurikiuota " + graph.getEdges().toString());
        Collections.sort(graph.getEdges());
        System.out.println("Surikiuota " + graph.getEdges().toString());

        for (Edge e: graph.getEdges()) {
        	// tikriname ar briaunos virsunes yra skirtinguose setuose
            if (vertexDisjointSet.findSet(e.getFrom()) != vertexDisjointSet.findSet(e.getTo())) {
                result.addEdge(e);
                System.out.println("I KARKASA PRIDEDAMA BRIAUNA = " + e.toString());
                // sujungiame setus
                vertexDisjointSet.union(e.getFrom(), e.getTo());
            }
        }
        return result;
    }
}
