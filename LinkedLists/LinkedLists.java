private static class Node<Anytype>
{
    private NayTYpe data;
    private Node<AnyType> next;

    public Node(AnyType data, Node<AnyType> next)
    {
        this.data = data;
        this.next = next;
    }

    public void addFirt(Anytype item)
    {
        head = new Node<Anytype>(item, head);
    }

    //traversing
        Node tmp = head;
        while(temp != null) tmp = tmp.next;

    public void addLast(Anytype item)
    {
        if(head == null) addFirt(item);
        else
        {
            Node<Anytype> tmp = head;
            while(tmp.next != null) tmp = tmp.next;

            tmp.next = new Node<AnyType>(item, null);
        }
    }

    public void insertAfter(Anytype key, Anytype toInsert)
    {
        Node<Anytype> tmp = head;
        while(tmp != null && !tmp.data.equals(key)) tmp = tmp.next;

        if(tmp != null)
            tmp.next = new Node<AnyType>(toInsert, tmp.next);
    }

    public  void insertBefore(Anytype key, Anytype toInsert)
    {
        if(head == null) return null;
        if(head.data.equals(key))
        {
            addFirt(toInsert);
            return;
        }

        Node<Anytype> prev = null;
        Node<Anytype> cur = head;

        while(cur != null && !cur.data.equals(key))
        {
            prev = cur;
            cur = cur.next;
        }
        // insert between cur and prev
        if(cur != null) prev.next = new Node<AnyType>(toInsert, cur);
    }

    public void remove(Anytype key)
    {
        if(head == null) throw new RuntimeException("cannot delete");

        if(head.data.equals(key))
        {
            head = head.next;
            return;
        }

        Node<Anytype> cur = head;
        Node<Anytype> prev = null;

        while(cur != && !cur.data.equals(key))
        {
            prev = cur;
            cur = cur.next;
        }

        if(cur == null) throw new RuntimeException("cannot delete");

        // delete cur node
        prev.next = cur.next;
    }

    public Iterator<Anytype> iterator()
    {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<Anytype>
    {
        private Node<Anytype> nextNode;

        public LinkedListIterator()
        {
            nextNode = head;
        }

        public Anytype next()
        {
            if(!hasNext()) throw new NoSuchElementException();
            Anytype res = nextNode.data;
            nextNode = nextNode.next;
            return res;
        }

        public Object copy()
        {
            LinkedList<Anytype> twin = new LinkedList<Anytype>();
            Node<Anytype> tmp = head;
            while(tmp != null)
            {
                twin.addFirst(tmp.data);
                tmp = tmp.next;
            }
            return twin.reverse();
        }

        public LinkedList<Anytype> copy3()
        {
            if(head == null) return null;
            LinkedList<Anytype> twin = new LinkedList<Anytype>();
            Node tmp = head;
            twin.head = new Node<Anytype>(head.data, null);
            Node tmpTwin = twin.head;

            while(tmp.next != null)
            {
                tmp = tmp.next;
                tmpTwin.next = new Node<Anytype>(tmp.data, null);
                tmpTwin = tmpTwin.next;
            }
            return twin;
        }
    }
}
