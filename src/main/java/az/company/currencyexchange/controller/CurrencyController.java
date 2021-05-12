package az.company.currencyexchange.controller;

import az.company.currencyexchange.dto.ObjectFactory;
import az.company.currencyexchange.dto.ValCurs;
import az.company.currencyexchange.service.CurrencyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.bind.JAXBException;

@Controller
@RequestMapping("/")
public class CurrencyController {

    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping
    public String getTemplate(Model model) throws JAXBException {
        ValCurs currencyFromAndTo = currencyService.getCurrencyFromAndTo();
        model.addAttribute("currencies", currencyFromAndTo.getValType().get(1));
        return "index";
    }
}
