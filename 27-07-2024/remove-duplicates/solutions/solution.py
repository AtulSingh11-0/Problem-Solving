class Solution:
	def removeDups(self, str):
		seen = []
		for char in list(str):
		    if not char in seen:
		        seen.append(char)
	        else:
	            continue
        ans = ''
        return ans.join(seen)

