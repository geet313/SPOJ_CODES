import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
 
        int t = Integer.parseInt(br.readLine().trim());
 
        while (t-- > 0) {
            String s = br.readLine().trim();
            int len = s.length();   //System.out.println("len = " + len);
            char[] ch = s.toCharArray();
            int[] digit = new int[len + 1];
 
            boolean changed = false;
 
            int mid = len % 2 == 0? len / 2 - 1: len / 2;
            //System.out.println("mid = " + mid);
            for (int i = mid; i >= 0; i--) {
                int a = i + 1;
                int b = len - i;
 
                digit[a] = ch[i] - '0';
                digit[b] = ch[len - i - 1] - '0';
                //System.out.println("a = " + a + " b = " + b + "  digit:  " + digit[a] + "  " + digit[b]);
                if (digit[a] < digit[b]) {
                    if (!changed) {
                        digit[mid + 1]++;
                        if(digit[mid + 1] >= 10) {
                            digit[mid + 1] = 0;
                            digit[mid]++;
                        }
                        digit[len - mid] = digit[mid + 1];
                        //System.out.println(digit[mid + 1] + "   " + digit[len - mid]);
                        for (int j = mid; j >= a; j--) {
                            //System.out.println("j = " + j + "   len - j = " + (len - j));
                            if (digit[j] > digit[len - j + 1]) {
                                if (digit[j] == 10) {
                                    digit[j] = 0;
                                    digit[j - 1]++;
                                }
                                digit[len - j + 1] = digit[j];
                            }
                            else if (digit[j] < digit[len - j + 1]) {
                                digit[len - j + 1] = digit[j];
                            }
                        }
 
                        changed = true;
                    }
                    else {
                        digit[b] = digit[a];
                    }
                }
                else if (digit[a] > digit[b]) {
                    if (digit[a] >= 10) {
                        digit[a] = 0;
                        digit[a - 1]++;
                    }
                    digit[b] = digit[a];
                    changed = true;
                }
            }
 
//            for (int i = 1; i <= len; i++) {
//                pw.print(digit[i]);
//            }
//            pw.println();
 
            if (!changed) {
                digit[mid + 1]++;
                if(digit[mid + 1] >= 10) {
                    digit[mid + 1] = 0;
                    digit[mid]++;
                }
                digit[len - mid] = digit[mid + 1];
 
                for (int j = mid; j >= 1; j--) {
                    //System.out.println("j = " + j + "   len - j = " + (len - j));
                    if (digit[j] > digit[len - j + 1]) {
                        if (digit[j] == 10) {
                            digit[j] = 0;
                            digit[j - 1]++;
                        }
                        digit[len - j + 1] = digit[j];
                    }
                    else if (digit[j] < digit[len - j + 1]) {
                        digit[len - j + 1] = digit[j];
                    }
                }
            }
 
            if (digit[0] == 1) {
                pw.print(1);
                digit[len] = 1;
                //pw.println("Reachef");
            }
 
            for (int i = 1; i <= len; i++) {
                pw.print(digit[i]);
            }
            pw.println();
 
        }
 
        pw.close();
    }
}
