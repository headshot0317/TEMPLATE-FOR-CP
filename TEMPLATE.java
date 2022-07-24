import java.util.*;
import java.io.*;
public class TEMPLATE{
public static void main (String[] args) {
     int t=sc.nextInt();//for taking integer input 
     String s=sc.next();//for taking input string
     int a[]=sc.Array(n);//taking input for n size array and inserting element//LINE NO 33
     out.println("Hello world");//print hello world
////////////////////////////////////////////////////////////////////  	
out.flush();out.close();
}//*END OF MAIN METHOD*
static final Random random = new Random();
static class FastScanner {
public long[][] readArrayL;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st=new StringTokenizer("");
String next() {
while (!st.hasMoreTokens())
try {
st=new StringTokenizer(br.readLine());
} catch (IOException e) {e.printStackTrace();
}
return st.nextToken();
}
int nextInt() {
return Integer.parseInt(next());
}
long[] Arrayl(int n) {
long a[]=new long[n];
for(int i=0;i<n;i++) a[i]=nextLong();
return a;
}
int[] Array(int n) {
int[] a=new int[n];
for (int i=0; i<n; i++) a[i]=nextInt();
return a;
}
long nextLong() {
return Long.parseLong(next());
}
double nextDouble() {
return Double.parseDouble(next());
}
}
static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));//PRINT METHOD
static FastScanner sc = new FastScanner();//FASTSCANNER CLASS
}//*END OF MAIN CLASS*

