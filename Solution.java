
package solution;

/*
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 */
class Solution {
    public int maxArea(int[] height) {
        int p1 = 0;
        int p2 = height.length-1;
        int m_local = 0;
        int m_global = 0;
        while(p1<p2){
            if(height[p1]!=0 && height[p2]!=0){
                m_local = (p2-p1)*(Math.min(height[p1],height[p2]));
                if(m_local>m_global){
                    m_global = m_local;
                }
                if(height[p1]<height[p2]){
                    p1++;
                }
                else{
                    p2--;
                }
                
            }
            else if(height[p1]==0){
                p1++;
            }
            else{
                p2--;
            }
        }
        return(m_global);
    }
}