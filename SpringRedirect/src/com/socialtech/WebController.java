package com.socialtech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
   @RequestMapping(value = "/", method = RequestMethod.GET)
   public String index() {
      return "index";
   }
   @RequestMapping(value = "/redirect", method = RequestMethod.GET)
   public String redirect() {
      return "final";
   }
   @RequestMapping(value = "/fp", method = RequestMethod.GET)
   public String fp() {
      return "finalPage";
   }
}
