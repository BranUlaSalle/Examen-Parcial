public class problema1 {

    public static boolean resultado(int arr[], int n, int i){
        if(i == n-1) return true;
        int a = 0; 
        if(arr[i]< arr[i+1]){
            a++;
            if ( a==n){
                return true; 
            }
            return resultado( arr, n , ++i);
        }
        
        return false; 
    }

    public static void main(String[] args){
        int arr[]={1,2,3,5,8};
        int i=0;
        int n = arr.length; 
        boolean valor = resultado(arr,n, i);
        if(valor == true){
            System.out.print("el valor es: true");
        } else {
            System.out.print("el valor es: false");
        }
    }
}