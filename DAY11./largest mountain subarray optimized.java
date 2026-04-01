import java.util.Arrays;

class mountainoptimized{
    public static void main(String[] args){
        int start=-1,end=-1;
        int ml=0;
        int[] arr={2,1,4,7,3,2,5};
        int i=1;
        while(i<arr.length-1){
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
                i=right;

            }else{
                i++;
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