public class ListaEnlazada {

    private Node head;
    private Node tail;

    public void addNode(Node node){

        if(head== null){
            head = node;
        } else {

            addNode(head, node);

        }
    }

    //el caso base es el ultimo, ahi acaba la recursividad

    private void addNode(Node current, Node node){
        if(current.getNext() == null){

            current.setNext(node);
            return;
        }
        addNode(current.getNext(), node);
    }

    public void addNode3(Node node){

        if(head==null ){
            head = node;

        }else{

            tail.setNext(node);
            node.setPrevious(tail);

        }

        tail= node;
    }

    private void print1(Node current){

        if(current==null){return;}

        System.out.println(current.getName());
        print1(current.getNext());
    }
    public void print1(){

        print(head);
    }

    public void addNodeAtFirst(Node node){

        if(head==null){

            head = node;
            tail= node;
        }else {

            node.setPrevious(head);
            node.setNext(head); // es un enlace entre ambos elementos.

            head = node;
        }
    }

    public void deleteNode(String goal){

        deleteNode(head,goal);

    } // analizar que pasa si intento eliminar el ultimo o el primer elemento de la lista

    private void deleteNode(Node current, String goal){

        if(current == null){return;}

        //if (!current.getName().equalsIgnoreCase(goal)){}

        if(current.getName().equalsIgnoreCase(goal)){

            if(current.getPrevious() == null){

                head = current.getNext();

            } else if(current.getNext() == null){

                tail = current.getPrevious();

            } else {

                Node prev = current.getPrevious();//goal sirve de referencia para conocer su valor anterior y el valor sgt
                //y de esta manera se conecta ambos, obviando que goal existe, por lo cual se "elimina".
                Node next = current.getNext();
                prev.setNext(next);
                next.setPrevious(prev);
                return;
            }
        }

        deleteNode(current.getNext(), goal);
    }


    public void print(){
        print(head);
    }

    private void print(Node current){

        if(current == null){
            return;
        }

        System.out.println(current.getName());
        print(current.getNext());

    }
}
