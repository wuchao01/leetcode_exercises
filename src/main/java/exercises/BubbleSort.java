package exercises;

public class BubbleSort {
    public int[] sort(int[] bubble){
        int temp;
        for (int i = 0; i < bubble.length; i++) {
            for (int j = 0; j < bubble.length-1 ; j++) {
                if (bubble[j] > bubble[j+1]){
                   temp = bubble[j];
                   bubble[j] = bubble[j+1];
                   bubble[j+1] = temp;
                }
            }
        }
        return bubble;
    }

    public static void main(String[] args){
        int[] s = new int[]{11,3,5,2,20};
        BubbleSort bubbleSort = new BubbleSort();
        int[] bb = bubbleSort.sort(s);
        for (int b:bb) {
            System.out.println(b);
        }
    }
}
