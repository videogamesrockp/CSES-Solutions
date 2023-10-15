// https://cses.fi/problemset/task/1640

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		StringTokenizer st = new StringTokenizer(r.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		boolean finished = false;

		int[] all_nums = new int[n];

		st = new StringTokenizer(r.readLine());

		for (int i = 0; i < n; i++) {

				all_nums[i] = Integer.parseInt(st.nextToken());
			}

		Map<Integer, Integer> all_nums_map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (all_nums_map.containsKey(x - all_nums[i])) {
				pw.println((i + 1) + " " + all_nums_map.get(x - all_nums[i]));
				pw.close();
				finished = true;
				break;
			}
			all_nums_map.put(all_nums[i], i + 1);
		}

		if (!finished) {
			pw.println("IMPOSSIBLE");
		}

		pw.close();

	}
}
