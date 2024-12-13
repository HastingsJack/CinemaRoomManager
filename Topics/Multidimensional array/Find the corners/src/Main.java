class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        // write your code here
        int rows = twoDimArray.length-1;
        int cols = twoDimArray[0].length-1;
        System.out.println(twoDimArray[0][0] + " " + twoDimArray[0][cols]);
        System.out.println(twoDimArray[rows][0] + " " + twoDimArray[rows][cols]);
    }
}