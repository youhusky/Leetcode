public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList();
        for (int i = 0; i <= rowIndex; i++){
            res.add(0);
        }
        res.set(0,1);
        for(int i = 1; i<=rowIndex; i++){
            res.set(i,1);
            for (int j = i - 1; j > 0; j--){
                res.set(j, res.get(j-1)+ res.get(j));
            }
        }
        return res;
    }
}