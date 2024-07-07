package com.Imen.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/")
    public String appController(){
        return "Hello World";
    }
}

//echo "# dev-pipeline" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin git@github.com:Imene14/dev-pipeline.git
//git push -u origin main
