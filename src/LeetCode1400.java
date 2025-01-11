public class LeetCode1400 {

        public boolean canConstruct(String s, int k) {
            int n=s.length();
            if(n<k) return false;
            if(n==k) return true;
            int index[]=new int[26];
            for(int i=0;i<n;i++){
                index[s.charAt(i)-'a']++;
            }
            int count=0;
            for(int i=0;i<26;i++){
                if(index[i]%2!=0){
                    count++;
                    if(count>k){
                        return false;
                    }

                }
            }
            return true;

        }

}
