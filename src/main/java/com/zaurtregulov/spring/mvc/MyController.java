package com.zaurtregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/employee")
public class MyController {

  @RequestMapping("/")
  public String showFirstView() {
    return "first-view";
  }

  @RequestMapping("/askDetails")
  public String askEmployeeDetails() {
    return "ask-emp-details-view";
  }

//  @RequestMapping("showDetails")
//  public String showEmpDetails(){
//    return "show-emp-details-view";
//  }

//  @RequestMapping("/showDetails")
//  public String showEmpDetails(HttpServletRequest request, Model model){
//
//    String empName = request.getParameter("employeeName");
//    empName = "Любезный " + empName;
//
//    model.addAttribute("nameAttr", empName);
//
//    return "show-emp-details-view";
//  }

  @RequestMapping("/showDetails")
  public String showEmpDetails(@RequestParam("employeeName") String empName, Model model){

    empName = "Любезный " + empName;

    model.addAttribute("nameAttr", empName);

    return "show-emp-details-view";
  }







}
