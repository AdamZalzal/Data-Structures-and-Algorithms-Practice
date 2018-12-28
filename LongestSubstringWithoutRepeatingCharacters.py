"""
Given a string, find the length of the longest substring without repeating characters.
"""

class Solution(object):
    def lengthOfLongestSubstring(self, s):
       
        p1=0
        p2=1
        c_length= 1
        max_length = 1
        
        letters = list(s)
        if len(letters) == 0:
            return 0
        max_set = set()
        current_set =set()
        current_set.update(letters[p1])
        
        while(p2<len(letters) and p1<len(letters)):
            
            if(letters[p1]!=letters[p2]):
                if(letters[p2] in current_set):
                    current_set.remove(letters[p1])
                    p1+=1
                    if(p1==p2):
                        p2+=1
                        c_length =1
                    else:
                        c_length-=1
                else:
                    current_set.update(letters[p2])
                    p2+=1
                    c_length +=1
            else:
                
                p1+=1
                p2+=1
                
        
            if(c_length>max_length):
                max_length = c_length
           
        return(max_length)
