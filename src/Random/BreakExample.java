package Random;

public class BreakExample {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,2,1,24,5};
        for(int i=0;i<a.length;i++){
            if(a[i]==3){
                break;
            }
            System.out.println(a[i]);
        }
    }
}
