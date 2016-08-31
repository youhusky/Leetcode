All the airports are vertices and tickets are directed edges. Then all these tickets form a directed graph.

The graph must be Eulerian since we know that a Eulerian path exists.

Thus, start from "JFK", we can apply the Hierholzer's algorithm to find a Eulerian path in the graph which is a valid reconstruction.

Since the problem asks for lexical order smallest solution, we can put the neighbors in a min-heap. In this way, we always visit the smallest possible neighbor first in our trip.