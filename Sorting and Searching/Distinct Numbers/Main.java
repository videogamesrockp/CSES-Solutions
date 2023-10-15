// https://cses.fi/problemset/task/1621/

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int n = Integer.parseInt(r.readLine());

		StringTokenizer st = new StringTokenizer(r.readLine());
		Set<Integer> all_distinct_nums = new HashSet<Integer>();

		for (int i = 0; i < n; i ++) {

			all_distinct_nums.add(Integer.parseInt(st.nextToken()));

		}

		pw.println(all_distinct_nums.size());

		pw.close();
	}
}
