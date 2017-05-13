
public class Main {
	static int n = 4;
	static int m = 6;
	
	
    public static void main(String[] args) {
    	Graph graph = new Graph();
    	GraphArr graphArr = new GraphArr();
        
    	// virvuniu zymenu iniciavimas
        Vertex vertex1 = new Vertex("1"); // "1" - label
        Vertex vertex2 = new Vertex("2");
        Vertex vertex3 = new Vertex("3");
        Vertex vertex4 = new Vertex("4");
        // galima is karto zemiau padavinejant kurti edge
        /*Edge edge12 = new Edge(vertex1, vertex2, 2);
        Edge edge23 = new Edge(vertex2, vertex3, 4);
        Edge edge34 = new Edge(vertex3, vertex4, 8);
        Edge edge41 = new Edge(vertex4, vertex1, 5);
        Edge edge13 = new Edge(vertex1, vertex3, 3);
        Edge edge24 = new Edge(vertex2, vertex4, 7);*/
        
        Edge edge12 = new Edge(vertex1, vertex2, 2);
        Edge edge23 = new Edge(vertex2, vertex3, 4);
        //Edge edge34 = new Edge(vertex3, vertex4, 8);
        Edge edge41 = new Edge(vertex4, vertex1, 5);
        Edge edge13 = new Edge(vertex1, vertex3, 3);
        Edge edge24 = new Edge(vertex2, vertex4, 7);

        ///
        graphArr.addVertex(0, vertex1);
        graphArr.addVertex(1, vertex2);
        graphArr.addVertex(2, vertex3);
        graphArr.addVertex(3, vertex4);
        
        
        graphArr.addEdge(edge12);
        graphArr.addEdge(edge23);
        //graphArr.addEdge(edge34);
        graphArr.addEdge(edge41);
        graphArr.addEdge(edge13);
        graphArr.addEdge(edge24);
        ///
        //System.out.println(graphArr.toString(1));
        GraphArr res = KruskalArr.getMinimumumSpanningTree(graphArr);
        
        
        
        // b punktas
        graph.addVertex(vertex1);
        graph.addVertex(vertex2);
        graph.addVertex(vertex3);
        graph.addVertex(vertex4);

        graph.addEdge(edge12);
        graph.addEdge(edge23);
        //graph.addEdge(edge34);
        graph.addEdge(edge41);
        graph.addEdge(edge13);
        graph.addEdge(edge24);
        //

        //Graph result = Kruskal.getMinimumumSpanningTree(graph);

        System.out.println("Start: ");
        System.out.println(graphArr);
        System.out.println("Result: ");
        System.out.println(res);
        //System.out.println(result);
    }
}
