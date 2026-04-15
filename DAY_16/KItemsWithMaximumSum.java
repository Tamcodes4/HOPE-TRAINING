public class KItemsWithMaximumSum {
    public static void main(String[] args) {
        int numOnes = 3;
        int numZeroes = 2;
        int numNegOnes = 1;
        int k = 4;
        int result = kItemsWithMaximumSum(numOnes, numZeroes, numNegOnes, k);
        System.out.println("Maximum sum of " + k + " items: " + result);
    }
    public static int kItemsWithMaximumSum(int numOnes, int numZeroes, int numNegOnes, int k) {
        int count=0;
        if(k<=numOnes)  return k;
        else if(k<=(numOnes+numZeroes)) return numOnes;
        else return (numOnes-(k-(numOnes+numZeroes)));
    }
}