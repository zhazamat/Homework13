public class Lab3 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int SIZE = 4;
        int SIZE1 = 12;
        char[][] graph = new char[SIZE][SIZE1];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE1; j++) {
                if (i>=j ) {
                    graph[i][j] = '#';
                } else {
                    graph[i][j] = ' ';
                }
            }
        }
        for (int i = 0; i < SIZE; i++) {

            for (int j = 0; j < SIZE1; j++) {

                System.out.print(graph[i][j]);
            }

            System.out.println();
        }
}
}
