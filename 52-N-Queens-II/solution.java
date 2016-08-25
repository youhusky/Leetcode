public class Solution {
    public int totalNQueens(int n) {
        ArrayList<Integer> res = new ArrayList<Integer>(); //这里不能用int类型
        res.add(0);
        helper(n,0,new int[n],res);
        return res.get(0);
    }
    //columnForRow 记录每一行中皇后的位置
    void helper(int n,int row,int[] columnForRow, ArrayList<Integer> res) 
    {	
    	if(row==n)
    	{
    		int num=res.get(0)+1;
    		res.set(0,num);
    		return;
    	}else{
    		for(int i=0;i<n;i++)
    		{
    			columnForRow[row]=i;
    			if(check(row,columnForRow))
		        {
		            helper(n,row+1,columnForRow,res);
		        }
    		}
    	}
    }

    boolean check(int row,int[] columnForRow)
    {
    	for(int i=0;i<row;i++)
    	{
    		if(columnForRow[row]==columnForRow[i] || Math.abs(columnForRow[row]-columnForRow[i])==(row-i))
    			return false;
    	}
    	return true;
    }
}