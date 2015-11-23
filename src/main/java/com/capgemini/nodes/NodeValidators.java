package com.capgemini.nodes;

import java.util.List;

/**
 * Created by ldrygala on 2015-02-09.
 * <p/>
 * Write validate for
 * <ul>
 *     <li>node id should have 4 characters</li>
 *     <li>node description can have maximal 128 characters</li>
 *     <li>no cycle</li>
 *     <li>only penultimate can have two subsequent</li>
 * </ul>
 */
public class NodeValidators {
    public boolean validateMethod(List<Node> nodes) {
    	boolean validate = true;
    		for(int nodeNr=0; nodeNr<nodes.size(); nodeNr++) {
    			
    			String id = nodes.get(nodeNr).getId();
    			String description = nodes.get(nodeNr).getDescription();
    			String predecessorId = nodes.get(nodeNr).getPredecessorId();

    			if (id.length() != 4 
    					|| description.length() > 128
    					|| checkIfHasCicle(id, predecessorId, nodes) == false
    					|| checkIfIsPenultimate(id,predecessorId,nodes) == false) {
    				validate = false;
    			}
    		}
    		
    		return validate;
    }
    
    public boolean checkIfIsPenultimate(String idNode, String predecessorId, List<Node> nodes) {
    	for(int nodeNr=0; nodeNr<nodes.size(); nodeNr++) {
    		String otherPredecessorId = nodes.get(nodeNr).getPredecessorId();
    		String otherId = nodes.get(nodeNr).getId();
    		
    		if(idNode != otherId && predecessorId == otherPredecessorId) {
    			for(int it=0; it<nodes.size(); it++) {
    				if(nodes.get(it).getPredecessorId() == otherId || nodes.get(it).getPredecessorId()==idNode) {
    					return false;
    				}
    			}
    		}
    		
    	}
    	return true;
    }
    
    public boolean checkIfHasCicle(String nodeId, String predecessorId, List<Node> nodes) {
    	boolean hasNoCicle = true;
    	
    	if(nodeId == predecessorId){
    		hasNoCicle = false;
		}
    	
    	for(int nodeNr=0; nodeNr<nodes.size(); nodeNr++) {
    		String otherIdNode = nodes.get(nodeNr).getId();
    		String otherPredecessorId = nodes.get(nodeNr).getPredecessorId();
    		
    		if(nodeId != otherIdNode && 
    		   nodeId == otherPredecessorId &&
    		   predecessorId == otherIdNode) {
    			hasNoCicle = false;
    		}
    	}
    	
    	return hasNoCicle;
    }
   
}
