package br.com.farmacia.controller;

import java.security.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

  @GetMapping("/home")
  public String home(Principal principal, Model model) {
    model.addAttribute("usuario", principal.getName());
    return "home";
  }

}
