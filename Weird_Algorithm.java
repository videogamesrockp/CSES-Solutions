import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int N = Integer.parseInt(r.readLine());

		pw.print(N + " ");
		
		while (N != 1) {
			if (N % 2 == 0) {
				N /= 2;
			}
			else {
				N *= 3;
				N += 1;
			}
			pw.print(N + " ");
		}

		pw.close();
	}
}
