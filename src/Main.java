import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Marina on 11.12.2015.
 */
public class Main {

    private static int n = 10;
    private static int[][] mass = new int[n][n];

    public static void main(String[] args) {
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i!=j && i!=n-j-1)
                    mass[i][j] = 0;
                else
                    mass[i][j] = 1;
            }
        }
        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}
