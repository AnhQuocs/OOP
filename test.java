import java.util.Scanner;

public class test 
    {
        public static void main(String[] args) 
         {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Phuong trinh ax^2 + bx + c = 0: ");
            System.out.print("Nhap a (a > 0): ");
            int a = scanner.nextInt();
            while (a <= 0) 
            {
                System.out.print("Nhap lai a: ");
                a = scanner.nextInt();
            }
            System.out.print("Nhap b: ");
            int b = scanner.nextInt();
            System.out.print("Nhap c: ");
            int c = scanner.nextInt();

            float delta = (b*b) - (4 * a * c);
            
            if(delta < 0)
            {
                System.out.println("Phuong trinh vo nghiem!");
            }

            else if (delta == 0)
            {
                float x = (-b) / (2*a);
                System.out.println("Phuong trinh co nghiem kep x = " + x);
            }

            else 
            {
                float x1 = (float)((-b + Math.sqrt(delta)) / 2*a);
                float x2 = (float)((-b - Math.sqrt(delta)) / 2*a);
                System.out.println("Phuong trinh co hai nghiem phan biet: ");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
            scanner.close();
         }  
    }