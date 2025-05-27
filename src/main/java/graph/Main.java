package graph;

class AdjNode {
    int vertex;
    AdjNode next;

    public AdjNode(int data) {
        vertex = data;
        next = null;
    }
}

class AdjList {
    private int v;
    private AdjNode[] graph;

    public AdjList(int vertices) {
        v = vertices;
        graph = new AdjNode[v];
        for(int i = 0; i < v; ++i) {
            graph[i] = null;
        }
    }

    public void  addEdge(int source, int destination) {
        AdjNode node = new AdjNode(destination);
        node.next = graph[source];
        graph[source] = node;
    }

    public void addVertex(int vk, int source, int destination) {
        addEdge(source, vk);
        addEdge(vk,destination);
    }

    public void printGraph() {
        for(int i= 0; i < v; ++i) {
            System.out.print(i+" ");
            AdjNode temp = graph[i];
            while (temp != null) {
                System.out.print("->"+temp.vertex+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int v = 6;
        AdjList graph = new AdjList(v);

        graph.addEdge(0,1);
        graph.addEdge(0,3);
        graph.addEdge(0,4);
        graph.addEdge(1,2);
        graph.addEdge(3, 2);
        graph.addEdge(4, 3);

        System.out.println("Initial adjacency list");
        graph.printGraph();

    }
}
