// https://cses.fi/problemset/task/1083/

import java.io.*;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int N = Integer.parseInt(r.readLine());
		HashSet<Integer> nums = new HashSet<Integer>();

		StringTokenizer st = new StringTokenizer(r.readLine());
		
		for (int i = 0; i < N - 1; i++) {
			nums.add(Integer.parseInt(st.nextToken()));
		}

		for (int i = 1; i <= N; i++) {
			if (!nums.contains(i)) {
				pw.println(i);
				break;
			}
		}
		
		pw.close();
	}
}
