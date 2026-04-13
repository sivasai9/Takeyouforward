public class QueueImplementationUsingArray {
    int [] QueueArray;
    int start;
    int end;
    int cursize;
    int maxsize;
    public QueueImplementationUsingArray(int size){
        QueueArray=new int[size];
        start=-1;
        end=-1;
        cursize=0;
        maxsize=size;
    }

    public void push(int x){
        if(cursize==maxsize){
            System.out.println("Queue is full");
        }
        if(end==-1){
            start=0;
            end=0;
        }
        else{
            end=(end+1)%maxsize;
        }

        QueueArray[end]=x;
        cursize++;
    }

    public int pop(){
        if(start==-1){
            System.out.println("Queue is Empty");
        }
        int pop=QueueArray[start];

        if(cursize==-1){
            start=-1;
            end=-1;
        }
        else{
            start=(start+1)%maxsize;
        }
        cursize--;
        return pop;
    }
    public int peek(){
            if(cursize==0){
            System.out.println("Queue is Empty");
            }
            return QueueArray[start];
    }

    public boolean isEmpty(){
        return cursize==0;
    }
}
