package br.com.luizcarlospjr.springbootthymeleaf;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fatura")
public class FaturaController {


    @GetMapping("/buscar")
    public String newSearch(Model model) {
        model.addAttribute("faturaInput", new FaturaInput());
        return "buscarFatura";
    }

    @PostMapping("/buscar")
    public String search(@ModelAttribute FaturaInput faturaInput, Model model) {
        return "buscarFatura";
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @Builder
    public static class FaturaInput {

        private Long faturaId;

    }

}
