package com.edu.aman.chat.controller;

import com.edu.aman.chat.dto.MassageDto;
import com.edu.aman.chat.entity.Massage;
import com.edu.aman.chat.repository.MassageRepository;
import com.edu.aman.chat.sercice.MassageService;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/")
@Data
public class MainController {

    private  final MassageRepository massageRepository;
    private final MassageService massageService;

    @GetMapping
    public String getMain(Model model){
        List<Massage> massages = massageService.getAll();
        model.addAttribute("massage",massages);
        return "main";
    }

    @PostMapping
    public String getMain(Model model, MassageDto massageDto){
        String user =massageDto.getUser();
        LocalDateTime localDateTime = LocalDateTime.now();
        Massage massage = new Massage(user,massageDto.getMassage(),localDateTime);
        massageRepository.save(massage);
        List<Massage> massages = massageService.getAll();
        model.addAttribute("user",user);
        model.addAttribute("massage",massages);
        return "redirect:/";
    }

}
