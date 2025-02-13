package queue;

import java.util.Arrays;

public class CircularBuffer {
   private int [] buffer;
   private int head;
   private int tail;
   private int size;
   private int capacity;

   public CircularBuffer(int capacity){
       this.capacity = capacity;
       buffer = new int[capacity];
       head = 0;
       tail = 0;
       size = 0;
   }
   public void insert(int element){
       if(size == capacity){
           head = (head+1)%capacity;
       }
       else{
           size++;
       }
       buffer[tail] = element;
       tail = (tail+1)%capacity;
   }
   public int[] getbuffer(){
       int[] result = new int[size];
       for(int i =0; i<size; i++){
           result[i] = buffer[(head+i)%capacity];
       }
       return result;
   }
   public boolean isEmpty(){
      return size == 0;
   }
   public boolean isFull(){
       return size == capacity;
   }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(5);
        System.out.println(cb.isEmpty()?"Buffer is empty":"Buffer is full");
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4);
        cb.insert(5);
        cb.insert(6);
        System.out.println(cb.isFull()?"Buffer is full":"Still space is left");
        int[] ans = cb.getbuffer();
        System.out.println(Arrays.toString(ans));
    }
}
