package com.xworkz.web.componet;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.web.dto.MessageDTO;

@Component
//@RequestMapping("/")
public class MessageComponet {
	
	public MessageComponet() {
		System .out.println("created\t"+this.getClass().getSimpleName());
	}
	
	/*
	 * @RequestMapping("/onDisplay") public String onDislaying() {
	 * System.out.println("Displaying.............message"); return "/Display.jsp";
	 * }
	 */
	
	
	/*
	 * @RequestMapping("/onDisplay") public String onDislaying(HttpServletRequest
	 * request) { String message=request.getParameter("message");
	 * request.setAttribute("messageFrpmUI", message);
	 * System.out.println("Displaying.............message"); return "/Display.jsp";
	 * }
	 */
	 
	
	/*
	 * @RequestMapping("/onDisplay") public String onDisplaying(@RequestParam String
	 * message, @RequestParam int noOfChars, ModelMap model) {
	 * 
	 * System.out.println("Displaying.............message");
	 * model.addAttribute("messageFrpmUI", message+" "+noOfChars);
	 * 
	 * return "/Display.jsp";
	 * 
	 * }
	 */
	
	
	/*
	 * @RequestMapping("/onDisplay") public String onDisplayClick(MessageDTO dto,
	 * ModelMap model) { System.out.println("Message"+dto.getMessage());
	 * model.addAttribute("dto", dto); return "/Display1.jsp";
	 * 
	 * }
	 */
	
	
	
}
