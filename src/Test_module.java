import java.util.Random;

public class Test_module {

    static final Random random = new Random();

    public static void main(String[] args){
        Integer[] arr = gen_arr(10, 10);
        Queue queue = new Queue<Integer>(arr);
        queue.push(random.nextInt(10));
        while (!queue.empty()){
            System.out.println("Last: " + queue.get() + " Len: " + queue.len());
            queue.pop();
        }
    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

    private static Integer[] gen_arr(int len, int max_val){

        Integer[] arr = new Integer[len];

        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(max_val);

        return arr;
    }
}
