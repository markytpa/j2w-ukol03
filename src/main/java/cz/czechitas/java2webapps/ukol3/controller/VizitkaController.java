package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
//@RequestMapping("/seznam")
public class VizitkaController {
  private final List<Vizitka> vizitky;

  public VizitkaController (){
    vizitky = List.of(
            new Vizitka("Markéta První", "Prší", "Pojedeme 12", "110 00, Praha 1", "markytpa@gmail.com","654644663", null),
            new Vizitka("Jana Druhá", "Prší", "Pojedeme 32", "120 00, Praha 2", "jananana@gmail.com","755435563", "jana.net"),
            new Vizitka("Hana Třetí", "Jen", "Na Luka 92", "130 00, Praha 3", "hanananana@gmail.com","685940063", null),
            new Vizitka("Petr Čtvrtý", "Se", "Až Kukačka 10", "140 00, Praha 4", "peeeetr@gmail.com","734567563", "petro.net"),
            new Vizitka("Jan Pátý", "Leje", "Zakuká 42", "150 00, Praha 5", "janjanjan@gmail.com","659858888", null),
            new Vizitka("Jiří Šestý", "Kam", "Kukačka 33", "160 00, Praha 6", null,"73989003", null),
            new Vizitka("Eva Sedmá", "Koníčky", "Už Zakukala 54", "170 00, Praha 7", "eeevaaa@gmail.com","787466763", null)
    );
  }

  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView modelAndView = new ModelAndView("seznam");
    modelAndView.addObject("vizitky",vizitky);
    return modelAndView;
  }

  @GetMapping("/detail")
  public ModelAndView detail(int id) {
    ModelAndView modelAndView = new ModelAndView("detail");
    modelAndView.addObject("vizitka", vizitky.get(id));
    return modelAndView;
  }
}
