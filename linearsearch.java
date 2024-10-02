public class linearsearch{
    public static int main(String[] args) {
        int x = 10; 
        int arr[] = {1,2,4,10};
        for(int i = 0; i < arr.length; i++){
            if(x == arr[i]){
               System.out.println(i);
            }
        }
        return -1;
    }
}