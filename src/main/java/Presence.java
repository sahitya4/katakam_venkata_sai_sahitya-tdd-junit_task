public class Presence
{
        public String finding(String s) {
            int k = 0;
            if (s.charAt(0) == 'A') {
                k = 1;
                s = s.substring(1);
            }
            if (s.charAt(1) == 'A') {
                if (k == 1) {
                    s = s.substring(2);
                } else {
                    s = s.charAt(0) + s.substring(2);
                }
            }
            return s;
        }
}
