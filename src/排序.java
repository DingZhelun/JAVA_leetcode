import java.util.Stack;

public class 排序 {
    public static void main(String[] args) {
        int [] a = new int[]{4,7,1,8,4,2,7,9,0,7,5,3,7,2,6,2,5,4,3,8};
        int [] temp = new int[a.length];
        排序 select = new 排序();
        select.quick_sort(a,0,a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.printf(a[i]+" ");

        }

    }
    public void insert_sort(int[] array){
        for (int i=1;i<array.length;i++){
            for (int j=0;j<i;j++){
                if (array[i]<array[j]){
                    int temp = array[i];
                    for (int k=i;k>j;k--){
                        array[k] = array[k-1];
                    }
                    array[j]=temp;
                    break;
                }
            }
        }
    }
    public void select_sort(int [] array){
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j]<min){
                    min =array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = min;

        }
    }

    public void bubble_sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public void merge_sort(int[] array, int low, int high,int[] temp){
        if (low < high){
            int mid = (low+high)/2;
            merge_sort(array,low,mid,temp);
            merge_sort(array,mid+1,high,temp);
            merge(array,low,mid,high,temp);
        }


    }

    public void merge(int[] array,int low, int mid,int high,int[] temp){
        int i=0;
        int j = low;
        int k = mid+1;
        while (j<=mid && k<=high){
            if (array[j]<array[k]){
                temp[i++] = array[j++];
            }
            else {
                temp[i++] = array[k++];
            }
        }
        while (j<=mid){
            temp[i++] = array[j++];
        }
        while (k<=high){
            temp[i++] = array[k++];
        }

        for (int t = 0; t < i; t++) {
            array[low+t] = temp[t];
        }

    }

//      递归算法
//    public void quick_sort(int[] array,int low, int high){
//        if (low>high)
//            return;
//        int temp = array[low];
//        int i = low ,j = high, t;
//
//
//        while (i<j){
//            while (array[j]>=temp && i<j)
//                j--;
//            while (array[i]<=temp && i<j)
//                i++;
//            if (i<j){
//                t = array[j];
//                array[j] = array[i];
//                array[i] = t;
//            }
//        }
//        array[low] = array[i];
//        array[i] = temp;
//
//        quick_sort(array,low,j-1);
//        quick_sort(array,j+1,high);
//
//    }

//    非递归快速排序，利用栈
//    public void quick_sort(int[] array,int low,int high){
//        Stack<Integer> s = new Stack<>();
//        s.push(low);
//        s.push(high);
//
//        while (!s.empty()){
//            high = s.pop();
//            low = s.pop();
//
//            int index = partsort(array,low,high);
//
//            if (index-1>low){
//                s.push(low);
//                s.push(index-1);
//            }
//            if (index+1<high){
//                s.push(index+1);
//                s.push(high);
//            }
//        }
//    }
//
//    public int partsort(int[] array, int low,int high){
//        int temp = array[low];
//        int flag = low;
//
//        while (low<high){
//            while (array[high]>=temp && low<high){
//                high--;
//            }
//            while (array[low]<=temp && low<high){
//                low++;
//            }
//            if (low<high){
//                int temp2 = array[low];
//                array[low] = array[high];
//                array[high] = temp2;
//            }
//        }
//        array[flag] = array[low];
//        array[low] = temp;
//
//        return low;
//    }

}
