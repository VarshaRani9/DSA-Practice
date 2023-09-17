import java.util.ArrayDeque;

public class LargestAreaInHistogram {

//	ITERATIVE
	static int getArea(int arr[]) {
		int temp =0;
		int n = arr.length;
		for(int i =0;i<n;i++) {
			int cur = arr[i];
			// previous area
			for(int j = i-1;j>=0;j--) {
				if(arr[j]>=arr[i])cur+=arr[i];
				else break;
			}
			
			// Next Area
			for(int j = i+1;j<n;j++) {
				if(arr[j]>=arr[i])cur+=arr[i];
				else break;
			}
			temp = Math.max(temp, cur);
		}
		return temp;
	}
	
//	USING STACK
	public static int largestRectangleArea(int[] a) {
        int ps [] = previousSmaller(a);
        int ns [] = nextSmaller(a);
        int max = 0;
        for(int i = 0;i<a.length;i++){
            int width = ns[i]-ps[i]-1;
            int curArea = width*a[i];
            max = Math.max(max,curArea);
        }
        return max;
    }
    static int[] previousSmaller(int a[]){
        int ans[] = new int[a.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i =0;i<a.length;i++){
            int e = a[i];
            while(!stack.isEmpty() && a[stack.peek()]>=e)
            stack.pop();
        if(stack.isEmpty())ans[i] = -1;
        else ans[i] = stack.peek();
        stack.push(i);
        }
        return ans;
    }
    static int[] nextSmaller(int a[]){
        int ans[] = new int[a.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i =a.length-1;i>=0;i--){
            int e = a[i];
            while(!stack.isEmpty() && a[stack.peek()]>=e)
            stack.pop();
        if(stack.isEmpty())ans[i] = a.length;
        else ans[i] = stack.peek();
        stack.push(i);
        }
        return ans;
    }
	
	public static void main(String[] args) {
		int arr[] = {6,2,5,4,5,6};
		System.out.println(getArea(arr));
		System.out.println(largestRectangleArea(arr));
	}

}
