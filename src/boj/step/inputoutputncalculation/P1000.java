import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1000 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        if(!(a>0&&a<10)||!(b>0&&b<10)){
            throw new IllegalArgumentException("A와 B는 0보다 크고 10보다 작아야 합니다."); }
        System.out.println(a+b);
    }
}
