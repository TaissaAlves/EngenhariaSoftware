import java.util.Iterator;

class List<T> implements Iterable<T> {
    Node<T> head, tail;

    public void add(T data)
    {
        Node<T> node = new Node<>(data, null);
        if (head == null)
            tail = head = node;
        else {
            tail.setNext(node);
            tail = node;
        }
    }

    public Node<T> getHead()
    {
        return head;
    }

    public Iterator<T> iterator()
    {
        return new ListIterator<>(this);
    }
}

class ListIterator<T> implements Iterator<T> {
    Node<T> current;

    public ListIterator(List<T> list)
    {
        current = list.getHead();
    }

    public boolean hasNext()
    {
        return current != null;
    }

    public T next()
    {
        T data = current.getData();
        current = current.getNext();
        return data;
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}

class Node<T> {
    T data;
    Node<T> next;
    public Node(T data, Node<T> next)
    {
        this.data = data;
        this.next = next;
    }


    public void setNext(Node<T> next)
    {
        this.next = next;
    }

    public T getData()
    {
        return data;
    }

    public Node<T> getNext()
    {
        return next;
    }
}

class Main {
    public static void main(String[] args)
    {
        List<String> lista = new List<>();

        lista.add("jorge");
        lista.add("joao");
        lista.add("joana");
        lista.add("joanina");

        for (String string : lista)
            System.out.println(string);
    }
}