// https://cses.fi/problemset/task/1094/

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int N = Integer.parseInt(r.readLine());

        long amount = 0L;
        int[] items = new int[N];

        StringTokenizer st = new StringTokenizer(r.readLine());
        
        for (int i = 0; i < N; i++) {
            items[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < N; i++) {
            if (items[i] < items[i-1]) {
                int increment = ((items[i-1] - items[i]));
                amount += increment;
                items[i] += increment;
            }
        }

        pw.println(amount);
        
        pw.close();
    }
}
