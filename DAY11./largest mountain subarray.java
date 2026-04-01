import java.util.Arrays;

class mountain{
    public static void main(String[] args){
        int start=-1,end=-1;
        int ml=0;
        int[] arr={2,1,4,7,3,2,5};
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                int left=i;
                int right=i;
                while(left>0&&arr[left]>arr[left-1]&&right<arr.length-1&&arr[right]>arr[right+1]) {
                    left--;
                    right++;
                }
                int len=right-left+1;
                if(len>ml){
                    ml=len;
                    start=left;
                    end=right;
                }
            }
        }
        if(start==-1) System.out.println(new int[0]);
        int [] res=new int[ml];
        for(int k=0;k<ml;k++){
            res[k]=arr[k+start];

        }
        System.out.println(Arrays.toString(res));
    }
}