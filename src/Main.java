import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

//        multidimensional array first represents the number of arrays in the array and the second epresents the number of elements in the array
//        int [][] nums = new int[3][4];
//
//        for(int i=0;i<3;i++)
//        {
//            for(int j=0;j<4;j++)
//            {
//               nums[i][j] = (int)(Math.random()*100);
//            }
//        }
//
//        for(int i=0;i<3;i++)
//        {
//            for(int j=0;j<4;j++)
//            {
//                System.out.print(nums[i][j] + " ");
//            }
//            System.out.println();
//        }
//
////      advance for
//        for(int[] n: nums)
//        {
//           for(int m: n)
//           {
//               System.out.print(m + " ");
//           }
//           System.out.println();
//        }
//
//        int [][] nums1 = new int [3][]; //jagged array
//        nums1[0] = new int[3];
//        nums1[1] = new int[2]; //allocating size
//        nums1[2] = new int[4];
//
//        for(int i =0; i<nums1.length; i++)
//        {
//            for(int j =0; j<nums1[i].length; j++)
//            {
//                nums[i][j] = (int)(Math.random()*10);
//            }
//        }
//
//        for(int[] n : nums1)
//        {
//            for(int m : n)
//            {
//                System.out.print(m + " ");
//            }
//            System.out.println();
//        }
//
//        int [][][] nums2 = new int [3][2][5]; //3D array

        //creating your own array
//        ArrayExample s1 = new ArrayExample();
//        s1.rollnumber = 1;
//        s1.name = "Kassim";
//
//        ArrayExample s2 = new ArrayExample();
//        s2.rollnumber = 2;
//        s2.name = "John";
//
//        ArrayExample[] students = new ArrayExample[2];
//        students[0] = s1;
//        students[1] = s2;
//
////        advance for it does not need a counter, It gives one value at a time
//        for(ArrayExample s: students)
//        {
//            System.out.println(s.name +" : "+s.rollnumber);
//        }

//        What is a String?
//        Types of Strings
//        Immutable String and Mutable String
//        StringBuffer and StringBuilder

//        Working with Static
        Mobile obj1 = new Mobile("Apple", 4500);
//        Mobile obj2 = new Mobile("Samsung", 2700);
//        Mobile.name = "SmartPhone"; // Always accessed through class name for best practice

//        you can assign values, if not default values are given via constructor
//        Mobile.show(obj1);
//        obj1.setPrice(1000);
//        obj1.setBrand("Apple");

        System.out.println(obj1.toString());
//        Mobile.show(obj2);
//
//
////        JERRY
//        Scanner take = new Scanner(System.in);
//
//        System.out.println("Enter Total Price ");
//        double totalPrice = take.nextDouble();
//        double grandTotal;
//
//        if (totalPrice > 1500.0) {
//            double discountAmount = totalPrice * 0.10;
//            grandTotal = totalPrice - discountAmount;
//        } else {
//            grandTotal = totalPrice;
//        }
//
//        System.out.println("Grand Total: GHc " + grandTotal);
//
////        KASSIM
//        System.out.println("Enter Total Price ");
//        double total_price = take.nextDouble();
//        double grand_total = discountCal(total_price);
//        System.out.println("Grand Total: GHc " + grand_total);
//
//
//        take.close();

    }

}