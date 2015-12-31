package soottocfg.cfg.util;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import org.jgrapht.DirectedGraph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultDirectedGraph;

import com.google.common.base.Verify;



public class GraphUtil {

	/**
	 * Get the unique source of 'g'.
	 * @param g Graph with a unique source
	 * @return The source of 'g', or an exception if the source is not unique.
	 */
	public static <V> V getSource(DirectedGraph<V, ?> g) {
		V source = null;
		for (V b : g.vertexSet()) {
			if (g.inDegreeOf(b)==0) {
				Verify.verify(source==null);
				source = b;
			}
		}
		return source;
	}

	/**
	 * Get the unique sink of 'g'.
	 * @param g Graph with a unique sink
	 * @return The source of 'g', or an exception if the sink is not unique.
	 */
	public static <V> V getSink(DirectedGraph<V, ?> g) {
		V sink = null;
		for (V b : g.vertexSet()) {
			if (g.outDegreeOf(b)==0) {
				Verify.verify(sink==null);
				sink = b;
			}
		}
		return sink;
	}

	/**
	 * Returns the set of all sinks in 'g'
	 * @param g Directed graph.
	 * @return Set of all sinks in 'g'.
	 */
	public static <V> Set<V> getSinks(DirectedGraph<V, ?> g) {
		Set<V> sinks = new HashSet<V>();
		for (V b : g.vertexSet()) {
			if (g.outDegreeOf(b)==0) {
				sinks.add(b);
			}
		}
		return sinks;
	}
	
	/**
	 * Generates a subgraph containing all complete paths in 'orig' that pass through 'from'.
	 * This assumes that 'orig' has one unique source and one unique 'sink'. The resulting
	 * subgraph is a shallow copy of 'orig'. That is, it uses the same objects as vertices 
	 * as 'orig'
	 * @param orig The original graph (with unique source and sink).
	 * @param from The vertex for which we want to have a subgraph.
	 * @return A subgraph containing all complete paths in 'orig' that contain 'from'.
	 */
	public static <V,E> DirectedGraph<V, E> computeSubgraphThroughVertex(DirectedGraph<V, E> orig, V from) {	
		DirectedGraph<V, E> subgraph = new DefaultDirectedGraph<V, E>(orig.getEdgeFactory());
		subgraph.addVertex(from);
		/*
		 * Add all vertices to the subgraph that can reach 'from'.
		 */
		Queue<V> todo = new LinkedList<V>();
		todo.add(from);
		while (!todo.isEmpty()) {
			V current = todo.poll();			
			for (V pre : Graphs.predecessorListOf(orig, current)) {
				if (!subgraph.containsVertex(pre) && !todo.contains(pre)) {
					subgraph.addVertex(pre);
					todo.add(pre);
				}
				if (!subgraph.containsEdge(pre, current)) {
					subgraph.addEdge(pre, current);					
				}
			}
		}
		/*
		 * add all vertices to the subgraph that are reachable from 'from'.
		 */
		todo.add(from);
		while (!todo.isEmpty()) {
			V current = todo.poll();			
			for (V suc : Graphs.successorListOf(orig, current)) {
				if (!subgraph.containsVertex(suc) && !todo.contains(suc)) {
					subgraph.addVertex(suc);
					todo.add(suc);
				}
				if (!subgraph.containsEdge(current, suc)) {
					subgraph.addEdge(current, suc);					
				}

			}
		}
		return subgraph;
	}
	
	/** TODO: inefficient!
	 * Returns the set of all vertices between from and to, including from and to.
	 * Doesn't check if 'to' is reachable from 'from'
	 * @param orig
	 * @param from
	 * @param to
	 * @return
	 */	
	public static <V> Set<V> getVerticesBetween(DirectedGraph<V, ?> graph, V current, V to) {
		Set<V> res = new HashSet<V>();
		if (current.equals(to)) {
			res.add(current);
			return res;
		} else {
			for (V suc : Graphs.successorListOf(graph, current)) {
				if (res.contains(suc)) continue; // already been there. 
				res.addAll(getVerticesBetween(graph, suc, to));
			}
			if (!res.isEmpty()) {
				res.add(current);
			}
		}
		return res;
	}
}
