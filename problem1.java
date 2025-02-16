public class problem1 {
// Time Complexity: O(n)
// Space Complexity: O(1)
    /**
     * The read4 API is defined in the parent class Reader4.
     *     int read4(char[] buf4);
     */

    public class Solution extends Reader4 {
        /**
         * @param buf Destination buffer
         * @param n   Number of characters to read
         * @return    The number of actual characters read
         */
        char[] buf4= new char[4];
        int buf4index;
        int buf4size;
        public int read(char[] buf, int n) {
            int idx=0;
            while(idx<n)
            {
                if(buf4index<buf4size)
                {
                    buf[idx]= buf4[buf4index];
                    buf4index++;
                    idx++;
                }
                else
                {
                    buf4size = read4(buf4);
                    if(buf4size==0)
                    {
                        break;
                    }
                    buf4index=0;
                }
            }
            return idx;
        }
    }
}
