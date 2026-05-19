public class problema2 {

    public static int divide(int arr[], int n, int seg_elem, int may){
        for(int i=0; i < 4; i++){
            if(n%2== 1){
                for(int j=0; j<n; j++){
                    if(arr[j]>may){
                        seg_elem=may;
                        may=arr[j];
                    }else if(arr[j]>seg_elem && arr[j]!=may){
                        seg_elem=arr[j];
                    }
                }
                break;
            }
            n = n / 2;
        }
        return seg_elem;
    }

    public static void main(String[] args){
        int arr[]={8,3,10,5,7};
        int n = arr.length;
        int seg_elem=0;
        int may=0; 
        for(int i = 0; i<5; i++){
            //encuentro mi mayor
            if(arr[i]>may) may= arr[i];
        }
        
        //segundo mayor
        
        for (int i = 0; i<5 ; i++){
                if (arr[i]>seg_elem && arr[i] != may){
                        seg_elem = arr[i];
                }
        }
        System.out.println("num grande 2: "+ seg_elem);
        seg_elem =0;
        may = 0;
        //metodo divide y venceras
        System.out.print("num grade 2: " + divide(arr,n ,seg_elem, may)); 
    }
}