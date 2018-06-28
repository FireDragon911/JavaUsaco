/*
ID: jpl102
LANG: JAVA
TASK: gift1
*/
import java.io.*;
import java.util.*;
import java.lang.*;

class gift1 {
public static int lookup(String[] n, String ntl){
    int namel = (int)n.length;
    for (int i = 0; i < namel; i++) {
        if (n[i].equals( ntl) ) {
            return i;
        }
    }
    for (int i=0; i<namel; i++ )
    {
        System.out.println( n[i] );
    }
    System.out.println("Cannot find "+ ntl );
    return -1;
}
public static void main (String [] args) throws IOException {

  BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
  PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
  //StringTokenizer st = new StringTokenizer(f.readLine());
  String as = f.readLine();
  int a = Integer.parseInt(as);
  String [] n = new String[a];
  Integer[] r = new Integer[a];
  Integer[] g = new Integer[a];

  for (int i = 0; i < a; i++) {
      n[i] = f.readLine();
  }
  for (int j = 0; j < a; j++) {
      String ng;
      ng = f.readLine();
      String lines; 
      String ims, pgs;
      lines = f.readLine();
      StringTokenizer st1 = new StringTokenizer(lines);
      ims = st1.nextToken();
      pgs = st1.nextToken();
      Integer im, pg;
      im = Integer.parseInt(ims);
      pg = Integer.parseInt(pgs);	
      int ig = lookup(n, ng);
      if (pg > 0){
          System.out.println( "im, pg === %d, %d, %d", im, pg, ig);
          g[ig] += im / pg * pg;
      }
      for (int k = 0; k < pg; k++) {
          String rg;
          rg = f.readLine();
          int ir = lookup(n, rg);
          r[ir] += im / pg;
      }
  }
  for (int i = 0; i < a; i++) {
      out.println(n[i] + " " + Integer.toString(r[i] - g[i]));
  }
  out.close();
}
}