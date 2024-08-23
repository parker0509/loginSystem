//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.loginSystem.loginSystem.Controller;


import com.loginSystem.loginSystem.DTO.JoinDTO;
import com.loginSystem.loginSystem.Service.JoinService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class JoinController {
    private final JoinService joinService;

    public JoinController(JoinService joinService) {

        this.joinService = joinService;

    }


    @GetMapping("/join")
    public String signup(Model model) {

        model.addAttribute("joinDTO", new JoinDTO());
        return "join";
    }

    @PostMapping("/join")
    public String joinProcess(@ModelAttribute("joinDTO") JoinDTO joinDTO, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "join";
        }
        this.joinService.joinProcess(joinDTO);

        return "/home";

        //

    }
}
