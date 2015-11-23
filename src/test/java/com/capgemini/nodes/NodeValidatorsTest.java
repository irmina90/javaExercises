package com.capgemini.nodes;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class NodeValidatorsTest {

	@Test
	public void shouldReturnTrueForOneNodeWithoutPredecessor() {
		//given
		NodeValidators test = new NodeValidators();
		//when
    	List<Node> graf = new ArrayList<Node>();
    	Node node = new Node("1111","xxx", "0");
    	graf.add(node);
    	boolean result = test.validateMethod(graf);
		//then
		assertEquals(true, result);
	}
	
	@Test
	public void shouldReturnTrueForTwoNodes() {
		//given
		NodeValidators test = new NodeValidators();
		//when
    	List<Node> graf = new ArrayList<Node>();
    	Node node1 = new Node("1111","xxx", "0");
    	Node node2 = new Node("2222","xxx", "1111");
    	graf.add(node1);
    	graf.add(node2);
    	boolean result = test.validateMethod(graf);
		//then
		assertEquals(true, result);
	}
	
	@Test
	public void shouldReturnTrueForManyNodes() {
		//given
		NodeValidators test = new NodeValidators();
    	List<Node> graf =  Arrays.asList(
    	    	new Node("1111","xxx", "0"),
    	    	new Node("3333","xxx", "2222"),
    	    	new Node("5555","xxx", "4444"),
    	    	new Node("2222","xxx", "1111"),
    	    	new Node("4444","xxx", "3333"),
    	    	new Node("6666","xxx", "5555"));
		//when
    	boolean result = test.validateMethod(graf);
		//then
		assertEquals(true, result);
	}
	
	@Test
	public void shouldReturnFalseForCicle() {
		//given
		NodeValidators test = new NodeValidators();
		//when
    	List<Node> graf = new ArrayList<Node>();
    	Node node = new Node("1111","xxx", "1111");
    	graf.add(node);
    	boolean result = test.validateMethod(graf);
		//then
		assertEquals(false, result);
	}
	
	@Test
	public void shouldReturnFalseForCicleWithTwoNodes() {
		//given
		NodeValidators test = new NodeValidators();
		//when
    	List<Node> graf = new ArrayList<Node>();
    	Node node1 = new Node("1111","xxx", "2222");
    	Node node2 = new Node("2222","xxx", "1111");
    	graf.add(node1);
    	graf.add(node2);
    	boolean result = test.validateMethod(graf);
		//then
		assertEquals(false, result);
	}
	
	@Test
	public void shouldReturnFalseForCicleWithManyNodes() {
		//given
		NodeValidators test = new NodeValidators();
    	List<Node> graf =  Arrays.asList(
    	    	new Node("1111","xxx", "0"),
    	    	new Node("2222","xxx", "1111"),
    	    	new Node("3333","xxx", "2222"),
    	    	new Node("4444","xxx", "4444"),
    	    	new Node("5555","xxx", "6666"),
    	    	new Node("6666","xxx", "5555"));
		//when
    	boolean result = test.validateMethod(graf);
		//then
		assertEquals(false, result);
	}
	
	@Test
	public void shouldTrueIfPenultimateHasTwoSubsequent() {
		//given
		NodeValidators test = new NodeValidators();
		//when
    	List<Node> graf = new ArrayList<Node>();
    	Node node1 = new Node("1111","xxx", "0");
    	Node node2 = new Node("2222","xxx", "1111");
    	Node node3 = new Node("3333","xxx", "1111");
    	graf.add(node1);
    	graf.add(node2);
    	graf.add(node3);
    	boolean result = test.validateMethod(graf);
		//then
		assertEquals(true, result);
	}
	
	@Test
	public void shouldFalseIfIsNotPenultimate() {
		//given
		NodeValidators test = new NodeValidators();
    	List<Node> graf =  Arrays.asList(
    	    	new Node("1111","xxx", "0"),
    	    	new Node("2222","xxx", "1111"),
    	    	new Node("3333","xxx", "1111"),
    	    	new Node("4444","xxx", "2222"),
    	    	new Node("5555","xxx", "3333"),
    	    	new Node("6666","xxx", "4444"));
		//when
    	boolean result = test.validateMethod(graf);
		//then
		assertEquals(false, result);
	}
}
