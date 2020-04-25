import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int counter;
        counter = 0;
        int i = 1;
        while (true)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i + " ");
                counter++;
                if (counter == num)
                {
                    break;
                }
            }
           if (counter == num)
           {
               break;
           }

           i++;
        }
    }
}