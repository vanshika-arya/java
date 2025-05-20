//PositiveNumber , Zeroes, Negative Numbers
public class negativeNum {
    public static void main(String[] args) {
        int arr[]={-4,6,0,-9,0,5};
        int newArr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0);
            newArr[i]=arr[i];
        }
        for(int a=0;a<arr.length;a++){
            if(arr[a]<0)
            newArr[a]=arr[a];
        }
        for(int k=0;k<arr.length;k++){
            if(arr[k]>0)
            newArr[k]=arr[k];
        }
        for(int h=0;h<newArr.length;h++){
            
                for(int j=0;j<newArr.length;j++){
                    if(newArr[h]>newArr[j])
                    {
                        int temp=newArr[h];
                        newArr[h]=newArr[j];
                        newArr[j]=temp;

                    }
                }
            
        }
        for(int v=0;v<newArr.length;v++){
            System.out.println(newArr[v]);
        }
    }
    
}
