import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MonkeyBananaProblem {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int n;
        int rows;
        int cantNodos;
        int index;
        String readed;
        String[] readedArray;
        int[][] weights;
        long[][] distances;
        long maxPredecessor;

        n = Integer.parseInt(in.readLine()); //n = ammount of test cases
        for (int i = 0; i < n; i++) {
            rows = (Integer.parseInt(in.readLine()) * 2) - 1; //ammount of rows	
            cantNodos = (rows + 1) / 2;
            cantNodos = cantNodos * cantNodos;
            cantNodos++;

            weights = new int[rows][cantNodos + 1]; //FIX THIS - not essential 

            for (int j = 0; j < rows; j++) { // initialize weights of each node for each row
                index = 1;
                readed = in.readLine();
                readedArray = readed.split(" ");
                for (String s : readedArray) {
                    weights[j][index] = Integer.parseInt(s);
                    index++;
                }
            }

            distances = new long[rows][cantNodos + 1];
            if (cantNodos > 0) {
                distances[0][1] = weights[0][1];

                for (int row = 1; row < rows; row++) {
                    for (int nodo = 1; nodo < cantNodos; nodo++) {
                        if (weights[row][nodo] > 0) { //if node exists
                            //pick the greatest of the distances of the predecessors and add my weight (i-th)				
                            if (row <= rows / 2) {
                                maxPredecessor = Math.max(distances[row - 1][nodo - 1], distances[row - 1][nodo]);
                            } else {
                                maxPredecessor = Math.max(distances[row - 1][nodo], distances[row - 1][nodo + 1]);
                            }
                            distances[row][nodo] = weights[row][nodo] + maxPredecessor;
                        }
                    }
                }
            }
            System.out.println("Case " + (i + 1) + ": " + distances[rows - 1][1]);
        }

    }
}
