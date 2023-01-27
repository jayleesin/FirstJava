import java.util.Arrays;

public class QQQ {

	public static void main(String[] args) {
		int swap=0;
		int[] emergency= {1,2,3,4,5,6,7};
		int k=emergency.length-1;
        int[] emer= emergency.clone();
		int[] result=new int[emergency.length];
		for(int i=0; i<emergency.length; i++) {
			result[i]=i+1;
		}
		System.out.println("emer"+Arrays.toString(emer));
		System.out.println("result"+Arrays.toString(result));
        Arrays.sort(emergency);
        for(int i=0; i<emergency.length/2; i++){
                swap=emergency[i];
                emergency[i]=emergency[k];
                emergency[k]=swap;
                k--;
            }
        
        System.out.println("emergency"+Arrays.toString(emergency));
		for(int i=0; i<emergency.length; i++) {
			for(int j=0; j<emergency.length; j++) {
				if(emer[i]==emergency[j]) {
					emer[i]=result[j];
					break;
				}
			}
		}
		System.out.println("emer"+Arrays.toString(emer));
	}

}
