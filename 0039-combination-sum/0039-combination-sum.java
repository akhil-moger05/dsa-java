class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(res,new ArrayList<>(),0,target,arr);
        return res;
    }
    public void backtrack(List<List<Integer>> res,List<Integer> current,int index,int target,int[] arr){
        if(target==0){
            res.add(new ArrayList<>(current));
            return;
        }
        if(index==arr.length) return;
        if(arr[index]<=target){
            current.add(arr[index]);
            backtrack(res,current,index,target-arr[index],arr);
            current.remove(current.size()-1);
        }
        backtrack(res,current,index+1,target,arr);
    }
}