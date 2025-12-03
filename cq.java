public class QueuedCircular {
     static class Queued{
        static int arr[];
        static int size;
        static int front=-1;
        static int rear=-1;
Queued(int size)
{
    this.size=size;
    arr = new int[size];
}
public  boolean isEmpty()
{
    return rear==-1 && front==-1;
}
public  boolean isFull()
{
    return (rear+1)%size==front;
}public  void add(int data)
{
    if(isFull())
    {
System.out.println("Overflow");
return;
    }
    else{
        if(rear==-1)
        {
            rear++;
            front++;
        }
        else{
            rear =(rear+1)%size;
        }
        arr[rear]=data;

    }
}
public  int remove()
{
    if(isEmpty())
    {
        System.out.println("underflow");
        return -1;
    }
    else{
        int fir = arr[front];
        if(rear==front)
        {
            rear=front=-1;
        }
        else{
            front = (front+1 ) % size;
        }
        return fir;
    }
}
    public  int peek()
    {
        return arr[front];
    }
}

    
    public static void main(String[] args)
    {
        Queued c = new Queued(5);
       c.add(1);
        c.add(2);
        c.add(3);
        c.remove();
        c.add(5);
        while(!c.isEmpty())
        {
            System.out.println(c.peek());
            c.remove();
        }

    }
}

