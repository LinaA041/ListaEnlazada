public class Main {
    public static void main(String[] args) {

        ListaEnlazada lista = new ListaEnlazada();
        lista.addNode3(
                new Node("Manuel")
        );
        lista.addNode3(
                new Node("Miguel")
        );
        lista.addNode3(
                new Node("Samuel")
        );
        lista.addNode3(
                 new Node("Gabriel")
        );
        lista.deleteNode("Gabriel");

        lista.print1();
    }

}