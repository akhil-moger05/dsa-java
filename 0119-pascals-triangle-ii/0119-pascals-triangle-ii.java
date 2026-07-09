class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        
        row.add(1); 
        
        long prev = 1;
        for (int j = 1; j <= rowIndex; j++) {

            long curr = prev * (rowIndex - j + 1) / j;
            row.add((int) curr);
            prev = curr;
        }
        
        return row;
    }
}        
        
