public class ArrayException {
    public static void main(String[] args) {
        int arr[]= new int[4];
        int i;
        try
        {
            for(i=0;i<=4;i++)
            {
                arr[i]=i+1;
                System.out.println(arr[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Maximum number of elements is 4");
        }
        finally {
            arr= new int[4];
        }
    }
}
