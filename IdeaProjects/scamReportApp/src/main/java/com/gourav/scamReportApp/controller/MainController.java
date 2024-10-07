package com.gourav.scamReportApp.controller;


import com.gourav.scamReportApp.model.Email;
import com.gourav.scamReportApp.model.Number;
import com.gourav.scamReportApp.services.EmailService;
import com.gourav.scamReportApp.services.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private NumberService numberService;
    @Autowired
    private EmailService emailService;

    @RequestMapping("/")
    public String home(){
        System.out.println("home executed");
        return "home";
    }
    @RequestMapping("/login")
    public String login(){
        System.out.println("login executed");
        return "login";
    }
    @RequestMapping("/reportNumber")
    public String reportNumber(){
        System.out.println("report number executed");
        return "reportNumber";
    }
    @RequestMapping("/reportEmail")
    public String reportEmail(){
        System.out.println("report email executed");
        return "reportEmail";
    }
    @RequestMapping("/searchNumber")
    public String searchNumber(){
        System.out.println("search number executed");
        return "searchNumber";
    }
    @RequestMapping("/searchEmail")
    public String searchEmail(){
        System.out.println("search email executed");
        return "searchEmail";
    }

    @RequestMapping("/handleReportNumber")
    public String handleReportNumber(@ModelAttribute Number number){
          numberService.reportNumber(number);
        System.out.println("handle report number executed");
        return "home";
    }
    @RequestMapping("/handleSearchNumber")
    public String handleSearchNumber (@RequestParam("number") long number, Model model){

          int count=numberService.searchNumber(number);
          model.addAttribute("count",count);
          model.addAttribute("id",number);
          System.out.println(" handle search number  executed count= "+count );
        return "displayResult";
    }


    @RequestMapping("/handleReportEmail")
    public String handleReportEmail(@ModelAttribute Email email){
        emailService.reportEmail(email);
        System.out.println("handle report Email executed");
        return "home";
    }

    @RequestMapping("/handleSearchEmail")
    public String handleSearchEmail (@RequestParam("email") String email, Model model){

        int count=emailService.searchEmail (email);
        model.addAttribute("count",count);
        model.addAttribute("id", email);
        System.out.println(" handle search email  executed count= "+count );
        return "displayResult";
    }

    @ResponseBody
    @GetMapping ("/handleSearchEmailRest")
    public String handleSearchEmailRest (@RequestParam("email") String email){

        int count=emailService.searchEmail (email);
        System.out.println(" handle search email  executed count= "+count );
        return "{\"count\":"+count+"}";
    }
}
