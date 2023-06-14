package AbstrcDttStrc.Queues;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

// message queue is a thread so that it can run in parrallel to the main java thread
public class MessageQueue extends Thread {

   /* Message[] queue;
    //Attributes, state
    final int HEAD_INDEX = 0;

    int tailIndex;

    // constructor
    public MessageQueue() {
        queue = new Message[5];
        tailIndex = HEAD_INDEX;
    }

    // a method for the thread
    public void run() {
        // dequeue a message 
        // if message then... process the message (read)
        // else (if the queue is empty) ... no
        // wait a bit 
        // go back to step 1 indefinitley 

    } 

    // behvaiour Enqueue and Dequeue
    public void enqueue(Message m) {
        if (!isFull()) {
            queue[tailIndex] = m;
            tailIndex++;
        }

    }

    public Message dequeue() {
        if(!isEmpty()) {
            Message m = queue[HEAD_INDEX]; // get message at head of queue
            // for index HEAD_INDEX + 1 up to tailIndex - 1
            for (int i = (HEAD_INDEX + 1); i <= (tailIndex - 1); i++) { // shift all the elemnts up one so we have a new head of queue
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
        if (tailIndex == HEAD_INDEX) {
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

    public void deactivate() {
        this.active = false;
    } */

     /**
     * --- (Attributes) State ----------------
     */
    Message[] queue;

    final int HEAD_INDEX = 0;

    int tailIndex;

    File logFile;

    // for thread to work
    volatile boolean active;

    /**
     * The constructor
     */
    public MessageQueue() {
        super("MessageQueueThread");
        this.logFile = new File("project-curiosity\\log\\message_queue_log.txt");
        try { logFile.createNewFile(); } catch(IOException e) {}
        queue = new Message[5];
        tailIndex = HEAD_INDEX;
        active = true;
    }

    /**
     * A method for the Thread
     */
    public void run() {
        System.out.println(this.getName() + " has initialised correctly...");
        
        // while we have messages to consume OR user is still sending messages
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

        System.out.println(this.getName() + " has reached end of run() it will die naturally...");
    } 

    /**
     * --- Behaviour ----------------------
     */
    public void enqueue(Message m) {
        // not full
        if (!isFull()) {
            queue[tailIndex] = m;
            tailIndex++;
        }
    }

    public Message dequeue() {
        // check not empty because if empty cannot dequeue
        if (!isEmpty()) {
            Message m = queue[HEAD_INDEX]; // get message at the head
            // shift all the elements up one
            for (int i = (HEAD_INDEX + 1); i <= (tailIndex - 1); i++) {
                Message shift = queue[i];
                queue[i - 1] = shift;
                queue[i] = null;
            }
            tailIndex--;
            return m;
        }
        return null;
    }

    public boolean isEmpty() {
        return tailIndex == HEAD_INDEX;
    }

    public boolean isFull() {
        return tailIndex == queue.length;
    }

    public void deactivate() {
        this.active = false;
    }

}
