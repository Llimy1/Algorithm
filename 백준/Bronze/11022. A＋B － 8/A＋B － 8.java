import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            sb.append("Case #")
                .append(i + 1)
                .append(": ")
                .append(a)
                .append(" + ")
                .append(b)
                .append(" = ")
                .append(a + b).append("\n");
        }
        System.out.print(sb.toString());
    }
}