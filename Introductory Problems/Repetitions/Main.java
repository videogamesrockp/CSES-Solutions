// https://cses.fi/problemset/task/1069/

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		String full_str = r.readLine();

		int longest = 1;
		int current = 1;

		for (int i = 1; i < full_str.length(); i++) {
			if (full_str.charAt(i) == full_str.charAt(i-1)) {
				current += 1;
			}
			else {
				current = 1;
			}
			if (current > longest) {
				longest = current;
			}
		}

		pw.println(longest);

		pw.close();
	}
}
