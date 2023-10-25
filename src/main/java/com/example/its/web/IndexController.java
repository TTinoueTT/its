package com.example.its.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // コントローラには、このアノテーションをつける
public class IndexController {
    @GetMapping("/")// GET: "/" のリクエストURLとコントローラのハンドラーメソッドを紐づける
    public  String index() {
        return "index";
    }
}
