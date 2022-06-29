package com.zaurtregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/showFirstView")
    public String showFirstView() {
        return "firstView";
    }

    @RequestMapping("/askDetail")
    public String askDetail(Model model) {
        model.addAttribute("employee", new Employee());
        return "askDetail";
    }

   /* @RequestMapping("/showDetail")
    public String showDetail() {
        return "showDetail";
    }
*/

    /*@RequestMapping("/showDetail")
    public String showDetail2(HttpServletRequest request, Model model) {
        String getEmpName = request.getParameter("employee");
        getEmpName = "Mr. " + getEmpName;
        model.addAttribute("getNameModel", getEmpName);
        model.addAttribute("oneMore", "java developer!");
        return "showDetail";
    }*/

    /*@RequestMapping("/showDetail")
    public String showDetail2(@RequestParam("employee") String name, Model model) {
        name = "Mr. " + name;
        model.addAttribute("model1", name);
        model.addAttribute("model2", "java developer!");
        return "showDetail";
    }*/

    @PostMapping("/showDetail")
    public String showDetail3(@Valid @ModelAttribute("employee") Employee employee, BindingResult
            bindingResult) {
       /*
       //get and change parameters
        String name = employee.getName();
        employee.setName("Mr." + name);
        String surname = employee.getSurname();
        employee.setSurname(surname + "!");
        int salary = employee.getSalary();
        employee.setSalary(salary * 100);
*/
        if (bindingResult.hasErrors()) {
            return "askDetail";
        } else {
            return "showDetail";
        }
    }
}
