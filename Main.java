import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class Main {
  /* Essentials */
  public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  public static PrintWriter pw = new PrintWriter(System.out);
  public static StringTokenizer tokenizer;
  public static String input;
  /* Essentials */

  public static void CANDY() throws IOException {
    int n, count, total, moves, avg;
    int[] candies = new int[10000];
    while( (input = in.readLine()) != null ) {
      tokenizer = new StringTokenizer(input);
      n = Integer.parseInt(tokenizer.nextToken());
      count = 0; total = 0; moves = 0;

      // System.out.println("N = "+n);
      if(n != -1) {
        while(count < n) {
          input = in.readLine();
          tokenizer = new StringTokenizer(input);
          candies[count] = Integer.parseInt(tokenizer.nextToken());
          total += candies[count];
          count++;
        }
        // System.out.println("total = "+total);

        if(total % n == 0 && total >= n) {
          avg = total / n;
          for (int i = 0; i < n; ++i) {
            if(candies[i] > avg) {
              moves += candies[i]-avg;
            }
          }
          pw.println(moves);
        } else {
          if(total == 0) pw.println(0);
          else pw.println(-1);
        }
        pw.flush();
      } else break;
    }
  }

////////////////////////////////////////////////////////////////////////

  public static void main(String[] args) throws IOException {
    CANDY();


    /* Essentials */
    pw.flush();
    pw.close();
    /* Essentials */
  }
}
