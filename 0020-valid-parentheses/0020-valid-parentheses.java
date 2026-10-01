class Solution {
    public boolean isValid(String s) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(40, 41);
        map.put(91, 93);
        map.put(123, 125);
        for(int i=0; i<s.length(); i++) {
            int ascii = s.charAt(i);
            if(map.containsKey(ascii)) {
                st.push(ascii);
            } else {
                if(st.isEmpty()) {
                    return false;
                }
                int val = st.pop();
                if(map.get(val) != ascii){
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}