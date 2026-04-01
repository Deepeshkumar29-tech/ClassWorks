class Amazon{
    void search(String product){
        System.out.print("product"+product);
    }
    void search(String product,int price){
        System.out.print("product"+product+"price"+price);
    }
    void search(String product,String category){
        System.out.print("product"+product+"category"+category);
    }
    public class Main{
        public static void main(String[] args){
            Amazon obj=new Amazon();
            obj.search("laptop");
            obj.search("laptop",50000);
            obj.search("laptop","electronics");
        }
    }
}