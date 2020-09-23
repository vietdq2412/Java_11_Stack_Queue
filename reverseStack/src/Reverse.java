import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        int [] arr = {1,4,5,2,64,12,66,7};

        for (int i =0; i< arr.length;i++){
            stack.push(arr[i]);
        }

        for (int i = 0; i< arr.length; i++){
            arr[i] = stack.pop();
        }

        for (int i : arr){
            System.out.println(i);
        }

    }

}
