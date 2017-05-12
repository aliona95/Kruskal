
import java.util.Collections;
public class KruskalArr {
    
    public static GraphArr getMinimumumSpanningTree(GraphArr graph) {
        GraphArr result = new GraphArr();   // 
        
        result.setVertices(graph.getVertices());
       
        
        System.out.println("Nesurikiuota " + graph.getEdges().toString());
        Collections.sort(graph.getEdges());
        System.out.println("Surikiuota " + graph.getEdges().toString());

        // masyvo indeksas - virsune
        // masyvo elemento reiksme - virsunes zymuo
        int edgesCounter = 0;
        while(result.getEdges().size() != graph.getVertices().length - 1){
        	if(graph.getEdges().get(edgesCounter).getFrom().getLabel() != 
        	   graph.getEdges().get(edgesCounter).getTo().getLabel()){
        		
        		
        		result.addEdge(graph.getEdges().get(edgesCounter));
        		System.out.println("AS CIA " + result.getEdges().toString());
        		
        		if(Integer.valueOf(graph.getEdges().get(edgesCounter).getFrom().getLabel()) < 
        		   Integer.valueOf(graph.getEdges().get(edgesCounter).getTo().getLabel())){
        			
        			for(int i = 0; i < graph.getVertices().length; i++){
        				if(Integer.valueOf(graph.getEdges().get(edgesCounter).getTo().getLabel()) == 
        				   Integer.valueOf(graph.getVertices()[i].getLabel())){
        					
        					graph.getVertices()[i].setLabel(graph.getEdges().get(edgesCounter).getFrom().getLabel());
        				}
        			}
        			graph.getEdges().get(edgesCounter).getTo().setLabel(graph.getEdges().get(edgesCounter).getFrom().getLabel());
        		}else{
        			for(int i = 0; i < graph.getVertices().length; i++){
        				if(Integer.valueOf(graph.getEdges().get(edgesCounter).getFrom().getLabel()) == 
        				   Integer.valueOf(graph.getVertices()[i].getLabel())){
        					
        					graph.getVertices()[i].setLabel(graph.getEdges().get(edgesCounter).getTo().getLabel());
        				}
        			}
        			
        			graph.getEdges().get(edgesCounter).getFrom().setLabel(graph.getEdges().get(edgesCounter).getTo().getLabel());
        		}
        	}
        	edgesCounter++;
        }
        //System.out.println(result);
        return result;
    }
    
}
