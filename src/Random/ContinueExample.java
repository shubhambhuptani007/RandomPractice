package Random;

public class ContinueExample {
    public static void main(String[] args) {
        int a[] = {1,1,2,4,3,5,6,2,9,4,3,1,21,1};
        for(int i=0;i<a.length;i++){
            if(a[i]==5){
                continue;
            }
            System.out.println(a[i]);
        }
    }
}
