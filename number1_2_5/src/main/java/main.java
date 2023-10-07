import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), hour,minute,second;
        hour = n/3600%24;
        minute = n/60%60;
        second = n%60;
        System.out.format(hour+":%02d:%02d",minute,second);

    }
}