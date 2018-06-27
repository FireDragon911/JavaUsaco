/*
ID: jpl102
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

class ride {
public static int translateName(String name){
    int namel = (int)name.length();
    int sum = 1;
    for (int i = 0; i < namel; i++) {
        sum *= name.charAt(i) -'A' + 1;
    }
    return sum % 47;
}
public static void main (String [] args) throws IOException {

  BufferedReader f = new BufferedReader(new FileReader("ride.in"));
  PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
  //StringTokenizer st = new StringTokenizer(f.readLine());
  String a = f.readLine();
  String b = f.readLine();
  int as = translateName(a);
  int bs = translateName(b);
  if (as == bs) {
    out.println("GO"); 
  }
  else {
    out.println("STAY");
  }
  out.close();
}
}