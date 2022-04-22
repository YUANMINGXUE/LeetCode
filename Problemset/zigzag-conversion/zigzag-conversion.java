
// @Title: Z 字形变换 (ZigZag Conversion)
// @Author: 2692203539@qq.com
// @Date: 2022-03-14 18:14:00
// @Runtime: 52 ms
// @Memory: 42.9 MB

class Solution {
    public String convert(String s, int numRows) {
    char[][] str = new char[numRows][s.length()];
    int l =0,charat = 0;
    if(numRows==1)return s;
        for(int i = 0;i<Math.ceil(s.length()/(2*numRows-2)+1);i++){
            for(int h =0;h<numRows;h++){
                if(charat+h>=s.length()){
                    break;
                }
                str[h][l] = s.charAt(charat+h);
            }
            for(int h =numRows-2;h>0;h--){
                if(charat+numRows+numRows-2-h>=s.length()){
                    break;
                }
                l+=1;
                str[h][l] =s.charAt(charat+numRows+numRows-2-h);
            }
            l+=1;
            charat+=2*numRows-2;
        }
            String strs =new String();
       List<Character> list = new ArrayList<>();
        for(int i =0;i<numRows;i++){
            for (int j =0;j<s.length();j++){
                if(str[i][j]!='\u0000'){
                    list.add(str[i][j]);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char i:list){
            sb.append(i);
        }
        return new String(sb);
    }
}

