public class Twodarray {
    public static void main(String[] args) {
        int a[][]={{1,2,3,4},{2,3,4,5}};
        int totalcount=0;
        
        
        for(int i=0;i<a.length;i++){
            
            for(int j=0;j<a[i].length;j++){
                totalcount++;
            }
        }
        
        System.out.println(totalcount);
        int sa[]=new int[totalcount];
        int k=0;

        for(int i=0;i<a.length;i++){
            
            for(int j=0;j<a[i].length;j++){
                sa[k++]=a[i][j];
            }
        }

        System.out.println("-------------------");
        for(k=0;k<totalcount;k++)
        System.out.println(sa[k]);
            }
            
        }
    

