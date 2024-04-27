import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Scanner sc;
    public static int[] newArr() throws NegativeArraySizeException, InputMismatchException{
        System.out.print("Введите сколько элементов хотите добавить: ");
        int [] arr = new int[sc.nextInt()];
        return arr;
    }
    public static int fillArr(int[] arr) throws InputMismatchException, RuntimeException{
        int sum = 0;
        int k = 0;
        for(int i = 0; i < arr.length; i++){
            System.out.print("Введите число " + (i + 1) + "-й элементу: ");
            arr[i] = sc.nextInt();
            if(arr[i] > 0){
                sum += arr[i];
                k++;
            }
        }
        if(k==0){
            throw new RuntimeException("Положительные элементы отстутсвуют");
        }
        return (sum / k);
    }
    public static void main(String[] args) {
        try {
            sc = new Scanner(System.in);
            int[] arr = newArr();
            System.out.println("Среднее значение: " + fillArr(arr));
        }
        catch (NegativeArraySizeException e){
            System.out.println("Ввели отрицательное число размеру массива");
        }
        catch (InputMismatchException e){
            System.out.println("Ввод строки вместо числа");
        }
        catch (RuntimeException e){
            System.out.println(e);
        }
    }
}