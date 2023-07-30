package BAEKJOON.star;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            for(int k=0; k<i; k++){
                sb.append(" ");
            }
            for(int j=0; j<n-i; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}