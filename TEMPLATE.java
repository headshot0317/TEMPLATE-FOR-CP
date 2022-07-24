import java.util.*;
import java.io.*;
public class TEMPLATE{
public static void main (String[] args) {  		
     out.println("Hello world");
////////////////////////////////////////////////////////////////////  	
out.flush();out.close();
}//*END OF MAIN METHOD*
static Map<Integer, Integer> map(int[] a) {
Map<Integer,Integer> map=new HashMap<>();
for(int i:a){
    map.put(i,map.getOrDefault(i,0)+1);
}
return map;
}
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
static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
static FastScanner sc = new FastScanner();
}//*END OF MAIN CLASS*

