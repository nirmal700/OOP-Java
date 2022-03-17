
public class Array_Palindrome {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 40, 40, 20, 10 };
        int flag = 0;
        int size = arr.length;
        for (int i = 0; i <= size / 2; i++) {
            if (arr[i] == arr[size - 1 - i]) {
                flag = 1;
            } else {
                flag = 0;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Array is not a palindrome");
        } else {
            System.out.println("Array is a palindrome");
        }
    }
}