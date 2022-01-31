package assignment.com;

public class Assignment1_8 
{
	public static void bubbleSort ( int sort[]){
        int n = sort.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sort[j] > sort[j + 1]) {
                    int temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;
                }
            }


        }
    }
    public static void main(String[] args) {
        int[] sort = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
        System.out.println("Array before sorting");
        for (int i=0;i<sort.length;i++){
            System.out.print(sort[i]+" ");

        }
        System.out.println();
        bubbleSort(sort);
        System.out.println("Array after bubble sort");
        for(int i=0;i<sort.length;i++)
            System.out.print(sort[i]+" ");


    }

}
