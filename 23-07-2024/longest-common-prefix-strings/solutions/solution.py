class Solution:
    def longestCommonPrefix(self, arr):
      if not arr:
        return "-1"
    
      shortest = min(arr, key=len)
    
      for i in range(len(shortest)):
        char = shortest[i]
        for string in arr:
          if string[i] != char:
            return shortest[:i] if i > 0 else "-1"
      return shortest
