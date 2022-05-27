public class QueuA {
    //creating a class which stores array of size n and its functions
    public static class Queu{
        static int [] arr;              //initializing rear with -1 so that there is no element
        static int rear= -1;
        static int size;
        Queu(int n){
            arr= new int[n];           //contstructor contains array of size n
            this.size =n;
        }
        public static boolean isEmpty(){            //check if an array is empty then return true
            return rear==-1;
        }
        //creating an add function which is enque
        public static void add(int data){
            //check if queu is full or not
            if(rear==size-1){
                System.out.println("Full Queu");
                return;
            }
            //but most of the cases are not like that so
            rear++;                      //otherwise the rear will be incrementing
            arr[rear]=data;              //rear is my index and data will be my output when I try to input my number
        }

    }
    public static void main(String[] args) {

    }
}
