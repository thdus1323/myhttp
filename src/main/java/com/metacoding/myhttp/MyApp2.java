package com.metacoding.myhttp;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MyApp2 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
            //url 빨간 줄이면 try-catch로 묶어줘
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            //통신이니께 읽어야지
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream())
            );


            String download = "";
            //문자열로 받아와서??

            while (true) {
                String line = br.readLine();
                //읽어주는 것이 필요.

                if (line == null) break;
                //다 읽으면 끝내줘.

                download = download + line;
                //데이터들을 총 받아와야 하니께
            }
            //다운 잘 받아졌는지 확인, 이걸 안하면 난 중 디버깅해도 모르니께
//            System.out.println(download);

            ObjectMapper om = new ObjectMapper();
            //위의 것은 빈 생성자 필요해서 post 기본생성자 만들어줌.
            Post post = om.readValue(download, Post.class);

            System.out.println("=================");
            System.out.println("check :" +post.getTitle());
            //title 값을 불러와줘

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}


