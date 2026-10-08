package arrays;

public class missing_repeated_values {

    public int[] missingandrepeated(int[][] grid){
        int n = grid.length;
        int size = n*n;

        int[] freq = new int[size+1];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                freq[grid[i][j]]++;
            }
        }
        int missing = -1;
        int repeated = -1;

        for(int i =0;i<=size;i++){
            if(freq[i] == 2){
                repeated = i;
            }
            if(freq[i]==0){
                missing = i;
            }
        }
        return new int[]{repeated,missing};

    }

    public static void main(String[] args){
        int[][] grid = {{1,3},{2,2}};

        missing_repeated_values obj = new missing_repeated_values();

        int[] result = obj.missingandrepeated(grid);

        System.out.println("Repeated: " + result[0]);
        System.out.println("Missing: " + result[1]);
    }
    
}
