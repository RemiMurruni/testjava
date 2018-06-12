package testmaven;


import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversalSource;
import org.apache.tinkerpop.gremlin.structure.Edge;
import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.janusgraph.core.JanusGraph;
import org.janusgraph.core.JanusGraphFactory;
import org.janusgraph.core.attribute.Geo;
import org.janusgraph.core.attribute.Geoshape;
import org.janusgraph.example.GraphOfTheGodsFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import groovy.ui.Console;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class testgraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JanusGraph graph = JanusGraphFactory.open("conf/janusgrah-cassandra-es.properties");
		GraphOfTheGodsFactory.load(graph);
		GraphTraversalSource g = graph.traversal();
		
		Map<String, ?> saturnProps = g.V().has("name", "saturn").valueMap(true).next();

		
		

	}

}
