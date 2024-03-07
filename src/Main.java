public class Main {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("Vitor");
        grafo.adicionarVertice("Maria");
        grafo.adicionarVertice("Zezinho");
        grafo.adicionarVertice("Kleber");

        grafo.adicionarAresta(1000.0, "Vitor", "Maria");
        grafo.adicionarAresta(5.0, "Maria", "Vitor");
        grafo.adicionarAresta(6.0, "Zezinho", "Kleber");
        grafo.adicionarAresta(7.0, "Kleber", "Zezinho");
    }
}