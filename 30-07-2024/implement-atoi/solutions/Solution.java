class Solution
{

  // optimized: soumyadeep
  int atoi(String s) {
    // Your code here
    char []arr=s.toCharArray();
    int ans=0;
    int c=0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[0]=='-')
        {
            if(arr[i]=='0' ||arr[i]=='1'||arr[i]=='2'||
            arr[i]=='3'||arr[i]=='4'||arr[i]=='5'||arr[i]=='6'||
            arr[i]=='7'||arr[i]=='8'||arr[i]=='9')
            {
                int a=Character.getNumericValue(arr[i]);  
                ans=(ans*10)+a;
            }
            else if(i==0 && arr[i]=='-')
                c=1;
            else
                return -1;
            
        }
        else
        {
            if(arr[i]=='0' ||arr[i]=='1'||arr[i]=='2'||
            arr[i]=='3'||arr[i]=='4'||arr[i]=='5'||arr[i]=='6'||
            arr[i]=='7'||arr[i]=='8'||arr[i]=='9')
            {
                int a=Character.getNumericValue(arr[i]);  
                ans=(ans*10)+a;
            }
            else
                return -1;
        }
        
    }
    
    if(c==1)
        ans=(-1)*ans;
    return ans;
  }
}