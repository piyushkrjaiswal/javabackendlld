package dev.pkj.javabackendlld.random1;

public class stringSearch {

    public static void main(String[] args) {

        String str = "A example of a sentence";
        String search = "amp";

        int l = str.length();
        int sl = search.length();
        int start = 0;
        int end = sl-1;
        StringBuffer st = new StringBuffer();
        for(int i=start; i<=end; i++) {
            st.append(str.charAt(i));
        }

        while(end <= l) {
            if(st.toString().equals(search)){
                System.out.println("exists");
                break;
            }
            st.deleteCharAt(0);
            start += 1;
            end += 1;
            st.append(str.charAt(end));
            System.out.println(st.toString());
        }

    }
}
