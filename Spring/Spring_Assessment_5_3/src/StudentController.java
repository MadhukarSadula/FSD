import org.eclipse.jst.common.internal.annotations.controller.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;


@Controller
public class StudentController {
   @RequestMapping(value = "/student", method = RequestMethod.GET)
   public ModelAndView student() {
      return new ModelAndView("student", "command", new StudentMarks());
   }
   @RequestMapping(value = "/addMarks", method = RequestMethod.POST)
      public String addMarks(@ModelAttribute("SpringWeb")StudentMarks student, 
   
   ModelMap model) {
      //model.addAttribute("science", student.getScienceMarks());
      //model.addAttribute("maths", student.getMathsMarks());
      //model.addAttribute("english", student.getEnglishMarks());
      //int results=student.getScienceMarks()+student.getMathsMarks()+student.getEnglishMarks();
      model.addAttribute("Results", student.getResults());
      return "results";
   }
}
