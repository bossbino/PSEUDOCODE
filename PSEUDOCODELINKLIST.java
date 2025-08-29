/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PSEUDOCODELINKLIST;

public class PSEUDOCODELINKLIST {
    private int[] values;     
    private int[] next;       
    private int head;        
    private int tail;         
    private int free;        
    private int size;        

    public PSEUDOCODELINKLIST(int capacity) {
        values = new int[capacity];
        next = new int[capacity];

        
        for (int i = 0; i < capacity - 1; i++) {
            next[i] = i + 1;
        }
        next[capacity - 1] = -1;

        head = -1;
        tail = -1;
        free = 0;
        size = 0;
    }

 
    public void add(int value) {
        if (free == -1) {
            throw new RuntimeException("List is full");
        }
        int newIndex = free;
        free = next[free];

        values[newIndex] = value;
        next[newIndex] = -1;

        if (head == -1) {
            head = newIndex;
            tail = newIndex;
        } else {
            next[tail] = newIndex;
            tail = newIndex;
        }
        size++;
    }

  
    public int peek() {
        if (head == -1) throw new RuntimeException("List is empty");
        return values[head];
    }

    
    public int poll() {
        if (head == -1) throw new RuntimeException("List is empty");

        int value = values[head];
        int oldHead = head;
        head = next[head];

        if (head == -1) tail = -1;

        next[oldHead] = free;
        free = oldHead;

        size--;
        return value;
    }

    
    public int pop() {
        if (tail == -1) throw new RuntimeException("List is empty");

        int value = values[tail];

        if (head == tail) {
            int oldTail = tail;
            head = -1;
            tail = -1;
            next[oldTail] = free;
            free = oldTail;
        } else {
           
            int current = head;
            while (next[current] != tail) {
                current = next[current];
            }
            int oldTail = tail;
            tail = current;
            next[tail] = -1;

            next[oldTail] = free;
            free = oldTail;
        }

        size--;
        return value;
    }

    public void printList() {
        int current = head;
        System.out.print("[ ");
        while (current != -1) {
            System.out.print(values[current] + " ");
            current = next[current];
        }
        System.out.println("]");
    }

    public int size() {
        return size;
    }

   
    public static void main(String[] args) {
        PSEUDOCODELINKLIST list = new PSEUDOCODELINKLIST(10);

        list.add(10);
        list.add(20);
        list.add(30);
        list.printList(); 

        System.out.println("Peek: " + list.peek()); 
        System.out.println("Poll: " + list.poll()); 
        list.printList(); 

        System.out.println("Pop: " + list.pop()); 
        list.printList(); 
    }
}
