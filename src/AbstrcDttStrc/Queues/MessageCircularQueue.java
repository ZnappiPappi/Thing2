package AbstrcDttStrc.Queues;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

// message queue is a thread so that it can run in parrallel to the main java thread
public class MessageCircularQueue extends Thread {
    Message[] queue;
    //Attributes, state
    int headIndex;
    Boolean active;
    int tailIndex;
    File logFile;

    // constructor
    public MessageCircularQueue() {

        super("MessageCircularQueueThread");
        this.logFile = new File("project-curiosity\\log\\message_queue_log.txt");
        try { logFile.createNewFile(); } catch(IOException e) {}
        queue = new Message[5];
        headIndex = 0;
        tailIndex = headIndex;
        active = true;

    }

    // a method for the thread
    public void run() {
        System.out.println(this.getName() + " has initialised correctly...");
        // dequeue a message 
        // if message then... process the message (read)
        // else (if the queue is empty) ... no
        // wait a bit 
        // go back to step 1 indefinitley 
        while(!isEmpty() || active) {
            Message consumeMessage = this.dequeue();
            if (consumeMessage != null) {
                consumeMessage.read();
                try {
                    // make it seem like it is really taking long to read a message
                    Thread.sleep(5000);
                } catch(Exception e) { }
                try {
                    FileWriter fw = new FileWriter(logFile, StandardCharsets.UTF_8, true);
                    fw.write("I consumed " + consumeMessage.title + ":   " + consumeMessage.body + "\n");
                    fw.close();
                } catch (IOException e) { 
                    e.printStackTrace(); 
                };
            }
        }

    } 

    // behvaiour Enqueue and Dequeue
    public void enqueue(Message m) {
        if (!isFull()) {
            queue[tailIndex] = m;
            tailIndex = (tailIndex+1) % queue.length;
        }

    }

    public Message dequeue() {
        if(!isEmpty()) {
            Message m = queue[headIndex]; // get message at head of queue
            // for index headIndex + 1 up to tailIndex - 1
            for (int i = (headIndex + 1); i <= (tailIndex - 1); i++) { // shift all the elemnts up one so we have a new head of queue
                Message shift = queue[i];
                queue[i-1] = shift;
                queue[i] = null;
            }
            tailIndex --;
            return m;
        }
        return null;
    }

    public boolean isEmpty() {
        if (tailIndex == headIndex) {
            return true;
        } else {
            return false;
        }
        
    }

    public boolean isFull() {
        if (tailIndex == queue.length) {
            return true;
        } else {
            return false;
        }
    }
}
