import java.util.*;

public class matrix {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] a = new int[n][n];
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println(Arrays.deepToString(a));
        int maxIdx = a.length - 1;
        for (int e = maxIdx; e >= 0; e--) {
            res.add(String.valueOf(a[e][maxIdx - e]));
            System.out.print(a[e][maxIdx - e] + " ");
        }
        System.out.println();
        System.out.println("Минимальный эллемент побочной диагонали - " + Collections.min(res));;
    }
}


