import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        long l = sc.nextLong();
        short s = sc.nextShort();
        byte b = sc.nextByte();
        boolean bb = sc.nextBoolean();
        char     v = sc.next().charAt(0);
        double dd = sc.nextDouble();
        float ff = sc.nextFloat();
        //the above shows the primitive data types
        String arr[] = new String[10];
        arr[0] = String.valueOf(in);arr[1]= String.valueOf(l);arr[2] = String.valueOf(s);
        arr[3] = String.valueOf(b);arr[4]= String.valueOf(bb);arr[5] = String.valueOf(v);
        arr[6] = String.valueOf(dd);arr[7]= String.valueOf(ff);
        System.out.println("all the primitive data types are located in an non primitive data type");
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
}
