/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

/**
 *
 * @author adamzalzal
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int p1 = 0;
        int p2 = 1;
        int temp;
        while(p2<nums.length){
            if(nums[p1]==0 && nums[p2]!=0){
                nums[p1] = nums[p2];
                nums[p2] = 0;
                p1++;
                p2++;
            }
            else if(nums[p1]== 0 && nums[p2]==0){
                p2++;
            }
            else {
                p1++;
                p2++;
            }
        }
        
        
    }

}
