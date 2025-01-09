package app;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        // Додавання вершин
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);

        // Додавання ребер
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 1);

        // Виведення графа
        System.out.println("Граф після додавання вершин і ребер:");
        graph.printGraph();

        // Перевірка існування вершини та ребра
        System.out.println("\nПеревірка існування вершини 2: " + graph.hasVertex(2));
        System.out.println("Перевірка існування ребра між 1 і 2: " + graph.hasEdge(1, 2));

        // Видалення вершини та ребра
        graph.removeEdge(1, 2);
        System.out.println("\nвидалення ребра між 1 і 2:");
        graph.printGraph();

        graph.removeVertex(3);
        System.out.println("\nвидалення вершини 3:");
        graph.printGraph();
    }
}