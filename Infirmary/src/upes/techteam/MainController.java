package upes.techteam;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import upes.techteam.dao.AppDaoImpl;
import upes.techteam.configuration.AppConfig;
import upes.techteam.models.Credentials;
import upes.techteam.models.Patient;
 
@Controller
public class MainController {
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView model = new ModelAndView("home");
		Credentials credential = new Credentials();
		model.addObject("credential", credential);
		return model;
	}

	@PostMapping("/uservalues")
	public ModelAndView display(@ModelAttribute("credential") @Valid Credentials credential, BindingResult br) {
		if (br.hasErrors()) {
			ModelAndView model = new ModelAndView("home");
			model.addObject("credential", credential);
			return model;
		} else {
			ModelAndView model = new ModelAndView("display");
			model.addObject("credential", credential);
			return model;
		}

		/*
		 * if (credential.getEmail().equals("sksingh@ddn.upes.ac.in") &&
		 * credential.getPassword().equals("upes@12345hashtag")) { ModelAndView model =
		 * new ModelAndView("display"); model.addObject("credential", credential);
		 * return model; } else { ModelAndView model = new ModelAndView("home");
		 * model.addObject("credential", credential); return model; }
		 */
	}

	@PostMapping("/patient")
	public ModelAndView finall(HttpServletRequest request) throws ParseException {
		ModelAndView model = new ModelAndView("display");
		List<Patient> patient = new ArrayList<Patient>();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AppDaoImpl dao = context.getBean("DaoBean", AppDaoImpl.class);
		boolean result= dao.insertPatient(request);
		context.close();
		return model;
	}

}
